package testProject;

public class Ex3_10 {
	public static void main(String[] args) {
		long a = 1_000_000 * 1_000_000;		// 2의 20승 * 2의 20승 
		//오버플로우 발생 //왜? int끼리의 곱의 크기가 long보다 크기때문에 long으로 강제 형변환을 시켜줘서 타입을 맞춰준다.
		
		long b = 1_000_000 * 1_000_000L;	// 얘는 정상적으로 실행된다. 왜? L형, 즉 long형을 곱해주기 떄문에
		
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}

// long 은 2의 63승 X2 (음수 까지 있으니까)
// int 는 2의 31승 X2 (음수까지 있으니까)