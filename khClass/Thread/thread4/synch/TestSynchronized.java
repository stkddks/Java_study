
// ������ ����ȭ���� 1

package thread4.synch;

public class TestSynchronized {
	
	public static void main(String[] args) {
		// ����ȭó�� �׽�Ʈ
		Thread t1 = new AccountManager("�ڵ�ȭ���");
		Thread t2 = new AccountManager("���ͳݹ�ŷ");
		Thread t3 = new AccountManager("����Ͼ�");
		t1.start();
		t2.start();
		t3.start();
	}
	
}
