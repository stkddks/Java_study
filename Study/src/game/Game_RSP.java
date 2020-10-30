package game;

import java.util.Random;
import java.util.Scanner;

public class Game_RSP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		//System.out.println("=== 가위 바위 보 게임 ===");
		
		System.out.println("당신은 무엇을 내시겠어요? (1.가위 /2.바위 /3.보)");
		
		int sel = sc.nextInt();
		String user = "";

		if (sel == 1) {
			user = "가위";
		} else if (sel == 2) {
			user = "바위";
		} else if (sel == 3) {
			user = "보";
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
		System.out.println("------------↓↓↓↓↓↓↓↓↓----------------");
		if (sel == comSel) {
			System.out.println("비김");
		} else if ((sel == 1 && comSel == 3) || (sel == 2 && comSel == 1) || (sel == 3 && comSel == 2)) {
			System.out.println("쳇! 네가 이김..");
		} else {
			System.out.println("풉! 네가 짐ㅋ");
		}
		sc.close();


	}

}
