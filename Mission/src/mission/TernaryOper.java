

/*
 * A,B,C ����� ������ �Է��ް� �� ����� ������ �μ�Ƽ�긦 ������ ������ ����Ͽ� ����ϰ� �μ�Ƽ�� ���� �޿��� 3000���� �̻��̸� "3000 �̻�",
 * �̸��̸�, "3000 �̸�"�� ����ϼ���
 * (A����� �μ�Ƽ��� 0.4, B ����� �μ�Ƽ��� ������, C����� �μ�Ƽ��� 0.15) 
 */




package mission;
import java.util.Scanner;
public class TernaryOper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = "3000�̻�";
		String s2 ="3000�̸�";
		
		System.out.printf("A����� ����: ");
		double A = sc.nextInt();
		double a = A*1.4;
		// double a = A+(A*0.4);
		   
		System.out.printf("B����� ����: ");
		double B = sc.nextInt();
		double b = B;
		   
		System.out.printf("C����� ����: ");
		double C = sc.nextInt();
		double c = C*1.15;
		   
		System.out.println("\nA��� ����/����+a : "+(int)A+ "/" +a );
		System.out.printf( a >= 3000? s1 : s2);
		System.out.println("\nB��� ����/����+a : "+(int)B+ "/" +b);
		System.out.printf( b >= 3000? s1 : s2);
		System.out.println("\nC��� ����/����+a : "+(int)C+ "/" +c);
		System.out.printf( c >= 3000? s1 : s2);
		
		/*
		System.out.printf("\nA��� ����/����+a : "+A+ "/" +a);
		if (a>=3000.0 | b>=3000.0 | c>=3000.0) {
			System.out.println("\n3000���� �̻�");
		} else{
			System.out.println("\n3000���� �̸�");  
		}
		
		System.out.printf("B��� ����/����+a : "+B+ "/" +b);
		if (b>30_000_000) {
			System.out.println("\n3000���� �̻�");
		} else {
			System.out.println("\n3000���� �̸�");  
		}
		
		System.out.printf("C��� ����/����+a : "+C+ "/" +c);
		if (c>30_000_000) {
			System.out.println("\n3000���� �̻�");
		} else{
			System.out.println("\n3000���� �̸�");  
		}   
		*/
		sc.close();
	}
		   
}

/*
if (a>=3000.0 || b>=3000.0 || c>=3000.0) {
	String as= "3000���� �̻�", bs= "3000���� �̻�", cs = "3000���� �̻�";
	System.out.printf("\nA��� ����/����+a : "+A+ "/" +a+ "\n" +as);
	System.out.printf("B��� ����/����+a : "+B+ "/" +b+ "\n" +bs);
	System.out.printf("C��� ����/����+a : "+C+ "/" +c+ "\n" +cs);
} else{
	String as="3000���� �̸�", bs="3000���� �̸�", cs = "3000���� �̸�";
	System.out.printf("\nA��� ����/����+a : "+A+ "/" +a+ "\n%s" +as);
	System.out.printf("B��� ����/����+a : "+B+ "/" +b+ "\n%s" +bs);
	System.out.printf("C��� ����/����+a : "+C+ "/" +c+ "\n%s" +cs);
	//System.out.println("\n3000���� �̸�");  
}
*/