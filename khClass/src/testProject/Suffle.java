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
						//Math.random()�� static �޼ҵ��, 0 �̻� 1 �̸��� double�� �������� ����. �׷��⿡ 10�� �����ش�.
			tmp = nums[i]; 
			nums[i] = nums[tmp_idx]; 
			nums[tmp_idx] = tmp; 		
			}
		// �׷��� nums[tmp_idx] ���� nums[i] �� �ǰ� nums[i]�� ���� nums[tmp_idx] ���� �ȴ�.
		// �� nums[i] ����  nums[tmp_idx]���� �ٲٱ� ���� ����
		// temp�� �ӽ������
		// �̰� �����̾ƴϰ� ������ ������ random �� ������ ���� �ٲ�� �����̴�
		
		for (int num : nums) { 
			System.out.print(num + " "); // 8 3 5 0 4 6 9 1 2 7 }
			// System.out.println("");
		}
	}
}
















