
// p17 ������ �켱����

package thread2;
public class PriorityTest extends Thread {
	//Field
	private String threadName; //������ �̸� ����
	//Constructor
	public PriorityTest(String threadName) {
		this.threadName = threadName;
	}
	//Method
	@Override
	public void run() {
		//������ �̸� ��� 3�� �ݺ�
		for(int i = 0; i < 3; i++) {
			System.out.println(threadName + "�� ������.");
		}
	}
	public static void main(String[] args) {
		// �켱 ���� �׽�Ʈ��
		Thread t1 = new PriorityTest("���� ���� ������");
		Thread t2 = new PriorityTest("���� ������");
		Thread t3 = new PriorityTest("���� ���� ������");
		t1.setPriority(Thread.MAX_PRIORITY); //10
		t2.setPriority(Thread.NORM_PRIORITY); //5
		t3.setPriority(Thread.MIN_PRIORITY); //1
		t1.start();
		t2.start();
		t3.start();
	}
}