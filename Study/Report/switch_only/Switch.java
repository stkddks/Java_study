
// Q. ������ �Է� �޾� ����� �⎹�ϴ� ���α׷��� �ۼ�(switch�� �̿�)
// ������ 0~100�������� �Է� �����ϸ�, �� ���� ������ �Է��ϸ� "�߸��� �Է�"�̶�� �޽��� ��� �� ���� 
// 90�� �̻� : A���, 80�� �̻�: B���, 70�� �̻�: C��� ���

package switch_only;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char grade;
		
		System.out.printf("������ �Է��ϼ���: ");
		int score = sc.nextInt();
		
		switch(score/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default:
			grade = 'F';	
		}	
		System.out.println("����: " +score+ ", ����: " +grade);
		sc.close();
	}
}
