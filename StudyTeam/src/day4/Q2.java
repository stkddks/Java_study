package day4;
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		//System.out.println("=== ���� ���� �� ���� ===");
		while(true) {
			System.out.println("����� ������ ���ðھ��? (1.���� /2.���� /3.��)");
			System.out.println("((�׸��Ͻñ� ���Ͻø� �ٸ����ڸ� �����ּ���))");
			System.out.print("���� >> ");
			int sel = sc.nextInt();
			String user = "";

			switch(sel) {
			case 1:
				user = "����";
				break;
			case 2:
				user = "����";
				break;
			case 3:
				user = "��";
				break;
			default:
				System.out.println("�ý����� �����մϴ�");
				System.exit(0);
			}	
			
			int comSel = ran.nextInt(3);
			String com = "";
			
			if (comSel == 1) {
				com = "����";
			} else if (comSel == 2) {
				com = "����";
			} else if (comSel == 3) {
				com = "��";
			}
			
			System.out.println("-----------�ºδ�?--------------");
			System.out.println("����� " + user);
			System.out.println("��ǻ�ʹ� " + com );
			System.out.println("------------��������������----------------");
			if (sel == comSel) {
				System.out.println("���\n");
			} else if ((sel == 1 && comSel == 3) || (sel == 2 && comSel == 1) || (sel == 3 && comSel == 2)) {
				System.out.println("��! �װ� �̱�..\n");
			} else {
				System.out.println("Ǳ! �װ� ����\n");
			}
		}
//		sc.close();
	}

}
