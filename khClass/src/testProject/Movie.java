package testProject;
import java.util.*;
public class Movie {
	private String title;
	private double grade;
	private String director;
	private int year;
	private String country;
	
	

	void print() {
		System.out.printf("**********올해의 영화는?********** \n\n두구두구두구두구..\n"); 
		System.out.printf("%s 의 %s 감독작품인  %s이 차지를 했습니다!!\n",country, director, title); 
		System.out.printf("이 영화는 %d년에 만들어진 세계 최고의 영화강국, %s 의 영화이며 심사위원의 평점 %.1f를 받은 기록이 있습니다\n\n", year, country, grade);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 Movie yourMovie = new Movie();
		 yourMovie.title = "기생충";
		 yourMovie.grade = 5.0;
		 yourMovie.director = "봉준호";
		 yourMovie.year = 2019;
		 yourMovie.country = "대한민국";
		 
		 yourMovie.print();
		 
		 Movie yourMovie2 = new Movie();
		 System.out.println("**********당신이 만드는 수상작**********");
		 System.out.print("영화 제목: ");
		 yourMovie2.title = sc.next();
		 System.out.print("영화 평점: ");
		 yourMovie2.grade = sc.nextDouble();
		 if(yourMovie2.grade>5.0) {
			 System.out.print("평점의 최고점수는 5.0입니다. 다시 입력해주세요: ");
			 yourMovie2.grade = sc.nextDouble();
		 }
		
		 System.out.print("영화 감독: ");
		 yourMovie2.director = sc.next();
		 System.out.print("영화가 만들어진 연도: ");
		 yourMovie2.year = sc.nextInt();
		 System.out.print("나라: ");
		 yourMovie2.country = sc.next();
		 
		 yourMovie2.print();
		 
	}
}


