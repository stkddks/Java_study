package ip;
import java.net.*;
public class TestINetAddress {
	public static void main(String[] args) throws UnknownHostException {
// InetAddress test
		InetAddress ip1 = InetAddress.getLocalHost();		//로컬호스트의 IP주소를 반환
		
		System.out.println(ip1.getHostAddress());		//호스트의 IP주소
		System.out.println(ip1.getHostName());			//호스트의 이름
		
		InetAddress ip2 = InetAddress.getByName("www.naver.com");
		InetAddress[] ipes = ip2.getAllByName("www.google.com");	//도메인명(host)에 지정된 모든 호스트의 IP주소를 배열에 담아 반환

		System.out.println("naver : " + ip2.getHostAddress());
		System.out.println("google 의 서버는 " + ipes.length + "개 있습니다.");
		
		for(InetAddress ip : ipes)
			System.out.println(ip.getHostAddress());
		
		InetAddress[] ipes2 = InetAddress.getAllByName("www.naver.com");
		System.out.println("naver 의 서버 ip는" + ipes2.length + "개 있습니다.");
		
		for(InetAddress ip : ipes2)
			System.out.println(ip.getHostAddress());
	}
}