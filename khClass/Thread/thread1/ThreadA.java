package thread1;

public class ThreadA /*extends Thread*/ implements Runnable {
	
	@Override
	public void run() {
		// �ٸ� ������ Ŭ������ ���� ó���ϰ� ���� ������
		// �ڵ�� �ۼ���
		for(int k = 1; k <= 500; k++) {
			System.out.println("��");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
