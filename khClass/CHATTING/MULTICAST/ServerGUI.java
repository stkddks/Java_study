package MULTICAST;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerGUI extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 20000000L; // ������ �� �ν��� ��ü ����ID
	private JTextArea jta = new JTextArea(40,25); // ä�� â
	private JTextField jtf = new JTextField(25); // �� �Է� �κ�
	private ServerBackground server = new ServerBackground(); // ä���� ����� ��׶���(���۾� ����) ����
	public JScrollPane scrollPane = new JScrollPane();
	
	public ServerGUI() throws IOException{
		setBounds(200, 100, 400, 600);
		setTitle("�����κ�");
		
		jta.setEditable(false);
		jta.setFont(new Font("�������", Font.PLAIN, 18)); // ���� ��Ʈ, ũ�� ����
		jta.setBackground(new Color(230, 255, 230));
		
		add(jta, BorderLayout.CENTER);
		add(jtf, BorderLayout.SOUTH);
		jtf.addActionListener(this);
		
		// ��ũ�� ��ġ
		scrollPane.setViewportView(jta);		// ��ũ�����ο� jta�� �����Ѵٴ� ���
		add(scrollPane);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		server.setGui(this);
		server.setting(); // GUI ���� �� ������ ���� ���� ��Ų��.
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// ���� �Է� â�� ���� �Է� �� ������ �̺�Ʈ ����
		String msg = "��� : " +jtf.getText() + "\n";
		System.out.print(msg);
		server.sendMessage(msg);
		appendMsg(msg);
		jtf.setText(""); // �Է� �� ���� �ʱ�ȭ
	}
	
	public void appendMsg(String msg) {
		jta.append(msg);
	}
}
