package day2;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a,b,result = 0;
		String oper;
		System.out.println("���� >> ");
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
				System.out.println("0���� ���� �� �����ϴ�. �ý����� �����մϴ�");
				System.exit(0);
			}
			else 
				result = a/b;
			break;
		default:
			System.out.println("�ý����� �����մϴ�");
			System.exit(0);
				
	}
		System.out.println("���: " + result);
}
}
