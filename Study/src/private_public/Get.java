package private_public;

//import org.w3c.dom.UserDataHandler;

public class Get {
	
	// ���� �޼ҵ�
	  public static void main(String[] args) {
		  Accountt myAccount = new Accountt(100000);
		  Userr.check(myAccount);
		  //System.out.println(myAccount);
	  }
	}
	
class Accountt{
	private int balance;		//��Ŀ�� �������� ����� private�� ��ȣ�س����� ���� ������ �� �־�����ݾ�
	
	public Accountt(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return this.balance;
	}
}

class Userr{
	public static void check(Accountt account) {
		System.out.printf("�����ܾ�: %d��\n", account.getBalance());
	}
}
