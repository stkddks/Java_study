
// Q1. Scanner Ŭ������ ���� 3���� �Է� �ް� 3���� ���� �� �߰� ũ���� ���ڸ� ����Ͽ���

package day2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 3�� �Է�>> ");
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
		System.out.println("�߰����� " + middle);
	}

}
