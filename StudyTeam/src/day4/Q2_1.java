package day4;
import java.util.*;
public class Q2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str[] = {"����", "����", "��"};

		while(true) {
			System.out.println("����� ������ ���ðھ��? (���� / ���� / ��)");
			System.out.print("���� >> ");
			String sel = sc.next();
			if(sel.equals("�׸�")) {
				System.out.println("���ᰡ��?...�ý�����..������.....");
				System.exit(0);
			}
			
			String com = null;
			int comSel = (int)(Math.random()*3);
			System.out.println("-----------�ºδ�?--------------");
			System.out.println("����� " + sel);
			System.out.println("��ǻ�ʹ� " + str[comSel]);
			System.out.println("------------��������������----------------");
			
			if (str[comSel].equals("����")) {
				if (sel.equals("����")) {
					System.out.println("Ǳ! �װ� ����\n");
				}
				else if (sel.equals("��")) {
					System.out.println("��! �װ� �̱�..\n");
				}
			} else if (str[comSel].equals("����")) {
				if (sel.equals("��")) {
					System.out.println("Ǳ! �װ� ����\n");
				}
				else if (sel.equals("����")) {
					System.out.println("��! �װ� �̱�..\n");
				}
			} else if (str[comSel].equals("��")) {
				if (sel.equals("����")) {
					System.out.println("Ǳ! �װ� ����\n");
				}
				else if (sel.equals("����")) {
					System.out.println("��! �װ� �̱�..\n");
				}
			} else {
				System.out.println("���\n");
			}
		}
	}
}
