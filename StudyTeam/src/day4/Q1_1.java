package day4;

//import java.util.Arrays;
import java.util.Scanner;

public class Q1_1 {

	int arr[];
	int tmp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇 개? >> ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		remove(arr);
		sort(arr);
	}
	
	public static void remove(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				arr[i] = (int)(Math.random()*100+1);
				if (arr[i]==arr[j]) {
					i--;
				}
			}
		}
		
	}
	
	public static void sort(int arr[]) {
		int tmp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
			System.out.println(arr[i]);
		}
	}
}



	
			


