package udpMessenger;

import java.io.IOException;
import java.net.*;
import javax.swing.*;

public class Messenger {
	
	private MyFrame f;
	private DatagramSocket socket;
	private InetAddress address = null;
	private final int myPort;
	private final int otherPort;
	
	public Messenger(int myPort, int otherPort){
		
		this.myPort = myPort;
		this.otherPort = otherPort;
		
		try {
			address = InetAddress.getByName("192.168.20.62");	// ����� IP�ּ�	//���Ǿ� IP�ּ�
			socket = new DatagramSocket(myPort);		// ���� ������ �� �ִ� ��Ʈ��ȣ
//			socket = new DatagramSocket(5000);		// �̷��� �ϸ� ���� ��Ʈ��ȣ�� ������ �� 
			f = new MyFrame(address, otherPort, socket);
		} 
		
		
		catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}
	
	
	public MyFrame getMyFrame(){
		return f;
	}
	
}
