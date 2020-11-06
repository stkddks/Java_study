package tcpClientServer;

public class Main_server {
	public static void main(String[] args) {
		new TCPEchoServer().tcpServer(9007);
	}
}

//클라이언트의 접속이 끊기면 다음 클라이언트와 소켓 연결 통신 대기상태가 된다