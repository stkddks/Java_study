package chatting;

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
	
	private static final long serialVersionUID = 10000000L; // 컴파일 시 인식할 객체 고유ID
	private JTextArea jta = new JTextArea(40,25); // 채팅 창
	private JTextField jtf = new JTextField(25); // 글 입력 부분 		// 입력창의 열의 갯수가 25
	private client client = new client(); // 채팅을 담당할 백그라운드(뒷작업 영역) 선언
	private static String nickName;
	
	public JScrollPane scrollPane = new JScrollPane();		//일반 컨테이너에 해당	//컴포넌트에 스크롤기능을 제공한다
	
	public ClientGUI(String nickName){
		ClientGUI.nickName = nickName;
		
		setBounds(800, 100, 400, 600);
		jta.setFont(new Font("맑은고딕", Font.PLAIN, 18)); // 글자 폰트, 크기 변경
		setTitle("클라이언트부분");
		
		add(jta, BorderLayout.CENTER);
		add(jtf, BorderLayout.SOUTH);
		
		jtf.addActionListener(this);
		jta.setEditable(false);
		jta.setBackground(new Color(255, 250, 180));
//		jta.set
		scrollPane.setViewportView(jta);		// 스크롤페인에 jta를 부착한다는 기능
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
		// 문자 입력 창에 글을 입력 시 구동할 이벤트 설정
		String msg =nickName+":"+ jtf.getText() + "\n";
//		client.sendMessage(msg);
		jtf.setText(""); // 입력 후 내용 초기화
	}
	
	public void appendMsg(String msg) {
		jta.append(msg);
		jta.setCaretPosition(jta.getDocument().getLength());  // 맨아래로 스크롤한다
	}
	



}
 