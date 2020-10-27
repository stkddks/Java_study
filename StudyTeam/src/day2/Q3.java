
// Q3. 알람 시간 H와 분 M을 입력받고 45분 일찍 설정해서 출력하세요

package day2;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = 0, M =0;
		System.out.println("시간을 입력하세요: ");
		H = sc.nextInt();
		System.out.println("분을 입력하세요: ");
		M = sc.nextInt();
		if (!(0<=H && H<=23 && 0<=M && M<=59)){
			System.out.println("다시 입력하세요. 시스템을 종료합니다");
			System.exit(0);
		}
		else {
			if (M > 45) M -= 45;
			else {
				H -= 1;
				M += (60-45);
				if (H<0) H=23;
			}
		}
		System.out.println("시간: " + H + " 분: " +M);
	}
}

