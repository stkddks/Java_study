package testProject;
import java.util.*;
public class Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 88;
		//char grade;
		
		System.out.printf("������ �Է��ϼ���: ");
		String grade = sc.next();
		//String grade = "";
	
		
		if(score >= 90) {
			grade = "A";
			if(score >= 98) {
				grade += '+';
			}
		}else if(score >= 80) {
			grade = "B";
			if(score >= 88) {
				grade += '+';
			}
		}else if(score >= 70) {
			grade = "C";
			if(score >= 78) {
				//grade=grade.concat(plus)
				grade += '+';
			}
		} else {
			grade = "F";
		}
		System.out.println("����: " +score+ ", ����:" +grade);
		sc.close();
	}
}



