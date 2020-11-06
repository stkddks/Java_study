package MULTICAST;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientGUI extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 10000000L; // ������ �� �ν��� ��ü ����ID
	private JTextArea jta = new JTextArea(40,25); // ä�� â
	private JTextField jtf = new JTextField(25); // �� �Է� �κ� 		// �Է�â�� ���� ������ 25
	private ClientBackground client = new ClientBackground(); // ä���� ����� ��׶���(���۾� ����) ����
	private static String nickName;
	
	public JScrollPane scrollPane = new JScrollPane();		//�Ϲ� �����̳ʿ� �ش�	//������Ʈ�� ��ũ�ѱ���� �����Ѵ�
	
	public ClientGUI(String nickName){
		ClientGUI.nickName = nickName;
		
		setBounds(800, 100, 400, 600);
		jta.setFont(new Font("�������", Font.PLAIN, 18)); // ���� ��Ʈ, ũ�� ����
		setTitle("Ŭ���̾�Ʈ�κ�");
		
		add(jta, BorderLayout.CENTER);
		add(jtf, BorderLayout.SOUTH);
		
		jtf.addActionListener(this);
		jta.setEditable(false);
		jta.setBackground(new Color(255, 250, 180));
//		jta.set
		scrollPane.setViewportView(jta);		// ��ũ�����ο� jta�� �����Ѵٴ� ���
//		scrollPane.setColumnHeaderView(jta);
		add(scrollPane);
//		scrollPane.setBounds();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		client.setGui(this);
		client.setNickname(nickName);
		client.connect();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// ���� �Է� â�� ���� �Է� �� ������ �̺�Ʈ ����
		String msg =nickName+":"+ jtf.getText() + "\n";
		client.sendMessage(msg);
		jtf.setText(""); // �Է� �� ���� �ʱ�ȭ
	}
	
	public void appendMsg(String msg) {
		jta.append(msg);
		jta.setCaretPosition(jta.getDocument().getLength());  // �ǾƷ��� ��ũ���Ѵ�
	}
	



}
 