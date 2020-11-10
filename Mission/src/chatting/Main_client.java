package chatting;

import javax.swing.JOptionPane;

public class Main_client {public static void main(String[] args) {
	// 사용자 GUI를 구동하기 위한 메소드
	String nickName = JOptionPane.showInputDialog("닉네임을 입력하세요.");
	new ClientGUI(nickName);
}
}
