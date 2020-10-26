package testProject;

public class Array2 {

	public static void main(String[] args) {
//		int score[][] = {{1,2,3},{4,5,6}};
//		for (int i=0; i<score.length; i++) {
//			for(int j=0; j<score[i].length; j++) {
//				System.out.println(i+ "행" +j+ "열:" +score[i][j]+ "\t");
//			}
//			System.out.println();
//		}
		
		int[][] score1;
		score1 = new int[][] {{1,2,3,4,5},{12,24,36},{11,22,33,44}};
		for (int i=0; i<score1.length; i++) {
			for(int j=0; j<score1[i].length; j++) {
				System.out.print(i+ "행" +j+ "열:" +score1[i][j]+ "\t\t");
				//System.out.println();
			}
			System.out.println();
		}
		
	}
	

}
