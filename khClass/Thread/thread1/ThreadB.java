package thread1;

public class ThreadB /*extends Thread*/ implements Runnable{
	
	@Override
	public void run() {
		for(int k = 1; k <= 500; k++) {
			System.out.println(k);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
}