
/* Q. Ű����� ���� 2���� �Է¹޾� �� ���� ��, ��, ��, �������� ���� ����ϼ��� */

package mission;
import java.util.Scanner;

public class Operation {
	public static void main(String[] args) {
			
		//int sum, sub, mul, div;
			
		Scanner sc = new Scanner(System.in);
		   System.out.printf("ù��° ����: ");
		   int a = sc.nextInt();
		   System.out.printf("�ι�° ����: ");
		   int b = sc.nextInt();
		    
		   int sum = a+b;
		   int sub = a-b;
		   int mul = a*b;
		   int div = a/b;
		    
		   System.out.printf("���ϱ��� : "+sum+"\n������ : "+sub+"\n���ϱ��� : " +mul+ "\n�������� : "+div);
		   //System.out.printf("���ϱ��� : "+sum+"\n������ : "+sub+"\n���ϱ��� : " +mul+ "\n�������� : "+div);
		   sc.close();
	}
}


/* +������ ����� ����ȯ�ؼ� ���
 * 
 * package misson;
import java.util.Scanner;

	public class Practice3 {
		public static void main(String[] args) {
				
			//int sum, sub, mul, div;
				
			Scanner sc = new Scanner(System.in);
			   System.out.printf("ù��° ����: ");
			   int a = sc.nextInt();
			   System.out.printf("�ι�° ����: ");
			   int b = sc.nextInt();
			    
			   int sum = a+b;
			   int sub = a-b;
			   int mul = a*b;
			   double div = (double)a / (double)b;
			    
			   System.out.printf("���ϱ��� : "+sum+"\n������ : "+sub+"\n���ϱ��� : " +mul+ "\n�������� : "+div);
			   //System.out.printf("���ϱ��� : "+sum+"\n������ : "+sub+"\n���ϱ��� : " +mul+ "\n�������� : "+div);
			   sc.close();
		}
	}
 * 
 * 
 * */
