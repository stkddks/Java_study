
// Q2.�����̸� 1, ������ �ƴϸ� 0, ����ϱ�
// ������ 4�� ����̸鼭 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.

package day2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���: ");
		int year = sc.nextInt();
		int re = 0;
		if (!(1<year && year<4000)) System.out.println("�ٽ��Է��ϼ���");
		if (year%4==0 && year%100!=0 || year%400==0) {
			re = 1;
		}
		else
			re = 0;
		System.out.println("���: " + re);
	}
}
