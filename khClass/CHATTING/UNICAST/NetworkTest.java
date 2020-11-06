package UNICAST;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class NetworkTest {
	public static void main(String[] args) throws UnknownHostException {
		// InterAddress Test
		InetAddress localIP = InetAddress.getLocalHost();
		
		System.out.println(localIP.getHostAddress());	// 나의 IP주소
		System.out.println(localIP.getHostName());		// 나의 이름
		
		InetAddress naverIP = InetAddress.getByName("www.naver.com");
		InetAddress[] googleIPs = InetAddress.getAllByName("www.google.com");
		
		System.out.println("네이버 서버 ip : " + naverIP.getHostAddress());		// 네이버서버 IP주소
		System.out.println("구글 서버 ip 갯수 : " + googleIPs.length);			// 구글서버 IP주소
		
		for(InetAddress ip : googleIPs)
			System.out.println(ip.getHostAddress());
	}
}