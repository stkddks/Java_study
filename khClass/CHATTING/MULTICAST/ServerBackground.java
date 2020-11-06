package MULTICAST;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ServerBackground {
	
	// ##### �ʵ� ���� #####
	private ServerSocket serverSocket; 		// ���� ����
	private Socket socket; 		// �޾ƿ� ���� ����
	private ServerGUI gui;		// GUI�κ�
	private String msg;
	private int count; 		// ���� ������ ���� ���� ����
	
	
	// ##### ����ڵ��� ������ �����ϴ� �� ��ü ���� #####
	// [�г���, ������(�޼���)]
	private Map<String, DataOutputStream> clientMap = new HashMap<String, DataOutputStream>();
	public void setGui(ServerGUI gui) {
		this.gui = gui;
	}
	

	// ##### ���� ���� �� ���� ���� ���� #####
	public void setting() {
		try {

			// ����ڵ��� ���� ���� �� �� �� ������ ���������� ����� �� �ְ� ����ȭ
			// ����ȭ �ؾ� �ϳ��� ���μ����� ���� (�� ����� �޼����� ���������� ���̴°���)
			Collections.synchronizedMap(clientMap);	
			
			// ������ ��Ʈ ��ȣ ����
			serverSocket = new ServerSocket(7777);
			
			while (true) {
				// �湮�ڸ� ���Ѿ��� �޾� ��Ƽ������� ���
				System.out.println("������ ��� ��.....");
				socket = serverSocket.accept(); // ���⼭ Ŭ���̾�Ʈ ����
				System.out.println(socket.getInetAddress() + "���� �����߽��ϴ�.");
			
				// ���ο� ������� ������ ���Ͽ� ��� ������� �����Ѵ�.
				Receiver receiver = new Receiver(socket);
				receiver.start();		// start()�� ������Ŭ������ �޼ҵ�	
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	// ##### �޼��� ������ BroadCasting ������� ���� #####
	public void sendMessage (String msg){
		// Iterator�� �������̽� - �ڹ��� �÷��� �����ӿ�ũ���� �÷��ǿ� ����Ǿ� �ִ� ��ҵ��� �о���� ���
		Iterator<String> iterator = clientMap.keySet().iterator(); 	// keySet() ���� ����ó��
		String key = "";
		
		while(iterator.hasNext()){ 			// �� ����� ���� ��ü���� �ϳ��� ó��
			key = iterator.next();			// ���⼭ key���� ����� �г����� �Ǵ°���
			try{
				clientMap.get(key).writeUTF(msg);		// �ش� key���� ��Ī�Ǵ� msg���(����ض�)
			} catch(IOException e){
				// e.printStackTrace();
			}
		}
	}
	
	
	
	// ##### �ʿ� ����� ������ �����ϰ� ȭ�鿡 ���� ������ ǥ���ϴ� �޼ҵ� #####
	public void addClient(String nick, DataOutputStream out) throws IOException{
		String message=nick + "���� �����ϼ̽��ϴ�.\n";
		sendMessage(message);
		gui.appendMsg(message);
		clientMap.put(nick, out);		// �ؽøʿ� ����ڴг��Ӱ� �޼��� ¦���� ����(put)
		System.out.println(">>> ���� ������ : "+(++count));
	}
	

	// ##### �ʿ� ����� ������ �����ϰ� ȭ�鿡 ���� ������ ǥ���ϴ� �޼ҵ� #####
	public void removeClient(String nick){
		String message=nick + "���� �����̽��ϴ�. \n";
		sendMessage(message);
		gui.appendMsg(message);
		clientMap.remove(nick);
		System.out.println(">>> ���� ������ : "+(--count));
	}
	

	

	
	
	
	// ------------------���ù�---------------------------
	class Receiver extends Thread {

		//
		private DataInputStream in; 		// ����ڰ� ������ �����͸� �о� ���̴� ��� ����
		private DataOutputStream out; 		// ����ڿ��� �����͸� ����� ��� ����
		private String nick;

		// ����� ������ �޾� Thread�� ���� ������ ����
		public Receiver(Socket socket) {
			try {
				out = new DataOutputStream(socket.getOutputStream());
				in = new DataInputStream(socket.getInputStream());
				nick = in.readUTF();
				addClient(nick,out);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		@Override
		public void run() {
			try { 						// �Է��� ���ڿ��� ȭ�鿡 ����ϴ� ���
				while (in != null) {
					msg = in.readUTF();	// UTF ���ڼ����� �о� ���� �޼ҵ�
					sendMessage(msg);
					gui.appendMsg(msg);
				}
			} catch (Exception e) {

				//����ڰ� ���� ����, �� GUI ���� �� ������ ���� �ۼ�
				removeClient(nick);
		}
	}
}
}
