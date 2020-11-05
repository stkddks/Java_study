
// ������ ����ȭ���� 1

package thread4.synch;

public class Account {
	
	//Field
	private static int balance; //�ܾ�
	//�Աݽ������ ��ݽ����尡 �Բ� ����� �����ڿ��� ��	//������ ����
	
	//Method
	public /*synchronized*/ void withDraw(int money) {		// ���	// Synchronized ����ȭ�޼ҵ庸�� ����ȭ����̿��� ����	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//����ϴ� �޼ҵ�
		synchronized(this) {		// Synchronized ����ȭ�޼ҵ��� ����ȭ���
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
