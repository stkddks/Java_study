package day3;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�迭�� ũ�⸦ �Է��ϼ���: ");
		int size = sc.nextInt();
		System.out.println("������ �Ǵ� ���� �Է�: ");
		int sel = sc.nextInt();
		int A[] = new int[size];
		System.out.println("10���� ������ �Է��ϼ���: ");
		for(int i=0; i<A.length; i++) {
			A[i] = sc.nextInt();
		}
		for(int i=0; i<A.length; i++) {
			if(A[i]<sel) {
				System.out.print(A[i] + " ");
//				System.out.print(sel+"���� ���� ���� ���: "+A[i]);
			}
		
		}
		sc.close();
	}
}
