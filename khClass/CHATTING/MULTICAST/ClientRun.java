package MULTICAST;
import javax.swing.JOptionPane;
public class ClientRun {
	public static void main(String[] args) {
		// ����� GUI�� �����ϱ� ���� �޼ҵ�
		String nickName = JOptionPane.showInputDialog("�г����� �Է��ϼ���.");
		new ClientGUI(nickName);
	}
}