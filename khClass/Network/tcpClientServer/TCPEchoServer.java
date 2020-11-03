
// TCP ECHO ����

package tcpClientServer;

import java.io.*;
import java.net.*;

public class TCPEchoServer {
	public void tcpServer(int port) {
		
		// ���� ���� ���� ��ü
		ServerSocket serverSock = null;
		
		Socket sock = null;
//		InetAddress inetAddr = null;
		
		// ����� ��ü
		InputStream in = null;
		OutputStream out = null;
		BufferedReader br = null;
		PrintWriter wr = null;
		try {
			// ���� ���� ����
			serverSock = new ServerSocket(port);
			while (true) {
				// Ŭ���̾�Ʈ�� ���� ���
				System.out.println("====== Ŭ���̾�Ʈ ���� ��� ��"+
						"(port:" + serverSock.getLocalPort() + ")=====");
				sock = serverSock.accept();		// Ŭ���̾�Ʈ�� ���� sock�� �ִ�.
			
				// Ŭ���̾�Ʈ�� ���� ��û
//				inetAddr = serverSock.getInetAddress();
				System.out.println("Ŭ���̾�Ʈ(" + sock.getInetAddress().getHostAddress() + ") ����");	// inetAddr.getHostAddress() ���� ��ħ
				
				// Ŭ���̾�Ʈ�� ����� ���� stream ����
				in = sock.getInputStream();
				out = sock.getOutputStream();
				br = new BufferedReader(new InputStreamReader(in));
				wr = new PrintWriter(new OutputStreamWriter(out));
				String msg = null;
				
				/*
				 	Ŭ���̾�Ʈ���� �޼����� ������
				 	�Ʒ��� ������ �����Ѵ�.
				 */
				
				// Ŭ���̾�Ʈ�� ���
				while ((msg = br.readLine()) != null) {				// Ŭ���̾�Ʈ���� flush ���ָ� ���� 
					System.out.println("\tCLIENT> " + msg);			// msg������� ������ msg���
					wr.println(msg);	// Ŭ���̾�Ʈ���� ���� �޼��� ���ۿ� ����
					wr.flush();		// ������ ������ ������ // Ŭ���̾�Ʈ�� br�� �д´�
				}
				
				/*
				 	���⼭ �ٽ� Ŭ���̾�Ʈ�� �帧�� �Ѿ��
				 	Ŭ���̾�Ʈ���� �޼����� �ٽ� ������ 
				 	while�� �ٽõ���
				 */
				
			}
		} catch (IOException ie) {
			System.out.println(ie);
		} finally {
			try {
				br.close();
				wr.close();
				in.close();
				out.close();
				sock.close();
				serverSock.close();
				System.out.println("����.");
			} catch (IOException ie) {
				System.out.println(ie);
			}
		}
	}
}
