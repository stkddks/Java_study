package tcpClientServer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DateClient {

   public static void main(String[] args) throws IOException {
      Socket s = new Socket("192.168.20.68",9100);
      //주어진 IP address와 포트를 가지고 소켓 생성   //ip주소의 port항구로 들어간다  
      
      BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));	// 서버의 데이터값을 받아옴
      String res = input.readLine();	// 데이터 읽어오기
      System.out.println(res);
      System.exit(0);
   }

}