package udpMessenger;

//import java.net.DatagramSocket;
import javax.swing.JOptionPane;

public class Run {
	
	public static void main(String[] args) {
		
		int myPort = Integer.parseInt(JOptionPane.showInputDialog("����� ��Ʈ��ȣ���Է��ϼ���"));
		int otherPort = Integer.parseInt(JOptionPane.showInputDialog("���� ��Ʈ ��ȣ�� �Է��ϼ���"));
		
		Messenger a = new Messenger(myPort, otherPort);
		MyFrame f = a.getMyFrame();
		
		f.process();
		
	}
	
}