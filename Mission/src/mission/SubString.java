
/* ����ڿ� ���� Ű����� �Է¹޾� ���ڿ��� �տ��� ������ ����ϼ���
���ڿ�: apple �� �Է��� ��
*/

package mission;
import java.util.*;

public class SubString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.printf("���ڿ��� �Է��ϼ���: ");
		String str = sc.next();
		   System.out.printf("ù��° ����: %s",str.substring(0, 1));
		   System.out.printf("\n�ι�° ����: %s",str.substring(1, 2));
		   System.out.printf("\n����° ����: %s",str.substring(2, 3)); 
		   //substring ���� charAt�� ����. �ٸ� charAt�� ���� �ϳ��� ������ �� �ִ�. 
		   //substring �� �ξ� ���� ���δ�.


/*----------------------��ȭ����----------------------------------------------*/

		   
		   //1. ��ǥ(,)�� ���ڿ� �߶� �迭�� �ֱ�
		   System.out.println("\n");
		   String str1 = "A,B,C,D";
		   String[] array1 = str1.split(",");
		   		    		
		   for(int i=0; i<array1.length; i++) {
			   System.out.println(array1[i]);
		   }		  
		   
		   //2. ����(" ")���� ���ڿ� �߶� �迭�� �ֱ�
		   System.out.println("\n");
		   String str2 = "�� �� �̻� �ҳడ �ƴϿ���";
		   String[] array2 = str2.split(" "); // array2 = [��,��,�̻�,�ҳడ,�ƴϿ���]
		 		
		   for(int i=0; i<array2.length; i++) {
			   System.out.println(array2[i]);
		   }
		   sc.close();
	}
}	  
