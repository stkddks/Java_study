
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

public class Q4_1 {
	static boolean a = true;
	public static boolean inRect (int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		
		if (100<rectx1 && rectx1<200 && 100<recty1 && recty1<200 || 100<rectx2 && rectx2<200 && 100<recty2 && recty2<200) {
			return a = true;
		}
		else
			return a = false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է��ϼ��� ");
		System.out.println("ù��° ��: ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("�ι�° ��: ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		inRect(100,200,x1,y1,x2,y2);
		
		if (a) {
			System.out.println("���簢���� �浹�մϴ�");
		}
		else 
			System.out.println("�浹���� �ʽ��ϴ�");
		//
	}
}
