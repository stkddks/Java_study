
// Q1. Scanner 클래스로 정수 3개를 입력 받고 3개의 숫자 중 중간 크기의 숫자를 출력하여라

package day2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력>> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int middle = 0;
		if(b<a && a<c || c<a && a<b)  {
			middle = a;
		}
		else if(a<b && b<c || c<b && b<a) {
			middle = b;
		}
		else if(a<c && c<b || b<c && c<a) {
			middle = c;
		}
		System.out.println("중간값은 " + middle);
	}

}
