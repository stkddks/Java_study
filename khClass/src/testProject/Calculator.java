
/*������ ����*/
// �� �ΰ� �Է� �ް� ������ �Է� �ް� ����� ���

package testProject;
import java.util.*;

public class Calculator {
	public static void main(String[] args) {
		
		Calculator2 c = new Calculator2();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���(+,-,*,/): ");
		char operand = sc.next().charAt(0);
		
		System.out.print("���� 1���� �Է��ϼ���: ");
		double num1=sc.nextDouble();
		System.out.print("���� 1���� �Է��ϼ���: ");
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
				System.out.printf("0�� ���� ���� �����ϴ�");
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
//	System.out.println("�� ���� ����" +result);
//}
//else if(operand=="-") {
//	System.out.printf(num1+ "-" + num2+ "=" +(num1-num2));
//}
//else if(operand=="*") {
//	System.out.printf(num1+ "*" + num2+ "=" +(num1*num2));
//}
//else if(operand=="/") {
//	if (num2==0) {
//		System.out.printf("0�� ���� ���� �����ϴ�");
//	}
//	else{
//		System.out.printf(num1+ "/" + num2+ "=" +(num1/num2));
//	}
//}




