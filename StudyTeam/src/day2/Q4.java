

/*
 
 * 2차원 평면에서 직사각형은 두 점으로 표현된다.(EX. (x1, y1), (x2, y2))
키보드로부터 직사각형을 구성하는 두점 (x1, y1), (x2, y2)를 입력받아 (100, 100), (200, 200)의
두 점으로 이루어진 직사각형과 충돌하는지 판별하는 프로그램을 작성하세요.
만일 충돌한다면 "직사각형과 충돌합니다." 충돌하지 않는다면 "충돌하지 않습니다"를 출력하세요.
추가적으로 이 문제는 충돌여부를 판단하는 inRect메소드를 구현하여 구현하시오.
(힌트! public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2)
 
 */

// 한점만 입력받는 경우

package day2;

import java.util.Scanner;

public class Q4 {
	static boolean a = true;
	public static boolean inRect (int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if (100<x && x<200 && 100<y && y<200) {
			return a = true;
		}
		else 
			return a = false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 한점만 입력받는 경우
		System.out.println("좌표를 입력하세요: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		inRect(x,y,100,100,200,200);
		if (a) {
			System.out.println("직사각형과 충돌합니다");
		}
		else 
			System.out.println("충돌하지 않습니다");
	}
}
