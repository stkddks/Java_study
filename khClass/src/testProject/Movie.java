package testProject;
import java.util.*;
public class Movie {
	private String title;
	private double grade;
	private String director;
	private int year;
	private String country;
	
	

	void print() {
		System.out.printf("**********������ ��ȭ��?********** \n\n�α��α��α��α�..\n"); 
		System.out.printf("%s �� %s ������ǰ��  %s�� ������ �߽��ϴ�!!\n",country, director, title); 
		System.out.printf("�� ��ȭ�� %d�⿡ ������� ���� �ְ��� ��ȭ����, %s �� ��ȭ�̸� �ɻ������� ���� %.1f�� ���� ����� �ֽ��ϴ�\n\n", year, country, grade);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 Movie yourMovie = new Movie();
		 yourMovie.title = "�����";
		 yourMovie.grade = 5.0;
		 yourMovie.director = "����ȣ";
		 yourMovie.year = 2019;
		 yourMovie.country = "���ѹα�";
		 
		 yourMovie.print();
		 
		 Movie yourMovie2 = new Movie();
		 System.out.println("**********����� ����� ������**********");
		 System.out.print("��ȭ ����: ");
		 yourMovie2.title = sc.next();
		 System.out.print("��ȭ ����: ");
		 yourMovie2.grade = sc.nextDouble();
		 if(yourMovie2.grade>5.0) {
			 System.out.print("������ �ְ������� 5.0�Դϴ�. �ٽ� �Է����ּ���: ");
			 yourMovie2.grade = sc.nextDouble();
		 }
		
		 System.out.print("��ȭ ����: ");
		 yourMovie2.director = sc.next();
		 System.out.print("��ȭ�� ������� ����: ");
		 yourMovie2.year = sc.nextInt();
		 System.out.print("����: ");
		 yourMovie2.country = sc.next();
		 
		 yourMovie2.print();
		 
	}
}


