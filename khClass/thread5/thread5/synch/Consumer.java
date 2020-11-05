
// 스레드 동기화예제 2

package thread5.synch;

import thread5.common.Buffer;

public class Consumer implements Runnable {
	private Buffer buffer;
	public Consumer(Buffer drop) {
		this.buffer = drop;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			int data = buffer.get();
			System.out.println("소비자: " + data + "번 케익을 소비하였습니다.");
			try {
				Thread.sleep((int) (Math.random() * 5000));
			} catch (InterruptedException e) {
			}
		}
	}
}
