package day4;
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		//System.out.println("=== 가위 바위 보 게임 ===");
		while(true) {
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
//		sc.close();
	}

}
