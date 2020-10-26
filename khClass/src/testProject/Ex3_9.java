package testProject;

public class Ex3_9 {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;
		
		// long c = a*b;	// 얘는 틀리다 올바르게 고쳐라. 얘는 오버플로우 발생
		long c = (long)a*b;	// 얘가 정답
		// long c = (long)(a*b) 	// 얘는 안되. 오버플로우 발생
		
		System.out.println(c);
	}
}
