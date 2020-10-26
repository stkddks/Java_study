
/* Q. 키보드로 정수 2개를 입력받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요 */

package mission;
import java.util.Scanner;

public class Operation {
	public static void main(String[] args) {
			
		//int sum, sub, mul, div;
			
		Scanner sc = new Scanner(System.in);
		   System.out.printf("첫번째 정수: ");
		   int a = sc.nextInt();
		   System.out.printf("두번째 정수: ");
		   int b = sc.nextInt();
		    
		   int sum = a+b;
		   int sub = a-b;
		   int mul = a*b;
		   int div = a/b;
		    
		   System.out.printf("더하기결과 : "+sum+"\n빼기결과 : "+sub+"\n곱하기결과 : " +mul+ "\n나누기결과 : "+div);
		   //System.out.printf("더하기결과 : "+sum+"\n빼기결과 : "+sub+"\n곱하기결과 : " +mul+ "\n나누기결과 : "+div);
		   sc.close();
	}
}


/* +나누기 결과를 형변환해서 얻기
 * 
 * package misson;
import java.util.Scanner;

	public class Practice3 {
		public static void main(String[] args) {
				
			//int sum, sub, mul, div;
				
			Scanner sc = new Scanner(System.in);
			   System.out.printf("첫번째 정수: ");
			   int a = sc.nextInt();
			   System.out.printf("두번째 정수: ");
			   int b = sc.nextInt();
			    
			   int sum = a+b;
			   int sub = a-b;
			   int mul = a*b;
			   double div = (double)a / (double)b;
			    
			   System.out.printf("더하기결과 : "+sum+"\n빼기결과 : "+sub+"\n곱하기결과 : " +mul+ "\n나누기결과 : "+div);
			   //System.out.printf("더하기결과 : "+sum+"\n빼기결과 : "+sub+"\n곱하기결과 : " +mul+ "\n나누기결과 : "+div);
			   sc.close();
		}
	}
 * 
 * 
 * */
