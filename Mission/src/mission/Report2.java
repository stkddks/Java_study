
// 성적표를 출력하는 프로그램 만들기
// 2차원 배열을 만들어 점수를 초기화 한 후
// 개인별 변수를 만들어 총합계, 합계, 평균을 계산하려 출력하시


package mission;

public class Report2 {

	public static void main(String[] args) {
		
		String title[] = {"이름", "국어", "영어", "수학", "합계", "평균"};
		String name[] = {"홍길동", "이순신", "유관순"};
		int[][] score = new int[][]{{80,90,77}, {78,68,88}, {71,68,88}};
		int sums=0;
		//int avgs = 0;
	
		
		System.out.println("===================A반 성적표==================");
		
		for(int i=0; i<title.length; i++) {
			System.out.printf(title[i] +"\t");
		}
		System.out.println();
		System.out.println("=============================================");

		
		for (int i=0; i<score.length; i++) { 
			
			System.out.printf(name[i] + "\t");
			
			for (int j=0; j<score[i].length; j++) {
				System.out.printf(score[i][j] + "\t");
			
			}
			
			int sum = 0;
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
			}
			System.out.printf(sum+ "\t");
			sums += sum;
			
//			double avg = 0;
//			for(int j=0; j<score[i].length; j++) {
//				avg += score[i][j];
//			}
			System.out.printf("%.1f", (double)sum/3);	//%f는 소수점 형태로 표현한다는 의미
			//avgs += (double)sum/3;
			System.out.println();
	
		}
		System.out.println("=============================================");
		int sum2 = 0, sum3=0, sum4 = 0;
		for (int j=0; j<score.length; j++) { 
			sum2 += score[j][0];
			sum3 += score[j][1];
			sum4 += score[j][2];
			}
		System.out.println("합계 \t" + sum2 + "\t" + sum3 + "\t" + sum4 +"\t"+ sums +"\t" + sums/9);
	}
}


