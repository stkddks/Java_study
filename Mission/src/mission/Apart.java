package mission;
import java.util.Scanner;
public class Apart {

	public static void main(String[] args) {
		
		System.out.println("===========A����Ʈ ���� �Է�=============");
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("�ǹ��� �� �� �Է�: ");
		int a = sc.nextInt();			// �ǹ��� ����
		System.out.println(a+"���� �����Ǿ����ϴ�.");
		
		String [][] floor = new String[a][];	// ������ �̸� (���� ��ȣ)
		int []room = new int[a];// ȣ��(�� ����)
		
		int hosel;	// ����ȣ�� ����
		for(int i=0; i<a; i++) {
		    System.out.print((i+1)+"���� �� ȣ�� �Է� : ");
		    hosel = sc.nextInt();	//
		    floor[i]=new String[hosel];		//people
		    room[i]=sc.nextInt();;	// ���� ����� ���� �迭		//
		    }
		
		for(int i=0; i<a; i++) {
			System.out.println((i+1)+"���� " + room[i] +"ȣ�Ǳ��� ���� �Ǿ����ϴ�.");
			}
		System.out.println("�� ȣ�Ǹ��� �������� �̸��� �Է��ϼ���");
		
		for(int i=0; i<a; i++) {
			System.out.println("=========" + (i+1)+"�� ���� �Է� =========");
			for(int j=0; j<room[i]; j++) {
				System.out.printf((i+1)+"�� "+(j+1)+"ȣ ������ : ");
				floor[i][j] = sc.next();
				}
			} 
		System.out.println("============�� �� ������ ���� ���=============");
		
		for(int i=0; i<a; i++) {
			System.out.print((i+1)+"�� :");
			for(int j=0; j<room[i]; j++) {
				System.out.print(floor[i][j]+"\t");
		 }
		System.out.println("");
		sc.close();
		}
	}
}
