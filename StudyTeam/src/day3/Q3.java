package day3;

//import java.util.Random;
import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 몇 개? >> ");
		int sel = sc.nextInt();
		
		int arr[] = new int[sel];
//		Random ran = new Random();
		
		int sum = 0;
		double avg = 0;
		for (int i=0; i<arr.length; i++) {
//			int comSel = ran.nextInt(100); 
			arr[i] = (int)(Math.random()*100+1);	; 
			System.out.print(arr[i]+ " ");
			sum += arr[i];
			avg = sum/sel;
		}
		System.out.println("\n평균은: " +avg);
		sc.close();
	}
}
