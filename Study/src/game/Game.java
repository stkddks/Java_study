package game;

import java.util.Random;
import java.util.Scanner;

public class Game {
	
	static Scanner sc = new Scanner(System.in);
	static Random ran = new Random();
	
	public static void main(String[] args) {
		System.out.println("게임을 선택해주세요. 1. 베스킨라빈스 게임 2. 가위바위보 게임 3. 게임종료");
		int gamesel = sc.nextInt();
		switch(gamesel){
		case 1:
			Game_31();
			break;
		case 2:
			RSP();
			break;
		case 3:
			System.out.println("게임을 종료합니다.");
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
					System.out.println("<  너 차 례 ^^  >");
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
					System.out.println("<  내 차례야! 조용히햇! >");
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
						score+=100;
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
	
	public static void RSP() {
		while(true) {
			System.out.println("가위바위보 게임을 시작합니다.");
			System.out.println("당신은 무엇을 내시겠어요? (1.가위 /2.바위 /3.보)");
			System.out.println("((그만하시길 원하시면 다른숫자를 눌러주세요))");
			System.out.print("선택 >> ");
			int sel = sc.nextInt();
			String user = "";

			switch(sel) {
			case 1:
				user = "가위";
				break;
			case 2:
				user = "바위";
				break;
			case 3:
				user = "보";
				break;
			default:
				System.out.println("시스템을 종료합니다");
				System.exit(0);
			}	
			
			int comSel = ran.nextInt(3);
			String com = "";
			
			if (comSel == 1) {
				com = "가위";
			} else if (comSel == 2) {
				com = "바위";
			} else if (comSel == 3) {
				com = "보";
			}
			
			System.out.println("-----------승부는?--------------");
			System.out.println("당신은 " + user);
			System.out.println("컴퓨터는 " + com );
			System.out.println("------------↓↓↓↓↓결과↓↓↓↓↓----------------");
			if (sel == comSel) {
				System.out.println("비김\n");
			} else if ((sel == 1 && comSel == 3) || (sel == 2 && comSel == 1) || (sel == 3 && comSel == 2)) {
				System.out.println("쳇! 네가 이김..\n");
			} else {
				System.out.println("풉! 네가 짐ㅋ\n");
			}
		}
	}
	
	
}
