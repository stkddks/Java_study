
// Q3. �˶� �ð� H�� �� M�� �Է¹ް� 45�� ���� �����ؼ� ����ϼ���

package day2;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = 0, M =0;
		System.out.println("�ð��� �Է��ϼ���: ");
		H = sc.nextInt();
		System.out.println("���� �Է��ϼ���: ");
		M = sc.nextInt();
		if (!(0<=H && H<=23 && 0<=M && M<=59)){
			System.out.println("�ٽ� �Է��ϼ���. �ý����� �����մϴ�");
			System.exit(0);
		}
		else {
			if (M > 45) M -= 45;
			else {
				H -= 1;
				M += (60-45);
				if (H<0) H=23;
			}
		}
		System.out.println("�ð�: " + H + " ��: " +M);
	}
}

