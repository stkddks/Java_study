package game;
import java.util.Random;
import java.util.Scanner;

public class Game_31{
	public static void main(String[] args) {
		BR();
	}
	public static void BR() {
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
					System.out.println("<<  �� �� �� ^^  >>");
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
					System.out.println("<<  �� ���ʾ�! ��������! >>");
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
						score++;
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
}