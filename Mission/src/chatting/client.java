
// Q
// ������� ������ �����ϴ� Ŭ���̾�Ʈ ������ ����
// �ͼ��� ���� Ǯ�� 

// ���⼭�� GUI�� �̿��ߴµ�
// ���� �����־������ �ȴ�.

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
         System.out.println("������ �����");
         
         out = new DataOutputStream(socket.getOutputStream());
         in = new DataInputStream(socket.getInputStream());
         
         // ���� �����ֱ�
         out.writeUTF("Fighting");
         out.writeUTF("����");
         out.writeUTF("734");
         // �������
         
         try {
        	 while(in!=null) {
        		 msg = in.readUTF();
        		 gui.appendMsg(msg);
        	 }
         }catch(EOFException e) {		// readUTF �޼ҵ尡 ���̻� ���� ��ü�� ������ �߻���Ű�� ����
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