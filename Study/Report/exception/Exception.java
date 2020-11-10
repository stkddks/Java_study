
//Q
// ���� �Ʒ��� ���� �ڵ尡 ������ ���ڰ� �ƴ� ���ڸ� �Է��ϰ� �Ǹ� Exception�� �߻� �ϰ� �ǰ�, ���α׷��� ���� �Ǿ� ����
// ���ܰ� �߻��ϰ� �Ǹ�, "������ �Է����ּ���" ��� ���ڰ� ��µǰ� �������� �ִ� "�����ϼ̽��ϴ�."�� ����
// ��µ� �� �ֵ��� �ڵ带 �����Ͻÿ�

package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("ù��° �� �Է�: ");
			int su1 = sc.nextInt();
			System.out.println("�ι�° �� �Է�: ");
			int su2 = sc.nextInt();
			System.out.printf("%d + %d = %d\n", su1, su2, su1+su2);
			System.out.println("�����ϼ̽��ϴ�.");
		}
		catch(InputMismatchException e) {
			System.out.println("������ �Է����ּ���");
			System.exit(0);
		}
		sc.close();
	}
}