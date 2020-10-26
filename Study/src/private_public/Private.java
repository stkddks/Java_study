package private_public;

public class Private {
	// 메인 메소드
	  public static void main(String[] args) {
	    // 지갑 객체 생성
		  Account myAccount = new Account(100000);
		  System.out.println(myAccount);
		  Hacker.malcious(myAccount);
		  System.out.println(myAccount);
	  }
	}

class Account {
	int balance;		
	//private int balance;		//여기가 private int balance;로 보호되어 있다면 밑에
	public Account(int balance) {
		this.balance=balance;
	}
	public String toSring() {
		return "Account [balance = " + balance + "]";	
	}
}

class Hacker{		//해커가 내 잔액에 접근하려해 하지만
	public static void malcious(Account account) {
		account.balance = 0;		//여기서 계좌잔액에 접근 불가하기에 에러가난다! 잔액이 보호된거지
	}
}

	
	
