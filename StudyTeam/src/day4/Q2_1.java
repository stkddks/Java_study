package day4;
import java.util.*;
public class Q2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str[] = {"가위", "바위", "보"};

		while(true) {
			System.out.println("당신은 무엇을 내시겠어요? (가위 / 바위 / 보)");
			System.out.print("선택 >> ");
			String sel = sc.next();
			if(sel.equals("그만")) {
				System.out.println("벌써가게?...시스템을..종료해.....");
				System.exit(0);
			}
			
			String com = null;
			int comSel = (int)(Math.random()*3);
			System.out.println("-----------승부는?--------------");
			System.out.println("당신은 " + sel);
			System.out.println("컴퓨터는 " + str[comSel]);
			System.out.println("------------↓↓↓↓↓결과↓↓↓↓↓----------------");
			
			if (str[comSel].equals("바위")) {
				if (sel.equals("가위")) {
					System.out.println("풉! 네가 짐ㅋ\n");
				}
				else if (sel.equals("보")) {
					System.out.println("쳇! 네가 이김..\n");
				}
			} else if (str[comSel].equals("가위")) {
				if (sel.equals("보")) {
					System.out.println("풉! 네가 짐ㅋ\n");
				}
				else if (sel.equals("바위")) {
					System.out.println("쳇! 네가 이김..\n");
				}
			} else if (str[comSel].equals("보")) {
				if (sel.equals("바위")) {
					System.out.println("풉! 네가 짐ㅋ\n");
				}
				else if (sel.equals("가위")) {
					System.out.println("쳇! 네가 이김..\n");
				}
			} else {
				System.out.println("비김\n");
			}
		}
	}
}
