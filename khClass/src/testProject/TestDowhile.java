package testProject;
import java.util.Scanner;
public class TestDowhile {

	public static void main(String[] args) {
		int value = 0, sum = 0;
		Scanner in = new Scanner(System.in);
		
		do{	//�ݺ������� ���϶� ����Ǵ� �����
			System.out.println("���� ���ڸ� �Է��ϼ��� (����� 99) : ");
			value = in.nextInt();
			sum += value;
		}
		while(value != 99);	//���� �������� ������ ���Ͽ� �ݓ��ƺθ� ����!	//�������� ; �ݵ�� ���� ��!!!!!!
		
		System.out.println("�Էµ� ���� ������ �հ�:" +(sum-99));
		System.out.println("���α׷� ����!");
		in.close();
	}

}
