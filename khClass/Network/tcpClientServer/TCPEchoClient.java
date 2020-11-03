
// TCP ECHO Ŭ���̾�Ʈ

package tcpClientServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPEchoClient {
	public void clientTCP(String ip, int port) {
		
		Socket sock = null;
		
		InputStream in = null;		// �о����
		OutputStream out = null;		// ����
		BufferedReader br = null;	// �Է�	(InputStream ����)
		PrintWriter wr = null;		// ��� 
		
		BufferedReader stdin = null;
		try {
			// ### ������ ���� ###
			sock = new Socket(ip, port);
			System.out.println("���Ӽ��� !!");
			
			// ### ������ ����� ���� stream, ǥ���Է� ���� ###	// ����� ���ؼ��� �ݵ�� ��Ʈ���� �־���Ѵ�.
			in = sock.getInputStream();
			out = sock.getOutputStream();
			br = new BufferedReader(new InputStreamReader(in));		//���۸� �̿��� �о���� �Լ�	// �������� ���� �޼����� �޾ƿ��� ���
			wr = new PrintWriter(new OutputStreamWriter(out));		// ������ �޼����� ������ ���� ����
			stdin = new BufferedReader(new InputStreamReader(System.in));	// ���� �Է��� �޼����� ���۷� �о�´�
			
			String msg = null;		
			String echo = null;
			
			// ### ������ ��� ###
			do {
				System.out.print("\tInsert Msg > ");
				msg = stdin.readLine();		//���� �޼����� �Է��Ѵ�   //stdin��ü�� ���۸�  ���پ� �������� msg������ ����
				
				if (msg.equals("exit")) {	// "exit" �Է����� ���� ����
					sock.close();
					break;
				}
				
				wr.println(msg);	// wr��ü�� println �޼ҵ带 ���� ��Ʈ��msg�� ������ ���ۿ� ����(����Ѵ�) ��� ��������  
				wr.flush();		// ���� ���ۿ� ����Ǿ� �ִ� ������ ������ ����. �Ŀ� ���۸� ����	// ���۰� �� ���� �ʾƵ� ������. 
				
				/*
					���⼭ ������ �帧�� �Ѿ�� 
					�������� �޼����� ������ 
					�Ʒ��� ��������.
				*/
				
				// ### ���� �޽��� ��� ###
				echo = br.readLine();		// br�� ������ ���� �޼����� ���۷� ���� �о�´�.	// �� �޼����� �о echo ������ ����
				System.out.println("\tSERVER> " + echo);	// ������ ���� �޼��� �����ش�
				
			} while (msg != null);
			
		} catch (IOException ie) {
			System.out.println(ie);
		} finally {
			try {
				stdin.close();
				br.close();
				wr.close();
				in.close();
				out.close();
				sock.close();
				System.out.println("����.");
			} catch (IOException ie) {
				System.out.println(ie);
			}
		}
	}
}
