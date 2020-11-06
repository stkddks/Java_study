
// TCP ECHO 서버

package tcpClientServer;

import java.io.*;
import java.net.*;

public class TCPEchoServer {
	public void tcpServer(int port) {
		
		// 서버 소켓 관련 객체
		ServerSocket serverSock = null;
		
		Socket sock = null;
//		InetAddress inetAddr = null;
		
		// 입출력 객체
		InputStream in = null;
		OutputStream out = null;
		BufferedReader br = null;
		PrintWriter wr = null;
		try {
			// 서버 소켓 생성
			serverSock = new ServerSocket(port);
			while (true) {
				// 클라이언트의 접속 대기
				System.out.println("====== 클라이언트 접속 대기 중"+
						"(port:" + serverSock.getLocalPort() + ")=====");
				sock = serverSock.accept();		// 클라이언트의 정보 sock에 있다.
			
				// 클라이언트의 접속 요청
//				inetAddr = serverSock.getInetAddress();
				System.out.println("클라이언트(" + sock.getInetAddress().getHostAddress() + ") 접속");	// inetAddr.getHostAddress() 말고 고침
				
				// 클라이언트와 통신을 위한 stream 생성
				in = sock.getInputStream();
				out = sock.getOutputStream();
				br = new BufferedReader(new InputStreamReader(in));
				wr = new PrintWriter(new OutputStreamWriter(out));
				String msg = null;
				
				/*
				 	클라이언트에서 메세지를 보내면
				 	아래의 내용을 수행한다.
				 */
				
				// 클라이언트와 통신
				while ((msg = br.readLine()) != null) {				// 클라이언트에서 flush 해주면 실행 
					System.out.println("\tCLIENT> " + msg);			// msg비어있지 않으면 msg출력
					wr.println(msg);	// 클라이언트에게 보낼 메세지 버퍼에 쓴다
					wr.flush();		// 버퍼의 내용을 보낸다 // 클라이언트의 br이 읽는다
				}
				
				/*
				 	여기서 다시 클라이언트로 흐름이 넘어간다
				 	클라이언트에서 메세지를 다시 보내면 
				 	while문 다시돈다
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
				System.out.println("종료.");
			} catch (IOException ie) {
				System.out.println(ie);
			}
		}
	}
}
