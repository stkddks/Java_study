package day2;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a,b,result = 0;
		String oper;
		System.out.println("연산 >> ");
		a = sc.nextFloat();
		System.out.println(" ");
		oper = sc.next();
		System.out.println(" ");
		b = sc.nextFloat();
		switch(oper) {
		case "+":
			result = a+b;
			break;
		case "-":
			result = a-b;
			break;
		case "*":
			result = a*b;
			break;
		case "/":
			if (a==0 || b==0) {
				System.out.println("0으로 나눌 수 없습니다. 시스템을 종료합니다");
				System.exit(0);
			}
			else 
				result = a/b;
			break;
		default:
			System.out.println("시스템을 종료합니다");
			System.exit(0);
				
	}
		System.out.println("결과: " + result);
}
}
