package coffee;
import java.util.Scanner;
public class CoffeeMachine {
	Scanner sc = new Scanner(System.in);
	boolean power = false;
	Coffee coffee = new Coffee();

	public void main() {
		// ����� �޼ҵ�
		while (true) {
			System.out.println("--------------------");
			System.out.println("--1.�޴��� ����-----");
			System.out.println("--2.����------------");
			System.out.println("--3.�ֹ��ϱ�--------");
			System.out.println("--4.����------------");
			System.out.println("--------------------");
			System.out.print("------------���� > ");
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
			// �� ���� �޼ҵ带 �����ϸ鼭 ���α׷��� �����ϰ� ��.
			}
		}
	}

	public void showMenu() {
		System.out.println("\n----------�� �� �� ��----------");
		System.out.println("----��Ƽ���Ǿ�-----------------");
		System.out.println("----�ɳ�-----------------------");
		System.out.println("----�ݷҺ��-------------------");
		System.out.println("----���׸���-------------------");
		System.out.println("-------------------------------");
		System.out.println("----------Ŀ �� �� ��----------");
		System.out.println("----����������-----------------");
		System.out.println("----�Ƹ޸�ī��-----------------");
		System.out.println("----ī���-------------------");
		System.out.println("----ī���ī-------------------");
		System.out.println("-------------------------------");
		System.out.println("----------�� �� ũ ��----------");
		System.out.println("----Tall : 12 / Grande : 17----");
		System.out.println("-------------------------------");
		System.out.println();
		System.out.println();
	}

	public void power() {
		if (power == true) {
			System.out.println("������ �������ϴ�.[��]\n");
		} else {
			System.out.println("������ �������ϴ�.[��]\n");
		}
		power = !power;
	}

	public void order() {
		while (true) {
			if (power) {
				System.out.println("\n-------------Ŀ �� �� ��-------------");
				System.out.print("\n------Ŀ�� �µ� ���� < 1.ICE / 2.HOT >");
				int tempSel = sc.nextInt();
				String temp = "";
				if (tempSel == 1) {
					temp = "ICE";
				} else {
					temp = "HOT";
				}
				coffee.setCoffeeTemp(temp);

				System.out.print("\n------Ŀ�� ���� ����");
				System.out.println("��Ƽ���Ǿ�");
				System.out.println("�ɳ�");
				System.out.println("�ݷҺ��");
				System.out.println("���׸���");
				System.out.print("���� > ");
				coffee.setCoffeeBeanName(sc.next());

				System.out.println("\n------Ŀ�� ����");
				System.out.println("����������");
				System.out.println("�Ƹ޸�ī��");
				System.out.println("ī���");
				System.out.println("ī���ī");
				System.out.print("���� > ");
				coffee.setCoffeeName(sc.next());

				boolean bool = true;
				String coffeeSize = "";

				while (bool) {
					System.out.println("\n------Ŀ�� ������ ����");
					System.out.println("12oz or Tall");
					System.out.println("17oz or Grande");
					System.out.print("���� > ");
					sc.nextLine();
					// �Ʒ��� nextLine()�� ������ �Է��� Enter�� �Է¹����Ƿ�, ���ۿ� ���� ������ �ϴ� nextLine�� �ϳ� �־��ش�.
					coffeeSize = sc.nextLine();

					if (coffeeSize.equals("12oz") || coffeeSize.equals("17oz") || coffeeSize.equals("Tall") || coffeeSize.equals("Grande")) {
						bool = false;
					} else {
						// ������ ������ �̿��� ������ ���� ��� �޽����� �����ϰ� �ٽ� �Է� �޴´�.
						System.out.println("�߸��� ����� �Է��ϼ̽��ϴ�.");
						System.out.println("���� ����� ���Ͻø� 12oz Ȥ�� Tall�� �Է��Ͽ� �ֽð�,");
						System.out.println("ū ����� ���Ͻø� 17oz Ȥ�� Grande�� �Է��Ͽ� �ּ���");
					}
				}

				coffee.setCoffeeSize(coffeeSize);
				System.out.println(coffeeSize + "�� �����ϼ̽��ϴ�.");

				System.out.println("\n--------���� �Է�");
				System.out.print("> ");
				coffee.setCoffeeCount(sc.nextInt());

				System.out.println("\n--------�ֹ� ���� Ȯ��");
				System.out.println("�µ� : " + coffee.getCoffeeTemp());
				System.out.println("���� : " + coffee.getCoffeeBeanName());
				System.out.println("���� : " + coffee.getCoffeeName());
				System.out.println("������ : " + coffee.getCoffeeSize());
				System.out.println("���� : " + coffee.getCoffeeCount());
				System.out.print("�ֹ��Ͻ� ������ ������ 1 / �ٽ� �ֹ��� 2 �� �����ּ��� > ");
				int sel = sc.nextInt();

				if (sel == 1) {
					System.out.println("�ֹ��� �Ϸ�Ǿ����ϴ�.");
					break;
				} else {
					continue;
					// Ŀ�� �ֹ��� ù �ܰ�� �ٽ� �ö󰣴�.
				}

			} else {
				System.out.println("������ �����ֽ��ϴ�!!!");
				System.out.println("������ ���� ���ּ���.\n");
				return;
				// order �޼ҵ� ����.
			}
		}
	}
}

