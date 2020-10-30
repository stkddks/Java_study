package testProject;
import java.util.Arrays;
import java.util.Random;
public class Lotto {

	public static void main(String[] args) {
		int count=0;
		while(true){
		int[] nums = new int[45];
		Random ran = new Random();

		int tmp = 0;
		for (int i=0; i<nums.length; i++) { 
			nums[i] = i+1; 
		}
		for (int i = 0; i < 6; i++) {
			int comSel = ran.nextInt(45);
			tmp = nums[i]; 
			nums[i] = nums[comSel]; 
			nums[comSel] = tmp; 
		}
		int[] lottoNum = Arrays.copyOfRange(nums, 0, 6);	//배열복사
		
//		for (int i = 0; i < lottoNum.length; i++) {
//			for (int j = 1; j < lottoNum.length; j++) {
//				if (lottoNum[i] > lottoNum[j]) {
//					tmp = lottoNum[j];
//					lottoNum[j] = lottoNum[i];
//					lottoNum[i] = tmp;
//				}
//			}
//		}
		Arrays.sort(lottoNum);	//오름차순정렬		//위의 for문이랑 같은 뜻의 코드
		System.out.println(Arrays.toString(lottoNum));
		count++;
		if(count == 5) {
			break;
		}
	}
	}
}

