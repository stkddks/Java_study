package day3;

import java.util.Scanner;

public class Q7 {
	   public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("시험 본 과목의 갯수: >> ");
		   int count = sc.nextInt();
		   int arr[] = new int[count];
		   int arr2[] = new int[count];
		   for(int i=0; i<arr.length; i++) {
			   arr[i] = sc.nextInt();			 
		   }
		   
		   int sum = 0; 
		   for(int i=0; i<arr.length; i++) {
			   int temp=0;
			   if (arr[i]<arr[i+1]) {
				   temp = arr[i];
				   arr[i] = arr[i+1];
				   arr[i+1] = temp;
			   }
		   }
		   for(int i=0; i<arr2.length; i++) {
			   arr2[i] = arr[i]/arr[0]*100;
			   sum+=arr2[i];
		   }
		   System.out.println(sum);
		   
	   
	   
	   
	   }


}