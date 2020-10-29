package day4;

//import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇 개? >> ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int tmp = 0;
		try {
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<i; j++) {
					arr[i] = (int)(Math.random()*100+1);
					if (arr[i]==arr[j]) {
						i--;
					}
				}
			}
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
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스가 없다우");
		}
		
			
			
	}
	
}

