package chatting;

import javax.swing.JOptionPane;

public class Main_client {public static void main(String[] args) {
	// ����� GUI�� �����ϱ� ���� �޼ҵ�
	String nickName = JOptionPane.showInputDialog("�г����� �Է��ϼ���.");
	new ClientGUI(nickName);
}
}
