package UNICAST;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class NetworkTest {
	public static void main(String[] args) throws UnknownHostException {
		// InterAddress Test
		InetAddress localIP = InetAddress.getLocalHost();
		
		System.out.println(localIP.getHostAddress());	// ���� IP�ּ�
		System.out.println(localIP.getHostName());		// ���� �̸�
		
		InetAddress naverIP = InetAddress.getByName("www.naver.com");
		InetAddress[] googleIPs = InetAddress.getAllByName("www.google.com");
		
		System.out.println("���̹� ���� ip : " + naverIP.getHostAddress());		// ���̹����� IP�ּ�
		System.out.println("���� ���� ip ���� : " + googleIPs.length);			// ���ۼ��� IP�ּ�
		
		for(InetAddress ip : googleIPs)
			System.out.println(ip.getHostAddress());
	}
}