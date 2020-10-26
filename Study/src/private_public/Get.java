package private_public;

//import org.w3c.dom.UserDataHandler;

public class Get {
	
	// 메인 메소드
	  public static void main(String[] args) {
		  Accountt myAccount = new Accountt(100000);
		  Userr.check(myAccount);
		  //System.out.println(myAccount);
	  }
	}
	
class Accountt{
	private int balance;		//해커가 접근하지 말라고 private로 보호해놨지만 나는 접근할 수 있어야하잖아
	
	public Accountt(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return this.balance;
	}
}

class Userr{
	public static void check(Accountt account) {
		System.out.printf("현재잔액: %d원\n", account.getBalance());
	}
}
