package testProject;
import java.util.*;

public class StringCut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			
		//1. 쉼표(,)로 문자열 잘라서 배열에 넣기
		String str1 = "A,B,C,D";
		String[] array1 = str1.split(",");
		for(int i=0; i<array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		//2. 공백(" ")으로 문자열 잘라서 배열에 넣기
		String str2 = "난 더 이상 소녀가 아니에요";
		String[] array2 = str2.split(" "); // array2 = [난,더,이상,소녀가,아니에요]
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		//3. 문자열 입력받아서 하기
		System.out.println("문자열을 입력하세요: ");
		String s = sc.next();
		String [] array3 = s.split(",");
		for(int i=0; i<array3.length; i++) {
			System.out.println(array3[i]);
		}
		sc.close();	
	}
}





