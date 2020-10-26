
// 지원쓰 코드

package api;
import java.util.StringTokenizer;
public class Token2 {

	public static void main(String[] args) {

		String str = "J a v a P r o g r a m";
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int i = 0;
		char[] a = new char[st.countTokens()];
		while (st.hasMoreTokens()) { // 토근이 있는동안 while문이 실행됨
			String text = st.nextToken();
			a[i] = text.charAt(0);
//			a[i] = st.nextToken().charAt(0);
			
			i++;
		}

        for(i=0; i<a.length; ++i){
            if(97<=a[i] && a[i]<=122){
                a[i]=(char)(a[i]-32);
                }
            System.out.println(a[i]);
            }
        
//		for (i = 0; i < a.length; i++) {
//			System.out.print(a[i].toUpper() + " ");
//		}
	}

}


