
// 태섭쓰코드

package api;
import java.util.StringTokenizer;
public class Token3 {
	public static void main(String[] args) {
		String str = "J a v a P r o g r a m ";
		
		StringTokenizer str1 = new StringTokenizer(str, " ");
		char arr[] = new char[str1.countTokens()];
		
		for (int i=0; i <arr.length; i++) {
			System.out.print(str1.nextToken().toUpperCase().charAt(0));
		}
	}
}
