
/*
 * 
 * Ű����� ���� �ΰ��� �Է� �޾� ���� ����(num1, num2)�� �����ϼ���.
�׸��� �� �ٸ� ������ �Է¹޾� �� ���� num1 ���ϰų� num2 �ʰ��̸� true�� ����ϰ� 
�ƴϸ� false�� ����ϼ���
(��, num1�� num2���� �۾ƾ� ��)

 */

package mission;
import java.util.Scanner;
public class TernaryOper2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = "true";
		String s2 = "false";
		
		System.out.printf("ù��° ����: ");
		int num1 = sc.nextInt();
		System.out.printf("�ι�° ����: ");
		int num2 = sc.nextInt();
		System.out.printf("���� ����: ");
		int num3 = sc.nextInt();
		
		System.out.println("\n��� : " );
		System.out.printf(num3<=num1 || num3>num2? s1 : s2);
		
		/*
		if(num3<=num1 || num3>num2) {
			System.out.println("��� : true");
		}else if(num1>num2){
			System.out.println("ù��° ������ �ι�° �������� �۾ƾ� �մϴ�. �ٽ� �Է��� �ּ���");
			System.out.printf("�ι�° ����: ");
			int num2 = sc.nextInt();
		}else{ 
			System.out.println("��� : false");
		}
		*/
		
		sc.close();
	}
}


