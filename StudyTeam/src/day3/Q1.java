package day3;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int arr2[] = new int[100];
		System.out.println("���� ���� 10���� �Է��ϼ���: ");
 		for (int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
 		}
 		for (int i=0; i<arr.length; i++) {
 			if(arr[i]%3==0) {
 				arr2[i] = arr[i];
 				System.out.printf(arr2[i]+" ");
 			}
 		}
 		sc.close();
	}
}
