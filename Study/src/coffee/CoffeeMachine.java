package coffee;
import java.util.Scanner;
public class CoffeeMachine {
	Scanner sc = new Scanner(System.in);
	boolean power = false;
	Coffee coffee = new Coffee();

	public void main() {
		// 진행용 메소드
		while (true) {
			System.out.println("--------------------");
			System.out.println("--1.메뉴판 보기-----");
			System.out.println("--2.전원------------");
			System.out.println("--3.주문하기--------");
			System.out.println("--4.종료------------");
			System.out.println("--------------------");
			System.out.print("------------선택 > ");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				showMenu();
				break;
			case 2:
				power();
				break;
			case 3:
				order();
				break;
			case 4:
				return;
			// 위 메인 메소드를 종료하면서 프로그램을 종료하게 됨.
			}
		}
	}

	public void showMenu() {
		System.out.println("\n----------원 두 목 록----------");
		System.out.println("----에티오피아-----------------");
		System.out.println("----케냐-----------------------");
		System.out.println("----콜롬비아-------------------");
		System.out.println("----과테말라-------------------");
		System.out.println("-------------------------------");
		System.out.println("----------커 피 종 류----------");
		System.out.println("----에스프레소-----------------");
		System.out.println("----아메리카노-----------------");
		System.out.println("----카페라떼-------------------");
		System.out.println("----카페모카-------------------");
		System.out.println("-------------------------------");
		System.out.println("----------음 료 크 기----------");
		System.out.println("----Tall : 12 / Grande : 17----");
		System.out.println("-------------------------------");
		System.out.println();
		System.out.println();
	}

	public void power() {
		if (power == true) {
			System.out.println("전원이 꺼졌습니다.[☆]\n");
		} else {
			System.out.println("전원이 켜졌습니다.[★]\n");
		}
		power = !power;
	}

	public void order() {
		while (true) {
			if (power) {
				System.out.println("\n-------------커 피 주 문-------------");
				System.out.print("\n------커피 온도 선택 < 1.ICE / 2.HOT >");
				int tempSel = sc.nextInt();
				String temp = "";
				if (tempSel == 1) {
					temp = "ICE";
				} else {
					temp = "HOT";
				}
				coffee.setCoffeeTemp(temp);

				System.out.print("\n------커피 원두 선택");
				System.out.println("에티오피아");
				System.out.println("케냐");
				System.out.println("콜롬비아");
				System.out.println("과테말라");
				System.out.print("선택 > ");
				coffee.setCoffeeBeanName(sc.next());

				System.out.println("\n------커피 선택");
				System.out.println("에스프레소");
				System.out.println("아메리카노");
				System.out.println("카페라떼");
				System.out.println("카페모카");
				System.out.print("선택 > ");
				coffee.setCoffeeName(sc.next());

				boolean bool = true;
				String coffeeSize = "";

				while (bool) {
					System.out.println("\n------커피 사이즈 선택");
					System.out.println("12oz or Tall");
					System.out.println("17oz or Grande");
					System.out.print("선택 > ");
					sc.nextLine();
					// 아래의 nextLine()이 위에서 입력한 Enter를 입력받으므로, 범퍼와 같은 역할을 하는 nextLine을 하나 넣어준다.
					coffeeSize = sc.nextLine();

					if (coffeeSize.equals("12oz") || coffeeSize.equals("17oz") || coffeeSize.equals("Tall") || coffeeSize.equals("Grande")) {
						bool = false;
					} else {
						// 정해진 사이즈 이외의 선택을 했을 경우 메시지를 전달하고 다시 입력 받는다.
						System.out.println("잘못된 사이즈를 입력하셨습니다.");
						System.out.println("작은 사이즈를 원하시면 12oz 혹은 Tall을 입력하여 주시고,");
						System.out.println("큰 사이즈를 원하시면 17oz 혹은 Grande을 입력하여 주세요");
					}
				}

				coffee.setCoffeeSize(coffeeSize);
				System.out.println(coffeeSize + "를 선택하셨습니다.");

				System.out.println("\n--------수량 입력");
				System.out.print("> ");
				coffee.setCoffeeCount(sc.nextInt());

				System.out.println("\n--------주문 정보 확인");
				System.out.println("온도 : " + coffee.getCoffeeTemp());
				System.out.println("원두 : " + coffee.getCoffeeBeanName());
				System.out.println("종류 : " + coffee.getCoffeeName());
				System.out.println("사이즈 : " + coffee.getCoffeeSize());
				System.out.println("수량 : " + coffee.getCoffeeCount());
				System.out.print("주문하신 정보가 맞으면 1 / 다시 주문은 2 를 눌러주세요 > ");
				int sel = sc.nextInt();

				if (sel == 1) {
					System.out.println("주문이 완료되었습니다.");
					break;
				} else {
					continue;
					// 커피 주문의 첫 단계로 다시 올라간다.
				}

			} else {
				System.out.println("전원이 꺼져있습니다!!!");
				System.out.println("전원을 먼저 켜주세요.\n");
				return;
				// order 메소드 종료.
			}
		}
	}
}

