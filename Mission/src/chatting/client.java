
// Q
// 강사님의 서버로 접속하는 클라이언트 파일을 만들어서
// 넌센스 문제 풀기 

// 여기서는 GUI로 이용했는데
// 값을 때려넣어야지만 된다.

package chatting;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;

//import MULTICAST.ClientGUI;

public class client {
   private Socket socket;
   private DataInputStream in;
   private DataOutputStream out;
   private ClientGUI gui;
   private String msg;
   private String nickName;
   
   public void setGui(ClientGUI gui) {
      this.gui = gui;
   }
   
   public void connect() {
      try {
         socket = new Socket("192.168.20.123", 7788);
         System.out.println("서버에 연결됨");
         
         out = new DataOutputStream(socket.getOutputStream());
         in = new DataInputStream(socket.getInputStream());
         
         // 정답 때려넣기
         out.writeUTF("Fighting");
         out.writeUTF("헤드셋");
         out.writeUTF("734");
         // 여기까지
         
         try {
        	 while(in!=null) {
        		 msg = in.readUTF();
        		 gui.appendMsg(msg);
        	 }
         }catch(EOFException e) {		// readUTF 메소드가 더이상 읽은 객체가 없을때 발생시키는 에러
//        	 e.printStackTrace();
         }
      }catch(IOException e) {
    	  e.printStackTrace();
      }
   }
   
   public void sendMessage(String msg) {
      try {
         out.writeUTF(msg);
      }catch(IOException e) {
         e.printStackTrace();
      }
   }
   
   public void setNickname(String nickName) {
      this.nickName = nickName;
   }
}