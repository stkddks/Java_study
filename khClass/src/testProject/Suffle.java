package testProject;

public class Suffle {

	public static void main(String[] args) {
		
		int[] nums = new int[10];
		for (int i=0; i<nums.length; i++) { 
			nums[i] = i; 	// num[i] = {0,1,2,3,4,5,6,7,8,9}
			} // suffle int tmp = 0
		
		int tmp = 0;
		for (int i=0; i<nums.length; i++) { 
			int tmp_idx = (int) (Math.random() * nums.length);
						//Math.random()는 static 메소드로, 0 이상 1 미만의 double을 무작위로 리턴. 그렇기에 10을 곱해준다.
			tmp = nums[i]; 
			nums[i] = nums[tmp_idx]; 
			nums[tmp_idx] = tmp; 		
			}
		// 그러면 nums[tmp_idx] 값은 nums[i] 가 되고 nums[i]의 값은 nums[tmp_idx] 값이 된다.
		// 즉 nums[i] 값과  nums[tmp_idx]값을 바꾸기 위한 과정
		// temp는 임시저장소
		// 이게 정렬이아니고 셔플인 이유는 random 한 값으로 값이 바뀌기 때문이다
		
		for (int num : nums) { 
			System.out.print(num + " "); // 8 3 5 0 4 6 9 1 2 7 }
			// System.out.println("");
		}
	}
}
















