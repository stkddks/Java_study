// 
// api �������� 1
// String str = "J a v a P r o g r a m" �̶�� 
// ���ڿ� ���� ��������� Token ó���Ͽ� char[]�� �����Ͽ� ����Ͻÿ�.
// �׸��� �ٽ� char[]�� ��� �빮�ڷ� ��ȯ�Ͽ� ���ڿ� ���� �� ����Ͻÿ� 


package api;
import java.util.StringTokenizer;
public class Token {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "J a v a P r o g r a m";
		StringTokenizer cha = new StringTokenizer(str, " ");
		String ch[] = new String[100];

		String str1 = "J a v a P r o g r a m";
		String[] array1 = str1.split(" ");
		for(int i=0; i<array1.length; i++) {
			System.out.printf(array1[i] + "  ");
		}
		System.out.println();
		for(int i=0; i<array1.length; i++) {
			System.out.print(array1[i].toUpperCase() + "  ");
		}
		
		System.out.println();
		System.out.println();
		
		while (cha.hasMoreTokens()) {
			for(int i=0; i<str.length(); i++){
				ch[i] = cha.nextToken();
				System.out.printf(ch[i] + "  ");
				System.out.println(ch[i].toUpperCase());
			}
		}
	}
}
		
	//System.out.print(cha.nextToken()+"\t");
//		String a = cha.toUpperCase(cha);




