

/*
 
 * 2���� ��鿡�� ���簢���� �� ������ ǥ���ȴ�.(EX. (x1, y1), (x2, y2))
Ű����κ��� ���簢���� �����ϴ� ���� (x1, y1), (x2, y2)�� �Է¹޾� (100, 100), (200, 200)��
�� ������ �̷���� ���簢���� �浹�ϴ��� �Ǻ��ϴ� ���α׷��� �ۼ��ϼ���.
���� �浹�Ѵٸ� "���簢���� �浹�մϴ�." �浹���� �ʴ´ٸ� "�浹���� �ʽ��ϴ�"�� ����ϼ���.
�߰������� �� ������ �浹���θ� �Ǵ��ϴ� inRect�޼ҵ带 �����Ͽ� �����Ͻÿ�.
(��Ʈ! public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2)
 
 */

// ������ �Է¹޴� ���

package day2;

import java.util.Scanner;

public class Q4 {
	static boolean a = true;
	public static boolean inRect (int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if (100<x && x<200 && 100<y && y<200) {
			return a = true;
		}
		else 
			return a = false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ������ �Է¹޴� ���
		System.out.println("��ǥ�� �Է��ϼ���: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		inRect(x,y,100,100,200,200);
		if (a) {
			System.out.println("���簢���� �浹�մϴ�");
		}
		else 
			System.out.println("�浹���� �ʽ��ϴ�");
	}
}
