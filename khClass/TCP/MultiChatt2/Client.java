package MultiChatt2;
import java.net.Socket;

public class Client {
	public static void main(String[] args){
		if (args.length != 1){
			System.out.println("input name!");
			return;
		}
		
		try{
			Socket socket = new Socket("192.168.20.68", 9000);
			Thread thread1 = new SenderThread(socket, args[0]);
			Thread thread2 = new ReceiverThread(socket);
			thread1.start();
			thread2.start();
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}