package tcpClientServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DateServer {

   public static void main(String[] args) throws IOException {
      ServerSocket ss = new ServerSocket(9100);		// ��Ʈ��ȣ 9100 ���� Ŭ���̾�Ʈ�� �ްڴ�
      try {
         while(true) {
            Socket socket = ss.accept();		// accept() �޼ҵ� ȣ��
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