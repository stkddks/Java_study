package testProject;

public class Ex3_9 {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;
		
		// long c = a*b;	// ��� Ʋ���� �ùٸ��� ���Ķ�. ��� �����÷ο� �߻�
		long c = (long)a*b;	// �갡 ����
		// long c = (long)(a*b) 	// ��� �ȵ�. �����÷ο� �߻�
		
		System.out.println(c);
	}
}
