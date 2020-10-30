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
			System.out.println("베스킨라빈스 게임을 시작합니다");
			System.out.println("1. 게임 시작");
			System.out.println("2. 게임 저장");
			System.out.println("3. 게임 끝!!");
			System.out.print("선택 >> ");

			int select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println("\n<<  게임 시작  >>");
				int userNum = 0;

				while (true) {
					System.out.println();
					System.out.println("<<  너 차 례 ^^  >>");
					System.out.print("몇 개 부를 꺼야? ");
					userNum = sc.nextInt();
					while (true) {
						if (userNum < 1 || 3 < userNum) {
							System.out.println("\n쪽바로 해..수가 틀렸잖아..");
							System.out.println("너에게 허락된 수는 1 ~ 3까지야");
							System.out.println("다시 선택해 > ");
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
						System.out.println("당신이 졌습니다!");
						System.out.println();
						break;
					}
					System.out.println();
					System.out.println("<<  내 차례야! 조용히해! >>");
					int comNum = r.nextInt(3) + 1;

					for (int i = 0; i < comNum; i++) {
						if (br < 32) {
							System.out.println(br + "!");
							br++;
						}
					}
					if (br > 31) {
						System.out.println("헐..미안해..내가 졌어......");
						System.out.println();
						score++;
						break;
					}
				}
				br=1;
				break;

			case 2:
				System.out.println("귀하의 스코어는 " + score + "입니다.");
				System.out.println();
				// 맞춘 횟수 출력 후 선택화면으로
				break;

			case 3:
				System.out.println("게임을 종료합니다.");
				System.out.println();
				bool = false;
				break;
			}

		}
	}
}