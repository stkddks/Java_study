
// Q 수식 계산 서버-클라이언트 만들기 실습.
// 서버와 클라이언트는 1:1 통신을 한다. 서버를 먼저 실행시킥 클라이언트를 실행시켜 서버에 접속
// 클라이언트는 사용자로부터 수식을 입력받아 서버로 전송. 연산자는 +, -, * 의 3가지만 허용하고 정수 연산만 가능
// 서버가 식을 받으면 식을 서버의 화면에 출력하고, 게산하여 결과를 믈라이언트로 전송
// 클라이언트는 서버로부터 받은 답을 화면에 출력. 
// 클라어언트와 서버는 전송할 데이터를 문자열로 만들고 "\n"을 것붙여 전송하며, 라인 단위로 송수신
// 클라이언트가 "bye"를 보내면 양쪽 모두 종료

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