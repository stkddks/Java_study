package ClientServerOper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

public class ServerOper {
	public static String calculator(String str) {
		StringTokenizer st = new StringTokenizer(str, " ");
		
		String result = "";
		int a = Integer.parseInt(st.nextToken());		// string 타입을 integer 타입으로 바꿔준다
		String oper = st.nextToken();
		int b = Integer.parseInt(st.nextToken());
		switch (oper) {
		case "+":
			result = Integer.toString(a + b);
			break;
		case "-":
			result = Integer.toString(a - b);
			break;
		case "*":
			result = Integer.toString(a * b);
			break;
		default : 
			result = "error";
		}
		return result;
	}

	public static void main(String[] args) {
		ServerSocket serverSock = null;
		Socket sock = null;
		
		InputStream in = null;
		OutputStream out = null;
		BufferedReader br = null;
		PrintWriter wr = null;
		
		try {
			serverSock = new ServerSocket(5000);		// 난 5000포트야. 여기서 널 기다릴께
			System.out.println("연결을 기다리고 있습니다....");
			sock = serverSock.accept();					// 어서와 난 준비가 되어있어
			System.out.println("연결되었습니다.");
			
			in = sock.getInputStream();
			out = sock.getOutputStream();
			br = new BufferedReader(new InputStreamReader(in));
			wr = new PrintWriter(new OutputStreamWriter(out));
			// br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			
			while(true) {
				String inMsg = br.readLine();
				if(inMsg.equals("bye")) {
					System.out.println("클라이언트에서 연결을 종료하였음");
					break;
				}
				System.out.println(inMsg);
				String result = calculator(inMsg);
				wr.write(result + "\n");
				wr.flush();
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
			} catch (IOException ie) {
				System.out.println("클라이언트와의 채팅 중 오류발생");
			}
		}
	}
}

