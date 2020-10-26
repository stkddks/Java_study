

// 행의 길이가 15. 열의 길이가 11인 2차원 배열은 선언하세요
// 1부터 165까지 인덱스 순서대로 값을 초기화하소 그 값을 출력하는 코드를 작성하세요

package mission;

public class Array2 {
	public static void main(String[] args) {
		int[][] score1;
		score1 = new int[15][11];
		int z=1;
		for (int i=0; i<score1.length; i++) {
			for(int j=0; j<score1[i].length; j++) {		
				score1[i][j] = z;
				System.out.print(i+ "행" +j+ "열:" +score1[i][j]+ "\t\t");
				z++;
			}
			System.out.println();
		}
		System.out.println();
	}
	
}


