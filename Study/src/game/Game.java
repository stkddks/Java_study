package game;

import java.util.Random;
import java.util.Scanner;

public class Game {
	
	static Scanner sc = new Scanner(System.in);
	static Random ran = new Random();
	
	public static void main(String[] args) {
		System.out.println("������ �������ּ���. 1. ����Ų��� ���� 2. ���������� ���� 3. ��������");
		int gamesel = sc.nextInt();
		switch(gamesel){
		case 1:
			Game_31();
			break;
		case 2:
			RSP();
			break;
		case 3:
			System.out.println("������ �����մϴ�.");
			System.out.println();
//			bool = false;
			break;
		}
	}
	
	public static void Game_31() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		boolean bool = true;
		int score = 0;
		int br = 1;
		
		while (bool) {
			System.out.println("����Ų��� ������ �����մϴ�");
			System.out.println("1. ���� ����");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� ��!!");
			System.out.print("���� >> ");
			
			int select = sc.nextInt();
			
			switch (select) {
			case 1:
				System.out.println("\n<<  ���� ����  >>");
				int userNum = 0;
				
				while (true) {
					System.out.println();
					System.out.println("<  �� �� �� ^^  >");
					System.out.print("�� �� �θ� ����? ");
					userNum = sc.nextInt();
					while (true) {
						if (userNum < 1 || 3 < userNum) {
							System.out.println("\n�ʹٷ� ��..���� Ʋ���ݾ�..");
							System.out.println("�ʿ��� ����� ���� 1 ~ 3������");
							System.out.println("�ٽ� ������ > ");
							userNum = sc.nextInt();
						} else if (0 < userNum && userNum < 4) {
							break;
						}
					}
					
					for (int i = 0; i < userNum; i++) {
						if (br < 32) {
							System.out.println(br + "!");
							br++;
						}
					}
					if (br > 31) {
						System.out.println("����� �����ϴ�!");
						System.out.println();
						break;
					}
					System.out.println();
					System.out.println("<  �� ���ʾ�! ��������! >");
					int comNum = r.nextInt(3) + 1;
					
					for (int i = 0; i < comNum; i++) {
						if (br < 32) {
							System.out.println(br + "!");
							br++;
						}
					}
					if (br > 31) {
						System.out.println("��..�̾���..���� ����......");
						System.out.println();
						score+=100;
						break;
					}
				}
				br=1;
				break;
				
			case 2:
				System.out.println("������ ���ھ�� " + score + "�Դϴ�.");
				System.out.println();
				// ���� Ƚ�� ��� �� ����ȭ������
				break;
			case 3:
				System.out.println("������ �����մϴ�.");
				System.out.println();
				bool = false;
				break;
				
			
			}
			
		}
	}
	
	public static void RSP() {
		while(true) {
			System.out.println("���������� ������ �����մϴ�.");
			System.out.println("����� ������ ���ðھ��? (1.���� /2.���� /3.��)");
			System.out.println("((�׸��Ͻñ� ���Ͻø� �ٸ����ڸ� �����ּ���))");
			System.out.print("���� >> ");
			int sel = sc.nextInt();
			String user = "";

			switch(sel) {
			case 1:
				user = "����";
				break;
			case 2:
				user = "����";
				break;
			case 3:
				user = "��";
				break;
			default:
				System.out.println("�ý����� �����մϴ�");
				System.exit(0);
			}	
			
			int comSel = ran.nextInt(3);
			String com = "";
			
			if (comSel == 1) {
				com = "����";
			} else if (comSel == 2) {
				com = "����";
			} else if (comSel == 3) {
				com = "��";
			}
			
			System.out.println("-----------�ºδ�?--------------");
			System.out.println("����� " + user);
			System.out.println("��ǻ�ʹ� " + com );
			System.out.println("------------��������������----------------");
			if (sel == comSel) {
				System.out.println("���\n");
			} else if ((sel == 1 && comSel == 3) || (sel == 2 && comSel == 1) || (sel == 3 && comSel == 2)) {
				System.out.println("��! �װ� �̱�..\n");
			} else {
				System.out.println("Ǳ! �װ� ����\n");
			}
		}
	}
	
	
}
