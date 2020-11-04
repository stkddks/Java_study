package thread3;

class SingleMultiThread3 {
	static long startTime = 0;

	public static void main(String args[]) {
		ThreadEx11_1 th1 = new ThreadEx11_1();
		ThreadEx11_2 th2 = new ThreadEx11_2();
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();

		try {
			th1.join();	// main�����尡 th1�� �۾��� ���� ������ ��ٸ���.
			th2.join();	// main�����尡 th2�� �۾��� ���� ������ ��ٸ���.
		} catch(InterruptedException e) {}

		System.out.print("�ҿ�ð�:" + (System.currentTimeMillis() - SingleMultiThread3.startTime));
	} // main
}

class ThreadEx11_1 extends Thread {
	public void run() {
//		int count = 0;
		for(int i=0; i < 300; i++) {
			System.out.print(new String("-"));
//			count++;
		}
//		System.out.println(count);
	} // run()
}

class ThreadEx11_2 extends Thread {
	public void run() {
//		int count1 = 0;
		for(int i=0; i < 300; i++) {
			System.out.print(new String("|"));
//			count1 ++;
		}
//		System.out.println(count1);
	} // run()
}
