
//Q
// Client�� �����Ͽ� ������ Server(192.168.20.123, ��Ʈ 7788)�� ���� �Ͽ� 
// ��� Ǯ����� �ϼ���. ����...... ���� ���ϱⰡ �� �������� �ϴ� �� �� ������  ���� �ɷ� �Ͻð� 

//���⼭�� �ܼ�â���� �����Ѵ�.
//���� �Է��ؼ� �ְ�޴� �ͱ��� �Ϸ�!

package client_server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Client_to_teacherServer extends Thread{
	
	class client2_sender extends Thread{
		Socket socket;
		DataOutputStream out;
		public client2_sender(Socket socket){
			this.socket = socket;
			try {
				this.out = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public void run(){
			Scanner sc = new Scanner(System.in);
			if(out != null){
				try {
					while(out != null){
						System.out.print("��ȭ �Է� : ");
						out.writeUTF(sc.nextLine());
						Thread.sleep(100);		
					}
				} 
				catch (IOException e) {
					e.printStackTrace();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	class client2_receiver extends Thread{
		Socket socket;
		DataInputStream in;
		public client2_receiver(Socket socket){
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public void run(){
			while(in != null){
				try {
					System.out.println(in.readUTF());
				} catch(EOFException e) {
					
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public Client_to_teacherServer() {
			String serverIp = "192.168.20.123";
			Scanner sc = new Scanner(System.in);
			System.out.print("��ȭ���� �Է��ϼ��� : ");
			String name = sc.nextLine();
			try {
				Socket socket = new Socket(serverIp, 7788);
				System.out.println("������ ���� �Ǿ����ϴ�.");
				Thread sender = new Thread(new client2_sender(socket));
				Thread receiver = new Thread(new client2_receiver(socket));
				sender.start();
				receiver.start();
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
