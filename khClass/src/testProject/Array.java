package testProject;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		
		int a[] = new int[3];
		a[0] = 4;
		a[1] = 10;
		a[2] = 15;
		for (int i=0; i<a.length; i++) {
			System.out.println("a[" +i+ "] = " +a[i]);
		} //End
		

		int b[] = new int[100];
		int sum =0;
		for (int i=0; i<100; i++) {
			b[i] = i+1;
			sum += b[i];
		}
		System.out.println("배열 b의 모든 원소의 합은?" +sum);
		//End
		
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			System.out.println("저장데이터 : ");
			arr[i] = sc.nextInt();
			System.out.println("arr[" +i+ "] = " +arr[i]);
		}
		sc.close();
		//End
		
	}
}
