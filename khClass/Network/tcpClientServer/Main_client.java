package tcpClientServer;

public class Main_client {
	public static void main(String[] args) {
		new TCPEchoClient().clientTCP("localhost", 9007);
//		new ClientHandler().run();
	}
}
