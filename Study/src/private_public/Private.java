package private_public;

public class Private {
	// ���� �޼ҵ�
	  public static void main(String[] args) {
	    // ���� ��ü ����
		  Account myAccount = new Account(100000);
		  System.out.println(myAccount);
		  Hacker.malcious(myAccount);
		  System.out.println(myAccount);
	  }
	}

class Account {
	int balance;		
	//private int balance;		//���Ⱑ private int balance;�� ��ȣ�Ǿ� �ִٸ� �ؿ�
	public Account(int balance) {
		this.balance=balance;
	}
	public String toSring() {
		return "Account [balance = " + balance + "]";	
	}
}

class Hacker{		//��Ŀ�� �� �ܾ׿� �����Ϸ��� ������
	public static void malcious(Account account) {
		account.balance = 0;		//���⼭ �����ܾ׿� ���� �Ұ��ϱ⿡ ����������! �ܾ��� ��ȣ�Ȱ���
	}
}

	
	
