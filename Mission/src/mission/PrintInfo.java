/* Q. �̸�, ����, ����, Ű�� ����ڿ��� �Է� �޾� ������ ���� ������ ��� ����ϼ��� */

package mission;
import java.util.Scanner;

public class PrintInfo {

	public static void main(String[] args) {
		
		String name; 
		String sex;
		int age;
	    double hight;

	    Scanner sc = new Scanner(System.in);
	    System.out.printf("�̸��� �Է��ϼ���: ");
	    name = sc.next();
	    System.out.printf("������ �Է��ϼ���(��/��): ");
	    sex = sc.next();
	    System.out.printf("������ �Է��ϼ���: ");
	    age = sc.nextInt();
	    System.out.printf("Ű�� �Է��ϼ���: ");
	    hight = sc.nextDouble();
	    System.out.printf("Ű %3.1f(cm)�� " +age+ "�� " +sex+"�� \"%s\"�� �ݰ����ϴ�", hight, name);
	    //System.out.printf("Ű %3.1fcm�� " +age+ "�� " +sex+"�� " +name+ "�� �ݰ����ϴ�", hight);
	    sc.close();
	}
}
