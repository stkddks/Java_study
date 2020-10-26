package testProject;

public class Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] scores= {78, 56, 44, 89, 67, 96, 23, 87, 80, 96};
		int[] scores = {78, 56, 44, 89, 67, 96, 23, 87, 80, 96};

		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int score : scores) {
			max = score > max ? score : max;
			min = score > min ? min : score;
			
		}
		System.out.println("ÃÖ´ñ°ª:" + max);
		System.out.println("ÃÖ¼Ú°ª:" + min);
		
	}

}
