package thread1;
public class TestThread {
	public static void main(String[] args) {
	
	// ��Ƽ ������ �׽�Ʈ�� (Tread Ŭ���� ��ӹ޾�����)
		// ThreadA �� ThreadB �� main �޼ҵ� �ҽ�
		/*
		Thread t1 = new ThreadA();
		Thread t2 = new ThreadB();
		*/
		
		//Runnable �������̽� ��ӽ�
		Thread t1 = new Thread(new ThreadA());
		Thread t2 = new Thread(new ThreadB());
		t2.setPriority(Thread.MAX_PRIORITY);		// �������� �켱���� �ִ� 10
		t1.start();
		t2.start();
	}
}