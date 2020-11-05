
package threadCount;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CountDownTest extends JFrame {		// JFrame ���� ȭ�� ����
//Field
	private JLabel label;
	private JButton startBtn;
	private JTextField numberTF;
	//����Ŭ���� : Ŭ���� �ȿ� �ۼ��� Ŭ����
	//Inner class / Nested class ��� ��
	//����Ŭ������ �ܺ�Ŭ������ ��� ������ ������ ��
	//����Ŭ�������� static, private, protected �� ��� ������
	
	
	// ������ ����
	private class CountThread extends Thread {
		@Override
		public void run() {
			int startNumber = Integer.parseInt(numberTF.getText());
			for(int count = startNumber; count >= 0; count--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				label.setText(String.valueOf(count));
			}
		}
	}
	
	
	//Constructor
	public CountDownTest() {
		
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
		new CountDownTest();
	}
}
