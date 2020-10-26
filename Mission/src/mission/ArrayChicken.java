
//사용자가 입력한 값이 배열에 있는지 검색하여 
//있으면 "ㅇㅇㅇ치킨 배달 가능", 없으면 "ㅇㅇㅇ치킨은 없는 메뉴입니다"를 툴력하세요
//단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.


package mission;
import java.util.*;
public class ArrayChicken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String chi = new String[];
		
		String chic[] = {"양념", "간장", "후라이드", "갈릭"};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("치킨이름을 입력하세요 : ('치킨'은 생략)");
		String user=sc.next();
		
		int result=0;
		for (int i=0; i<chic.length; i++) {
			if (chic[i].equals(user)) {
				result ++;
			}
		}
		if (result==1) {
			System.out.println(user+ "치킨 배달 가능");
		}
		else {
			System.out.println(user+ "치킨은 없는 메뉴입니다");
		}
		sc.close();
	}
	

}