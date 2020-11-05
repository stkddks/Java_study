
// ������ ����ȭ���� 1

package thread4.synch;

public class AccountManager extends Thread{

	private Account ac;
	private String threadName;
	public AccountManager() {}
	public AccountManager(String threadName) {
		this.threadName = threadName;
	}
	@Override
	public void run() {
		ac = new Account();
		ac.setBalance(1000);
		while(ac.getBalance() > 0) {
			System.out.println("���� �ܾ� : "+ ac.getBalance());
			//����� ���� �������� ó���� : ��� ������ ��
			int money = new java.util.Random().nextInt(10) * 100;		// ������ �������� 100���� �����ش�. 1000������ ���°Ŵϱ� ���⽱��
			System.out.println(threadName + "��/�� ����� �� : "
					+ money);
			ac.withDraw(money);
		}
	}
	
}
