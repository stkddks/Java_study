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
			address = InetAddress.getByName("192.168.20.62");	// 상대의 IP주소	//성권쓰 IP주소
			socket = new DatagramSocket(myPort);		// 내가 설정할 수 있는 포트번호
//			socket = new DatagramSocket(5000);		// 이렇게 하면 내가 포트번호를 지정한 것 
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
