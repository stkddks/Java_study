
// TCP ECHO 클라이언트

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
		
		InputStream in = null;		// 읽어오기
		OutputStream out = null;		// 저장
		BufferedReader br = null;	// 입력	(InputStream 관련)
		PrintWriter wr = null;		// 출력 
		
		BufferedReader stdin = null;
		try {
			// ### 서버로 접속 ###
			sock = new Socket(ip, port);
			System.out.println("접속성공 !!");
			
			// ### 서버와 통신을 위한 stream, 표준입력 변수 ###	// 통신을 위해서는 반드시 스트림이 있어야한다.
			in = sock.getInputStream();
			out = sock.getOutputStream();
			br = new BufferedReader(new InputStreamReader(in));		//버퍼를 이용해 읽어오는 함수	// 서버에서 보낸 메세지를 받아오는 기능
			wr = new PrintWriter(new OutputStreamWriter(out));		// 서버에 메세지를 보내기 위한 아이
			stdin = new BufferedReader(new InputStreamReader(System.in));	// 내가 입력한 메세지를 버퍼로 읽어온다
			
			String msg = null;		
			String echo = null;
			
			// ### 서버와 통신 ###
			do {
				System.out.print("\tInsert Msg > ");
				msg = stdin.readLine();		//내가 메세지를 입력한다   //stdin객체로 버퍼를  한줄씩 읽은것을 msg변수에 저장
				
				if (msg.equals("exit")) {	// "exit" 입력으로 접속 끊기
					sock.close();
					break;
				}
				
				wr.println(msg);	// wr객체의 println 메소드를 통해 스트링msg의 내용을 버퍼에 쓴다(출력한다) 라고 생각하자  
				wr.flush();		// 현재 버퍼에 저장되어 있는 내용을 서버로 전송. 후에 버퍼를 비운다	// 버퍼가 꽉 차지 않아도 보낸다. 
				
				/*
					여기서 서버로 흐름이 넘어가고 
					서버에서 메세지를 보내면 
					아래로 내려간다.
				*/
				
				// ### 에코 메시지 출력 ###
				echo = br.readLine();		// br은 서버가 보낸 메세지를 버퍼로 통해 읽어온다.	// 그 메세지를 읽어서 echo 변수에 저장
				System.out.println("\tSERVER> " + echo);	// 서버가 보낸 메세지 보여준다
				
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
				System.out.println("종료.");
			} catch (IOException ie) {
				System.out.println(ie);
			}
		}
	}
}
