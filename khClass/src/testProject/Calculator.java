
/*간단한 계산기*/
// 수 두개 입력 받고 연산자 입력 받고 계산결과 출력

package testProject;
import java.util.*;

public class Calculator {
	public static void main(String[] args) {
		
		Calculator2 c = new Calculator2();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("연산을 입력하세요(+,-,*,/): ");
		char operand = sc.next().charAt(0);
		
		System.out.print("숫자 1개를 입력하세요: ");
		double num1=sc.nextDouble();
		System.out.print("숫자 1개를 입력하세요: ");
		double num2=sc.nextDouble();
		
		switch(operand) {
		case '+':
			//double sum = num1 + num2;
			double sum = c.sum(num1, num2);
			System.out.printf(num1+ " + " +num2+ " = " +sum);
			break;
		case '-':
			//double sub = num1 - num2;
			double sub = c.sub(num1, num2);
			System.out.printf(num1+ " - " +num2+ " = " +sub);
			break;
		case '*':
			//double mul = num1 * num2;
			double mul = c.mul(num1, num2);
			System.out.printf(num1+ " * " +num2+ " = " +mul);
			break;
		case '/':
			//double div = num1 / num2;
			double div = c.div(num1, num2);
			if (num2==0) {
				System.out.printf("0을 나눌 수는 없습니다");
			}
			else{
				System.out.printf(num1+ " / " +num2+ " = " +div);
			}
			break;
//		case "%":
//			double rem = num1 % num2;
//			System.out.printf(num1+ " % " +num2+ " = " +rem);
//			break;
		}
		sc.close();
	}
}


//double sum = num1+num2;

//if(operand=="+") {
//	double result = num1 + num2;
//	System.out.println("두 수의 합은" +result);
//}
//else if(operand=="-") {
//	System.out.printf(num1+ "-" + num2+ "=" +(num1-num2));
//}
//else if(operand=="*") {
//	System.out.printf(num1+ "*" + num2+ "=" +(num1*num2));
//}
//else if(operand=="/") {
//	if (num2==0) {
//		System.out.printf("0을 나눌 수는 없습니다");
//	}
//	else{
//		System.out.printf(num1+ "/" + num2+ "=" +(num1/num2));
//	}
//}




