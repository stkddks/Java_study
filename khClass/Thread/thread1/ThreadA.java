package thread1;

public class ThreadA /*extends Thread*/ implements Runnable {
	
	@Override
	public void run() {
		// 다른 스래드 클래스와 동시 처리하고 싶은 내용을
		// 코드로 작성함
		for(int k = 1; k <= 500; k++) {
			System.out.println("★");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
