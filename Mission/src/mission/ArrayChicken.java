
//����ڰ� �Է��� ���� �迭�� �ִ��� �˻��Ͽ� 
//������ "������ġŲ ��� ����", ������ "������ġŲ�� ���� �޴��Դϴ�"�� �����ϼ���
//��, ġŲ �޴��� ���ִ� �迭�� ���� ������ ���ϼ���.


package mission;
import java.util.*;
public class ArrayChicken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String chi = new String[];
		
		String chic[] = {"���", "����", "�Ķ��̵�", "����"};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ġŲ�̸��� �Է��ϼ��� : ('ġŲ'�� ����)");
		String user=sc.next();
		
		int result=0;
		for (int i=0; i<chic.length; i++) {
			if (chic[i].equals(user)) {
				result ++;
			}
		}
		if (result==1) {
			System.out.println(user+ "ġŲ ��� ����");
		}
		else {
			System.out.println(user+ "ġŲ�� ���� �޴��Դϴ�");
		}
		sc.close();
	}
	

}