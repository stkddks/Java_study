package testProject;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int score = 88;
		char grade;
		
		System.out.printf("������ �Է��ϼ���: ");
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
		System.out.println("����: " +score+ ", ����: " +grade);
		sc.close();
	}
}
