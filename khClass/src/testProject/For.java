package testProject;
import java.util.Scanner;
public class For {
	public static void main(String[] args) {
		
		// 1~10 까지의 합
		int x=0;
		for (int i=1; i<=10; i++) {
			x+=i;
			
		}
		System.out.println("1~10사이의 합은?" +x);
		//End
		
		
		
		//1~10 까지의 홀수의 합
		int y=0;
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				y+=i;
			}
		}
		System.out.println("1~10 사이의 홀수의 합은?" +y);
		//End
		
		
		System.out.println("");
		System.out.println("");
		
		
		//구구단(9단)
		//int z=9;	//지정말고 입력받는 것으로
		Scanner sc = new Scanner(System.in);
		System.out.printf("몇 단을 하시겠습니까? : ");
		int z = sc.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.println(z+ "*" +i+ "=" + (z*i));
		} //End
		
		System.out.println("");
		System.out.println("");
		
		// 구구(가로)
		int count=0;
		int count1=0;
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(i+ "*" +j+ "=" +(i*j)+ "\t");
				count+=1;
			}
			System.out.println();
			count1+=1;
		}
		System.out.println();
//		System.out.println(count);
//		System.out.println(count1); 
		//End
		
		
		System.out.println("");
		System.out.println(""); 
		

		// 구구단(세로)
						
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {			
				System.out.print(j+ "*" +i+ "=" +(j*i)+"\t");		
			}
			System.out.println();		
			count1=count1+1;
		} //End
					
								
		System.out.println("");
		System.out.println("");
		
		
		//별찍기_삼각형
		for(int i=1;i<5;i++){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println("");
		} //End
		
		System.out.println("");
		System.out.println("");
		
		//별찍기_다이아몬드
		for(int i=0;i<4;i++){
			for(int j=0;j<3-i;j++){
				System.out.print(" "); 
			}
			for(int j=0;j<2*i+1;j++){
				System.out.print("*"); 
			}
			System.out.println("");
		} 
		for(int i=0;i<4;i++){
			for(int j=3;j>3-i;j--){
				System.out.print(" "); 
			}
			for(int j=8;j>2*i+1;j--){
				System.out.print("*"); 
			}
			System.out.println("");
		} //End
		
		sc.close();
	}
}

