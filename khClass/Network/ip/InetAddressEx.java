package ip;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressEx {
	public void testInetAddress(String domain) {
		
		InetAddress ip = null;
		
		try {
			
			ip = InetAddress.getByName(domain);		//�����θ�(host)�� ���� IP�ּҸ� ��´�.
			
			System.out.println("HostName : " + ip.getHostName());		//ȣ��Ʈ�� IP�ּ�
			System.out.println("HostAddress : " + ip.getHostAddress());		//ȣ��Ʈ�� �̸�
			System.out.println("HostName/HostAddress : \n\t" + ip.toString());
			System.out.println("-----------------------------------");
			
			byte[] ipAddr = ip.getAddress();		//ip�ּҸ� byte�迭�� ��ȯ
			
			System.out.println("getAddress() : " + Arrays.toString(ipAddr));	//byte�迭�� ���
			System.out.print("HostAddress : ");
			
			for(int i=0; i< ipAddr.length; i++) {
				if(ipAddr[i] < 0) {
					System.out.print(ipAddr[i]+256);	//byte������ : -128~127 
				}
				else {
					System.out.print(ipAddr[i]);
				}
				
				System.out.print(".");	// if(i!=ipAddr.length-1)result +=".";

			}
			
			System.out.println("");
			System.out.println("-----------------------------------");
			
			ip = InetAddress.getLocalHost();		//����ȣ��Ʈ�� IP�ּҸ� ��ȯ
			
			System.out.println("LocalHostName : " + ip.getHostName());		//ȣ��Ʈ�� �̸� 
			System.out.println("LocalHostAddress() : " + ip.getHostAddress());		//ȣ��Ʈ�� IP�ּ�
			System.out.println("Local HostName/HostAddress : \n\t" + ip.toString());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}