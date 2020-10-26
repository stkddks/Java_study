// 
// api 연습문제 1
// String str = "J a v a P r o g r a m" 이라는 
// 문자열 값을 공백단위로 Token 처리하여 char[]에 저장하여 출력하시오.
// 그리고 다시 char[]를 모두 대문자로 변환하여 문자열 저장 후 출력하시오 


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




