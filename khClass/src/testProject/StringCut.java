package testProject;
import java.util.*;

public class StringCut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			
		//1. ��ǥ(,)�� ���ڿ� �߶� �迭�� �ֱ�
		String str1 = "A,B,C,D";
		String[] array1 = str1.split(",");
		for(int i=0; i<array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		//2. ����(" ")���� ���ڿ� �߶� �迭�� �ֱ�
		String str2 = "�� �� �̻� �ҳడ �ƴϿ���";
		String[] array2 = str2.split(" "); // array2 = [��,��,�̻�,�ҳడ,�ƴϿ���]
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		//3. ���ڿ� �Է¹޾Ƽ� �ϱ�
		System.out.println("���ڿ��� �Է��ϼ���: ");
		String s = sc.next();
		String [] array3 = s.split(",");
		for(int i=0; i<array3.length; i++) {
			System.out.println(array3[i]);
		}
		sc.close();	
	}
}





