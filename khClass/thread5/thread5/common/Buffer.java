
// 스레드 동기화예제 2

package thread5.common;

public class Buffer {
	
	private int data;
	private boolean empty = true;		// empty의 용도는? 단순 구별을 위한? 뭘 구별?
	
	
	
	public synchronized void put(int data) {			// Producer 를 위한 기능
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
	
	
	
	public synchronized int get() {					// Consumer 를 위한 기능
		// synchronized(동기화)로 메소드 선언해두면 딱 얘 하나만 돌게된다.(여러 스레드들 중에서)
		// 단 하나의 스레드만 실행할 수 있는 코드 영역을 임계 영역
		// synchronized(동기화) 는 그를 지원하기위한 아이
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


