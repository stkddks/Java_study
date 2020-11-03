package tcpMultiChatt;

import java.net.*;
import java.util.*;
import java.io.*;

public class ClientHandler extends Thread{
	private Socket client; //로그인한 클라이언트 소켓
	private TcpServerMulti server;
	private BufferedReader br;
	private PrintWriter pw;
	
	public ClientHandler(Socket client) throws IOException{
		this.client = client;
		br = new BufferedReader(new InputStreamReader(client.getInputStream()));
		pw = new PrintWriter(client.getOutputStream());
	}
	
	
	public ClientHandler(TcpServerMulti server, Socket client){
		this.server = server;
		this.client = client;
		try {
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run(){
	//한 클라이언트로 부터 메세지 읽어들임
	//읽어들인 메세지를 연결된 모든 클라이언트에게 전송함
		
		String nickName = null;
		try{
			nickName = br.readLine();
			String sendMessage = "[" + nickName + "]님이 입장하셨습니다";
			server.displayMsg(sendMessage);
			sendAll(sendMessage);
			while(true) //대화시작
			{
				String message = br.readLine();
				sendMessage = nickName + " : " + message;
				server.displayMsg(sendMessage);
				sendAll(sendMessage);
			} //해당 클라이언트가 접속종료하면 Exception 발생함.
		}catch(Exception e){
			//System.out.println(e.getMessage());
		}finally{
			String sendMessage = "[" + nickName +"]님이 퇴장하셨습니다";
			server.displayMsg(sendMessage);
			sendAll(sendMessage);
		}
	}
	
	public void sendAll(String sendMessage){
		//저장된 소켓들에 대한 출력 스트림 생성하고, 로그인한 클라이언트 모두에게
		//메세지 전송 처리 : for 문 사용
		Vector<Socket> clients = server.getClients();
		synchronized(clients){
			for(int i = 0; i < clients.size(); i++){
				ClientHandler otherClient = null;
				try {
					otherClient = new ClientHandler(clients.get(i));
					otherClient.pw.println(sendMessage);
					otherClient.pw.flush();
				} catch (IOException e) {
					e.printStackTrace();
				} finally{
					try{
						otherClient.br.close();
						otherClient.pw.close();
					}catch(IOException e){
						e.printStackTrace();
					}
				}
			}
		}
	}
}