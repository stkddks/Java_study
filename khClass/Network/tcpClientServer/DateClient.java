package tcpClientServer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DateClient {

   public static void main(String[] args) throws IOException {
      Socket s = new Socket("192.168.20.68",9100);
      //�־��� IP address�� ��Ʈ�� ������ ���� ����   //ip�ּ��� port�ױ��� ����  
      
      BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));	// ������ �����Ͱ��� �޾ƿ�
      String res = input.readLine();	// ������ �о����
      System.out.println(res);
      System.exit(0);
   }

}