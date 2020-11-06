package MULTICAST;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientBackground {
	private Socket socket;			// ������ ��ü��	// ��Ŷ�� ������
	
	private DataInputStream in;		// ��Ʈ���� �����͵��� ���
	private DataOutputStream out;
	
	private ClientGUI gui;			// GUI����
	private String msg;
	private String nickName;
	
	public void setGui(ClientGUI gui) {
		this.gui = gui;
	}
	
	//Ŭ���̾�Ʈ ���ӿ� ���� �޼ҵ�
	public void connect(){
		try {
			// ������ ������ ������ ����
			socket = new Socket("192.168.20.62", 7777);
			System.out.println("������ �����");
			
			// ������ �ְ� ���� ��,��� ��� ����
			in = new DataInputStream(socket.getInputStream());	
			out = new DataOutputStream(socket.getOutputStream());
			
			//���� �� �������� �г����� �ν�
			out.writeUTF(nickName);			// Ŭ���̾�Ʈ���� �г��� ���� �� ������ ����
			System.out.println("Client : �г��� ���ۿϷ� ");
			
			while(in!=null){ 			// �Է��� ���ڿ��� ȭ�鿡 ����ϴ� ���
				msg = in.readUTF();
				gui.appendMsg(msg);
			}
			
		} catch (IOException e) {
			//e.printStackTrace();
		}
	}
	
	public void sendMessage(String msg){
		try {
			out.writeUTF(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void setNickname(String nickName){ // �г��� Setter
		this.nickName = nickName;
	}
	
}