

/* 키보드로 가로 새로 값을 실수형으로 입력받아 사각형의 면적과 둘레를 계산하여 출력하세요
 * 면적: 가로*세로 // 둘레: (가로+세로)*2*/

package mission;
import java.util.Scanner;
public class Operation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		   System.out.printf("가로: ");
		   double wide = sc.nextDouble();
		   System.out.printf("세로: ");
		   double hight = sc.nextDouble();
		    
		   double area= wide*hight;
		   double round = (wide+hight)*2;
		   
		   System.out.printf("면적 : " +area+ "\n둘레 : "+round);
		   sc.close();
	}
}



