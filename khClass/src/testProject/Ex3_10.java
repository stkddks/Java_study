package testProject;

public class Ex3_10 {
	public static void main(String[] args) {
		long a = 1_000_000 * 1_000_000;		// 2�� 20�� * 2�� 20�� 
		//�����÷ο� �߻� //��? int������ ���� ũ�Ⱑ long���� ũ�⶧���� long���� ���� ����ȯ�� �����༭ Ÿ���� �����ش�.
		
		long b = 1_000_000 * 1_000_000L;	// ��� ���������� ����ȴ�. ��? L��, �� long���� �����ֱ� ������
		
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}

// long �� 2�� 63�� X2 (���� ���� �����ϱ�)
// int �� 2�� 31�� X2 (�������� �����ϱ�)