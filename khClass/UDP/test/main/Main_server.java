package test.main;

import udpClientServer.UDPEchoServer;

public class Main_server {
	public static void main(String[] args) {
		new UDPEchoServer().serverUDP(9007);
	}
}