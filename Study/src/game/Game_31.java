package game;
import java.util.Random;
import java.util.Scanner;

public class Game_31{
	public static void main(String[] args) {
		
		
	}
	public void br() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		boolean bool = true;
		int score = 0;
		int br = 1;

		while (bool) {
			System.out.println("����Ų��� ������ �����մϴ�");
			System.out.println("1. Game Start");
//			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("���� > ");

			int select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println("<<  Game Start  >>");
				int userNum = 0;

				while (true) {
					System.out.println();
					System.out.println("<<  Your Turn  >>");
					System.out.print("Input Number< 1 ~ 3 > ");
					userNum = sc.nextInt();
					while (true) {
						if (userNum < 1 || 3 < userNum) {
							System.out.println("���� �߸� �Է��ϼ̽��ϴ�.");
							System.out.print("1 ~ 3������ �� �߿��� ������ �ֽʽÿ� > ");
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
					System.out.println("<<  Computer Turn  >>");
					int comNum = r.nextInt(3) + 1;

					for (int i = 0; i < comNum; i++) {
						if (br < 32) {
							System.out.println(br + "!");
							br++;
						}
					}
					if (br > 31) {
						System.out.println("��ǻ�Ͱ� �����ϴ�!");
						System.out.println();
						score++;
						break;
					}
				}
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
}