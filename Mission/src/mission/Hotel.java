
//ȣ�� ���α׷� �����

package mission;
import java.util.*;
public class Hotel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] room = new boolean[10];	// �� ũ�� ���� (�⺻�� false) 
		while(true) {
			int roomNum = 0;	
			System.out.println("ȣ�ڰ��� ���α׷� v1.0");
			System.out.println("1.�Խ�	2.���	3.�溸��	4.����");
			System.out.printf("���� > ");
			int selct = sc.nextInt();

			switch(selct) {
			case 1: 
				System.out.print("�� �� �濡 �Խ��Ͻðڽ��ϱ�? ");
				roomNum = sc.nextInt() - 1;
				
				if (room[roomNum]) {		//true �϶� = ���� ���ִ�
					System.out.println((roomNum + 1) + "�� ���� �̹� �մ��� ��ʴϴ�.");
					System.out.println();
					break;
				}
				room[roomNum] = true;
				System.out.println((roomNum + 1) + "�� �濡 �Խ��ϼ̽��ϴ�.");
				System.out.println();
				
				
				try {
					Thread.sleep(1000); //1�� ���
					} catch (InterruptedException e) {
						e.printStackTrace();
						}
				break;
				
			case 2:
				System.out.print("�� �� �濡�� ����Ͻðڽ��ϱ�? ");
				int outroomNum = sc.nextInt() - 1;
				
				if (!room[outroomNum]) {	//false �϶�
					System.out.println("�����Ͻ� " + (outroomNum + 1) + "�� ���� �̹� ����ֽ��ϴ�.");
					System.out.println();
					break;
				}
				room[outroomNum] = false;
				System.out.println((outroomNum + 1) + "�� �濡�� ����ϼ̽��ϴ�.");
				System.out.println();
				try {
					Thread.sleep(1000); //1�� ���
					} catch (InterruptedException e) {
						e.printStackTrace();
						}
				break;
				
			case 3: 
				for (int i = 0; i < room.length; i++) {
					if (room[i]) {
						System.out.println("\t" + (i + 1) + "�� ���� ���� �մ��� �ֽ��ϴ�.");
					} else {
						System.out.println("\t" + (i + 1) + "�� ���� ���� ����ֽ��ϴ�.");
					}
				}
				System.out.println();
				try {
					Thread.sleep(1000); //1�� ���
					} catch (InterruptedException e) {
						e.printStackTrace();
						}
				break;
				
			case 4: 
				System.out.println("���α׷��� �����մϴ�!");
				sc.close();
				return;
			default:
				System.out.println("���������� �Է��Դϴ�.");
			}
		}
	}
}
