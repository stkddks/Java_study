package tcpClientServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DateServer {

   public static void main(String[] args) throws IOException {
      ServerSocket ss = new ServerSocket(9100);		// 포트번호 9100 에서 클라이언트를 받겠다
      try {
         while(true) {
            Socket socket = ss.accept();		// accept() 메소드 호출
            try {
               PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
               out.println(new Date().toString());
            }finally {
               socket.close();
            }
         }
      }finally {
         ss.close();
      }

   }

}