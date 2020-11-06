package tcpMultiChatt;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class TcpServerMulti {
	private HashMap<String, ServerUser> users; //회원 정보 저장용
	private Vector<Socket> clients; //로그인한 클라이언트 소켓들 저장용
	public TcpServerMulti(){
		users = new HashMap<String, ServerUser>();
		ServerUser[] userList = new ServerUser[]{
				new ServerUser("user01", "pass01", "smileman"),
				new ServerUser("user02", "pass02", "prittywoman"),
				new ServerUser("user03", "pass03", "javajjang"),
				new ServerUser("test123", "test123", "testboy"),
				new ServerUser("p1234", "p1234", "pick")};
		for(ServerUser u : userList)
			users.put(u.getUserId(), u);
	}
	public Map<String, ServerUser> getUsers(){
		return users;
	}
	public Vector<Socket> getClients(){
		return clients;
	}
	public String loginCheck(String id, String pwd){
		String nickName = null;
		if(users.containsKey(id)){
			ServerUser loginUser = users.get(id);
			if(loginUser.getUserPwd().equals(pwd))
				nickName = loginUser.getNickName();
		}
		return nickName;
	}
	public void displayMsg(String clientMessage){
		System.out.println(clientMessage);
	}
	public static void main(String[] args){
		TcpServerMulti tServer = new TcpServerMulti();
		int port = 7979;
		ServerSocket server;
		try {
			server = new ServerSocket(port);
			while(true){
				Socket client = server.accept();
				tServer.clients.addElement(client);
				new ClientHandler(tServer, client).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
