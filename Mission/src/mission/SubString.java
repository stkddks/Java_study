
/* 영어문자열 값을 키보드로 입력받아 문자에사 앞에서 세개를 출력하세요
문자열: apple 을 입력할 것
*/

package mission;
import java.util.*;

public class SubString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.printf("뮨자열을 입력하세요: ");
		String str = sc.next();
		   System.out.printf("첫번째 문자: %s",str.substring(0, 1));
		   System.out.printf("\n두번째 문자: %s",str.substring(1, 2));
		   System.out.printf("\n세번째 문자: %s",str.substring(2, 3)); 
		   //substring 말고 charAt도 가능. 다만 charAt은 쿤자 하나만 지정할 수 있다. 
		   //substring 이 훨씬 많이 쓰인다.


/*----------------------심화문제----------------------------------------------*/

		   
		   //1. 쉼표(,)로 문자열 잘라서 배열에 넣기
		   System.out.println("\n");
		   String str1 = "A,B,C,D";
		   String[] array1 = str1.split(",");
		   		    		
		   for(int i=0; i<array1.length; i++) {
			   System.out.println(array1[i]);
		   }		  
		   
		   //2. 공백(" ")으로 문자열 잘라서 배열에 넣기
		   System.out.println("\n");
		   String str2 = "난 더 이상 소녀가 아니에요";
		   String[] array2 = str2.split(" "); // array2 = [난,더,이상,소녀가,아니에요]
		 		
		   for(int i=0; i<array2.length; i++) {
			   System.out.println(array2[i]);
		   }
		   sc.close();
	}
}	  
