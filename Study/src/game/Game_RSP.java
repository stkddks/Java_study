package game;

import java.util.Random;
import java.util.Scanner;

public class Game_RSP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		//System.out.println("=== ���� ���� �� ���� ===");
		
		System.out.println("����� ������ ���ðھ��? (1.���� /2.���� /3.��)");
		
		int sel = sc.nextInt();
		String user = "";

		if (sel == 1) {
			user = "����";
		} else if (sel == 2) {
			user = "����";
		} else if (sel == 3) {
			user = "��";
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
		System.out.println("------------����������----------------");
		if (sel == comSel) {
			System.out.println("���");
		} else if ((sel == 1 && comSel == 3) || (sel == 2 && comSel == 1) || (sel == 3 && comSel == 2)) {
			System.out.println("��! �װ� �̱�..");
		} else {
			System.out.println("Ǳ! �װ� ����");
		}
		sc.close();


	}

}
