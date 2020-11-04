package thread3;

class SingleMultiThread {
	static long startTime = 0;

	public static void main(String args[]) {
		ThreadEx3_1 th1 = new ThreadEx3_1();
		th1.start();
		startTime = System.currentTimeMillis();

		for(int i=0; i < 300; i++)
			System.out.printf("%s", new String("-"));	

		System.out.print("�ҿ�ð�1:" + (System.currentTimeMillis() - SingleMultiThread.startTime));
	} 
}

class ThreadEx3_1 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++)
			System.out.printf("%s", new String("|"));	

		System.out.print("�ҿ�ð�2:" + (System.currentTimeMillis() - SingleMultiThread.startTime));
	}
}
