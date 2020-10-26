
/*
 * 
 * 키보드로 정수 두개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
그리고 또 다른 정수를 입력받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고 
아니면 false를 출력하세요
(단, num1은 num2보다 작아야 함)

 */

package mission;
import java.util.Scanner;
public class TernaryOper2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = "true";
		String s2 = "false";
		
		System.out.printf("첫번째 정수: ");
		int num1 = sc.nextInt();
		System.out.printf("두번째 정수: ");
		int num2 = sc.nextInt();
		System.out.printf("비교할 정수: ");
		int num3 = sc.nextInt();
		
		System.out.println("\n결과 : " );
		System.out.printf(num3<=num1 || num3>num2? s1 : s2);
		
		/*
		if(num3<=num1 || num3>num2) {
			System.out.println("결과 : true");
		}else if(num1>num2){
			System.out.println("첫번째 정수가 두번째 정수보다 작아야 합니다. 다시 입력해 주세요");
			System.out.printf("두번째 정수: ");
			int num2 = sc.nextInt();
		}else{ 
			System.out.println("결과 : false");
		}
		*/
		
		sc.close();
	}
}


