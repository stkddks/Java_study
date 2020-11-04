package ClientServerOper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientOper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Socket sock = null;
		
		InputStream in = null;		// �о����
		OutputStream out = null;		// ����
		BufferedReader br = null;	// �Է�	(InputStream ����)
		PrintWriter wr = null;		// ��� 
		
		try {
			sock = new Socket("192.168.20.68",5000);	// �̻��
			in = sock.getInputStream();
			out = sock.getOutputStream();
			br = new BufferedReader(new InputStreamReader(in));
			wr = new PrintWriter(new OutputStreamWriter(out));
			
			while(true) {
				System.out.println("����(��ĭ���� ��� �Է�, ��: 12 + 13)>>");
				String outMsg = sc.nextLine();
				if(outMsg.equals("bye")) {
					wr.write(outMsg+"\n");		
					wr.flush();
					break;
				}
				wr.write(outMsg+"\n");
				wr.flush();
				
				// �������� �Ѿ�� �޼��� �о ���
				String inMsg = br.readLine();
				System.out.println("����� :" + inMsg);
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
			} catch (IOException ie) {
				System.out.println("�������� ä�� �� ������ �߻��߽��ϴ�.");
			}
		}
	}
}











//		catch(IOException e) {
//			System.out.println(e.getMessage());
//		}finally {
//				try {
//					sc.close();
//					if(sock!=null)
//					sock.close();
//				} catch (IOException e) {
//					System.out.println("�������� ä�� �� ������ �߻��߽��ϴ�.");
//				}
//		}