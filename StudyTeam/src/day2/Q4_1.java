
/*
 * 2차원 평면에서 직사각형은 두 점으로 표현된다.(EX. (x1, y1), (x2, y2))
키보드로부터 직사각형을 구성하는 두점 (x1, y1), (x2, y2)를 입력받아 (100, 100), (200, 200)의
두 점으로 이루어진 직사각형과 충돌하는지 판별하는 프로그램을 작성하세요.
만일 충돌한다면 "직사각형과 충돌합니다." 충돌하지 않는다면 "충돌하지 않습니다"를 출력하세요.
추가적으로 이 문제는 충돌여부를 판단하는 inRect메소드를 구현하여 구현하시오.
(힌트! public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2)
 
 */


// 두점을 입력받는 경우

package day2;

import java.util.Scanner;

public class Q4_1 {
	static boolean a = true;
	public static boolean inRect (int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		
		if (100<rectx1 && rectx1<200 && 100<recty1 && recty1<200 || 100<rectx2 && rectx2<200 && 100<recty2 && recty2<200) {
			return a = true;
		}
		else
			return a = false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 점을 입력하세요 ");
		System.out.println("첫번째 점: ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("두번째 점: ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		inRect(100,200,x1,y1,x2,y2);
		
		if (a) {
			System.out.println("직사각형과 충돌합니다");
		}
		else 
			System.out.println("충돌하지 않습니다");
		//
	}
}
