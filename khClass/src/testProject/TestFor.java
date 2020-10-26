package testProject;

public class TestFor {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("1부터 100까지 정수들의 합계:" +sum);
	}
}
