package thread1;
public class TestThread {
	public static void main(String[] args) {
	
	// 멀티 스래드 테스트용 (Tread 클래스 상속받았을때)
		// ThreadA 와 ThreadB 의 main 메소드 소스
		/*
		Thread t1 = new ThreadA();
		Thread t2 = new ThreadB();
		*/
		
		//Runnable 인터페이스 상속시
		Thread t1 = new Thread(new ThreadA());
		Thread t2 = new Thread(new ThreadB());
		t2.setPriority(Thread.MAX_PRIORITY);		// 스레드의 우선순위 최댓값 10
		t1.start();
		t2.start();
	}
}