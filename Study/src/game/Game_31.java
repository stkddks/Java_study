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
			System.out.println("베스킨라빈스 게임을 시작합니다");
			System.out.println("1. Game Start");
//			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("선택 > ");

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
							System.out.println("수를 잘못 입력하셨습니다.");
							System.out.print("1 ~ 3까지의 수 중에서 선택해 주십시오 > ");
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
					System.out.println("<<  Computer Turn  >>");
					int comNum = r.nextInt(3) + 1;

					for (int i = 0; i < comNum; i++) {
						if (br < 32) {
							System.out.println(br + "!");
							br++;
						}
					}
					if (br > 31) {
						System.out.println("컴퓨터가 졌습니다!");
						System.out.println();
						score++;
						break;
					}
				}
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