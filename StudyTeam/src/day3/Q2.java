package day3;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 크기를 입력하세요: ");
		int size = sc.nextInt();
		System.out.println("기준이 되는 정수 입력: ");
		int sel = sc.nextInt();
		int A[] = new int[size];
		System.out.println("10개의 정수를 입력하세요: ");
		for(int i=0; i<A.length; i++) {
			A[i] = sc.nextInt();
		}
		for(int i=0; i<A.length; i++) {
			if(A[i]<sel) {
				System.out.print(A[i] + " ");
//				System.out.print(sel+"보다 작은 정수 출력: "+A[i]);
			}
		
		}
		sc.close();
	}
}
