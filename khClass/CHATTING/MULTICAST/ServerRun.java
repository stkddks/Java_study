package MULTICAST;

import java.io.IOException;

public class ServerRun {
	public static void main(String[] args){
		// ������ �����ϱ� ���� �޼ҵ�
		try {
			new ServerGUI();
		} catch (IOException e) {
			System.err.println(e.getMessage()+"\n���� ���α׷� ���� ����!!");
		}
	}
}