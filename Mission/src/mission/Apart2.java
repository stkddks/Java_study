package mission;
import java.util.Scanner;
public class Apart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int apart[][] = new int[20][];
		//apart[0] = new int[1];
		System.out.println("===========A����Ʈ ���� �Է�=============");
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("�ǹ��� �� �� �Է�: ");
		int a = sc.nextInt();			// �ǹ��� ����
		System.out.println(a+"���� �����Ǿ����ϴ�.");
		
		int [][]floor = new int[a][];	// �������� ȣ��(�� ����)
		int []room = new int[a];// ȣ��(�� ����)
		String [][] rooms = new String[a][];	// ������ �̸� (���� ��ȣ)
		int hosel;	// �������� ȣ�� ����
		
		for(int i=0; i<a; i++) {
		    System.out.print((i+1)+"���� �� ȣ�� �Է� : ");
		    hosel = sc.nextInt();
		    floor[i]=new int[hosel];
		    rooms [i]=new String[hosel];
		    room[i]=hosel;	// ���� ����� ���� �迭
		    }
		
		for(int i=0; i<a; i++) {
			System.out.println((i+1)+"���� " + room[i] +"ȣ�Ǳ��� ���� �Ǿ����ϴ�.");
			}
		System.out.println("�� ȣ�Ǹ��� �������� �̸��� �Է��ϼ���");
		
		for(int i=0; i<a; i++) {
			System.out.println("=========" + (i+1)+"�� ���� �Է� =========");
			for(int j=0; j<room[i]; j++) {
				System.out.printf((i+1)+"�� "+(j+1)+"ȣ ������ : ");
				rooms[i][j] = sc.next();
				}
			} 
		System.out.println("============�� �� ������ ���� ���=============");
		
		for(int i=0; i<a; i++) {
		System.out.print((i+1)+"�� :");
		for(int j=0; j<room[i]; j++) {
			System.out.print(rooms[i][j]+"\t");
		 }
		System.out.println("");
		sc.close();
		}

//		System.out.println("1���� �� ȣ�� �Է�: ");
//		int a1 = sc.nextInt();
//		System.out.println("2���� �� ȣ�� �Է�: ");
//		int b1 = sc.nextInt();
//		System.out.println("3���� �� ȣ�� �Է�: ");
//		int c1 = sc.nextInt();
//		System.out.println(a+ "����" +a1+ "ȣ�Ǳ��� �����Ǿ����ϴ�.");
//		System.out.println((a+1)+ "����" +b1+ "ȣ�Ǳ��� �����Ǿ����ϴ�.");
//		System.out.println((a+2)+ "����" +c1+ "ȣ�Ǳ��� �����Ǿ����ϴ�.");

	}
}
