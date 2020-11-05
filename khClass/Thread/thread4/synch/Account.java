
// 스레드 동기화예제 1

package thread4.synch;

public class Account {
	
	//Field
	private static int balance; //잔액
	//입금스래드와 출금스래드가 함께 사용할 공유자원이 됨	//공유할 변수
	
	//Method
	public /*synchronized*/ void withDraw(int money) {		// 출금	// Synchronized 동기화메소드보다 동기화블록이용이 좋다	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//출금하는 메소드
		synchronized(this) {		// Synchronized 동기화메소드의 동기화블록
			if(balance >= money)
				balance -= money;
		}
	}
	
	public static void setBalance(int balance) {
		Account.balance = balance;
	}
	public static int getBalance() {
		return balance;
	}
}
