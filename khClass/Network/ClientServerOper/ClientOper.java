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
		
		InputStream in = null;		// 읽어오기
		OutputStream out = null;		// 저장
		BufferedReader br = null;	// 입력	(InputStream 관련)
		PrintWriter wr = null;		// 출력 
		
		try {
			sock = new Socket("192.168.20.68",5000);	// 이상아
			in = sock.getInputStream();
			out = sock.getOutputStream();
			br = new BufferedReader(new InputStreamReader(in));
			wr = new PrintWriter(new OutputStreamWriter(out));
			
			while(true) {
				System.out.println("계산식(빈칸으로 띄어 입력, 예: 12 + 13)>>");
				String outMsg = sc.nextLine();
				if(outMsg.equals("bye")) {
					wr.write(outMsg+"\n");		
					wr.flush();
					break;
				}
				wr.write(outMsg+"\n");
				wr.flush();
				
				// 서버에서 넘어온 메세지 읽어서 출력
				String inMsg = br.readLine();
				System.out.println("계산결과 :" + inMsg);
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
				System.out.println("서버와의 채팅 중 오류가 발생했습니다.");
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
//					System.out.println("서버와의 채팅 중 오류가 발생했습니다.");
//				}
//		}