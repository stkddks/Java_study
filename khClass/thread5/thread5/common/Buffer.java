
// ������ ����ȭ���� 2

package thread5.common;

public class Buffer {
	
	private int data;
	private boolean empty = true;		// empty�� �뵵��? �ܼ� ������ ����? �� ����?
	
	
	
	public synchronized void put(int data) {			// Producer �� ���� ���
		while (!empty) {
			try {
				
				wait();
			} catch (InterruptedException e) {
			}
		}
		empty = false;
		this.data = data;
		notifyAll();
	}
	
	
	
	public synchronized int get() {					// Consumer �� ���� ���
		// synchronized(����ȭ)�� �޼ҵ� �����صθ� �� �� �ϳ��� ���Եȴ�.(���� ������� �߿���)
		// �� �ϳ��� �����常 ������ �� �ִ� �ڵ� ������ �Ӱ� ����
		// synchronized(����ȭ) �� �׸� �����ϱ����� ����
		while (empty) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		empty = true;
		notifyAll();
		return data;
	}
	
	
}


