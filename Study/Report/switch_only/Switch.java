
// Q. 점수를 입력 받아 등급을 출렫하는 프로그램을 작성(switch문 이용)
// 점수는 0~100점까지만 입력 가능하며, 그 외의 점수를 입력하면 "잘못된 입력"이라는 메시지 출력 후 종료 
// 90점 이상 : A등급, 80점 이상: B등급, 70점 이상: C등급 등등

package switch_only;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char grade;
		
		System.out.printf("점수를 입력하세요: ");
		int score = sc.nextInt();
		
		switch(score/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default:
			grade = 'F';	
		}	
		System.out.println("점수: " +score+ ", 학점: " +grade);
		sc.close();
	}
}
