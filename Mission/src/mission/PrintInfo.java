/* Q. 이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요 */

package mission;
import java.util.Scanner;

public class PrintInfo {

	public static void main(String[] args) {
		
		String name; 
		String sex;
		int age;
	    double hight;

	    Scanner sc = new Scanner(System.in);
	    System.out.printf("이름을 입력하세요: ");
	    name = sc.next();
	    System.out.printf("성별을 입력하세요(남/여): ");
	    sex = sc.next();
	    System.out.printf("나이을 입력하세요: ");
	    age = sc.nextInt();
	    System.out.printf("키를 입력하세요: ");
	    hight = sc.nextDouble();
	    System.out.printf("키 %3.1f(cm)인 " +age+ "살 " +sex+"자 \"%s\"님 반갑습니다", hight, name);
	    //System.out.printf("키 %3.1fcm인 " +age+ "살 " +sex+"자 " +name+ "님 반갑습니다", hight);
	    sc.close();
	}
}

