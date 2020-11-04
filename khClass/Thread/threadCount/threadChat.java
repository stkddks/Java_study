package threadCount;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class threadChat extends JFrame {		// JFrame 으로 화면 설정
//Field
	private JLabel label;
	private JButton startBtn;
	private JTextField numberTF;
	//내부클래스 : 클래스 안에 작성된 클래스
	//Inner class / Nested class 라고 함
	//내부클래스는 외부클래스의 멤버 개념이 적용이 됨
	//내부클래스에는 static, private, protected 가 사용 가능함
	
	public static String calculator(String str) {
		StringTokenizer st = new StringTokenizer(str, " ");
		
		String result = "";
		int a = Integer.parseInt(st.nextToken());		// string 타입을 integer 타입으로 바꿔준다
		String oper = st.nextToken();
		int b = Integer.parseInt(st.nextToken());
		switch (oper) {
		case "+":
			result = Integer.toString(a + b);
			break;
		case "-":
			result = Integer.toString(a - b);
			break;
		case "*":
			result = Integer.toString(a * b);
			break;
		default : 
			result = "error";
		}
		return result;
	}
	
	// 스레드 구현
	private class CountThread extends Thread {

		Scanner sc = new Scanner(System.in);
		
		Socket sock = null;
		
		InputStream in = null;		// 읽어오기
		OutputStream out = null;		// 저장
		BufferedReader br = null;	// 입력	(InputStream 관련)
		PrintWriter wr = null;		// 출력 
		
		@Override
		public void run() {
			String outMsg = numberTF.getText();
//			for(int count = startNumber; count >= 0; count--) {
				
				
				try {
					sock = new Socket("192.168.20.68",5000);	// 이상아
					in = sock.getInputStream();
					out = sock.getOutputStream();
					br = new BufferedReader(new InputStreamReader(in));
					wr = new PrintWriter(new OutputStreamWriter(out));
					
					while(true) {
						System.out.println("계산식(빈칸으로 띄어 입력, 예: 12 + 13)>>");
						String outMsg = sc.nextLine();
						if(outMsg.equals("bye")) {
							wr.write(outMsg+"\n");		
							wr.flush();
							break;
						}
						wr.write(outMsg+"\n");
						wr.flush();
						
						// 서버에서 넘어온 메세지 읽어서 출력
						String inMsg = br.readLine();
						label.setText(inMsg);
						System.out.println("계산결과 :" + inMsg);
					}
				} catch (IOException ie) {
					System.out.println(ie);
				} 
//				finally {
//					try {
//						br.close();
//						wr.close();
//						in.close();
//						out.close();
//						sock.close();
//					} catch (IOException ie) {
//						System.out.println("서버와의 채팅 중 오류가 발생했습니다.");
//					}
//				}
//				label.setText(String.valueOf(count));
			}
		}
//	}
	
	
	//Constructor
	public threadChat() {
		
		this.setTitle("카운트다운 프로그램");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label = new JLabel("시작");		//label.setText("Start");
		
		label.setFont(new Font("Serif", Font.BOLD, 50));
		
		label.setAlignmentX(CENTER_ALIGNMENT);
		this.add(label, BorderLayout.CENTER);
		
		startBtn = new JButton("카운트시작하기");
		this.add(startBtn, BorderLayout.SOUTH);
		//버튼에 이벤트 설정함 : 익명(Anonymus) 클래스 이용
		
		startBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//버튼을 클릭하면 스래드가 스타트되게 함
				new CountThread().start();
			}
			
		});

		numberTF = new JTextField("시작값을 입력하세요.");
		this.add(numberTF, BorderLayout.NORTH);
		this.setVisible(true);
	}
	
	
	// main
	public static void main(String[] args) {
		// 스래드를 이용한 카운트다운 테스트
		new threadChat();
	}
}
