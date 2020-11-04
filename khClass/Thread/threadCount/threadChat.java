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

public class threadChat extends JFrame {		// JFrame ���� ȭ�� ����
//Field
	private JLabel label;
	private JButton startBtn;
	private JTextField numberTF;
	//����Ŭ���� : Ŭ���� �ȿ� �ۼ��� Ŭ����
	//Inner class / Nested class ��� ��
	//����Ŭ������ �ܺ�Ŭ������ ��� ������ ������ ��
	//����Ŭ�������� static, private, protected �� ��� ������
	
	public static String calculator(String str) {
		StringTokenizer st = new StringTokenizer(str, " ");
		
		String result = "";
		int a = Integer.parseInt(st.nextToken());		// string Ÿ���� integer Ÿ������ �ٲ��ش�
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
	
	// ������ ����
	private class CountThread extends Thread {

		Scanner sc = new Scanner(System.in);
		
		Socket sock = null;
		
		InputStream in = null;		// �о����
		OutputStream out = null;		// ����
		BufferedReader br = null;	// �Է�	(InputStream ����)
		PrintWriter wr = null;		// ��� 
		
		@Override
		public void run() {
			String outMsg = numberTF.getText();
//			for(int count = startNumber; count >= 0; count--) {
				
				
				try {
					sock = new Socket("192.168.20.68",5000);	// �̻��
					in = sock.getInputStream();
					out = sock.getOutputStream();
					br = new BufferedReader(new InputStreamReader(in));
					wr = new PrintWriter(new OutputStreamWriter(out));
					
					while(true) {
						System.out.println("����(��ĭ���� ��� �Է�, ��: 12 + 13)>>");
						String outMsg = sc.nextLine();
						if(outMsg.equals("bye")) {
							wr.write(outMsg+"\n");		
							wr.flush();
							break;
						}
						wr.write(outMsg+"\n");
						wr.flush();
						
						// �������� �Ѿ�� �޼��� �о ���
						String inMsg = br.readLine();
						label.setText(inMsg);
						System.out.println("����� :" + inMsg);
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
//						System.out.println("�������� ä�� �� ������ �߻��߽��ϴ�.");
//					}
//				}
//				label.setText(String.valueOf(count));
			}
		}
//	}
	
	
	//Constructor
	public threadChat() {
		
		this.setTitle("ī��Ʈ�ٿ� ���α׷�");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label = new JLabel("����");		//label.setText("Start");
		
		label.setFont(new Font("Serif", Font.BOLD, 50));
		
		label.setAlignmentX(CENTER_ALIGNMENT);
		this.add(label, BorderLayout.CENTER);
		
		startBtn = new JButton("ī��Ʈ�����ϱ�");
		this.add(startBtn, BorderLayout.SOUTH);
		//��ư�� �̺�Ʈ ������ : �͸�(Anonymus) Ŭ���� �̿�
		
		startBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//��ư�� Ŭ���ϸ� �����尡 ��ŸƮ�ǰ� ��
				new CountThread().start();
			}
			
		});

		numberTF = new JTextField("���۰��� �Է��ϼ���.");
		this.add(numberTF, BorderLayout.NORTH);
		this.setVisible(true);
	}
	
	
	// main
	public static void main(String[] args) {
		// �����带 �̿��� ī��Ʈ�ٿ� �׽�Ʈ
		new threadChat();
	}
}
