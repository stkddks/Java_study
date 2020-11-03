package ip;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressEx {
	public void testInetAddress(String domain) {
		
		InetAddress ip = null;
		
		try {
			
			ip = InetAddress.getByName(domain);		//도메인명(host)을 통해 IP주소를 얻는다.
			
			System.out.println("HostName : " + ip.getHostName());		//호스트의 IP주소
			System.out.println("HostAddress : " + ip.getHostAddress());		//호스트의 이름
			System.out.println("HostName/HostAddress : \n\t" + ip.toString());
			System.out.println("-----------------------------------");
			
			byte[] ipAddr = ip.getAddress();		//ip주소를 byte배열로 반환
			
			System.out.println("getAddress() : " + Arrays.toString(ipAddr));	//byte배열을 출력
			System.out.print("HostAddress : ");
			
			for(int i=0; i< ipAddr.length; i++) {
				if(ipAddr[i] < 0) {
					System.out.print(ipAddr[i]+256);	//byte범위는 : -128~127 
				}
				else {
					System.out.print(ipAddr[i]);
				}
				
				System.out.print(".");	// if(i!=ipAddr.length-1)result +=".";

			}
			
			System.out.println("");
			System.out.println("-----------------------------------");
			
			ip = InetAddress.getLocalHost();		//로컬호스트의 IP주소를 반환
			
			System.out.println("LocalHostName : " + ip.getHostName());		//호스트의 이름 
			System.out.println("LocalHostAddress() : " + ip.getHostAddress());		//호스트의 IP주소
			System.out.println("Local HostName/HostAddress : \n\t" + ip.toString());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}