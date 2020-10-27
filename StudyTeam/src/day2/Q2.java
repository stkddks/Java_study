
// Q2.윤년이면 1, 윤년이 아니면 0, 출력하기
// 윤년은 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일 때이다.

package day2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력하세요: ");
		int year = sc.nextInt();
		int re = 0;
		if (!(1<year && year<4000)) System.out.println("다시입력하세요");
		if (year%4==0 && year%100!=0 || year%400==0) {
			re = 1;
		}
		else
			re = 0;
		System.out.println("결과: " + re);
	}
}
