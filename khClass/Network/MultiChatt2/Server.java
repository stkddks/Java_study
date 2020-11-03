package MultiChatt2;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {
 /**
  * @param args
  */
 public static void main(String[] args) {
  ServerSocket serverSocket = null;
  try{
   serverSocket = new ServerSocket(9000);
   while(true){
    Socket socket = serverSocket.accept();
    Thread thread = new PerClientThread(socket);
    thread.start();
   }
  } catch (Exception e){
   System.out.println(e.getMessage());
  }
 }
}

