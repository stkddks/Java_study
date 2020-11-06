package test.main;

import udpClientServer.UDPEchoClient;

public class Main_client {
	public static void main(String[] args) {
		new UDPEchoClient().clientUDP("localhost");
	}
}