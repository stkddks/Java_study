package private_public;

//import test.poly.Buyer;
//import test.poly.Chair;
//import test.poly.Desk;

//import test.poly.Chair;
//import test.poly.Desk;
//import test.poly.Furniture;

public class Set {
	// 메인 메소드
	public static void main(String[] args) {
		Accounttt myAccount = new Accounttt(5000);
		Userrr.deposit(myAccount, 7000);
		Userrr.check(myAccount);
		  //System.out.println(myAccount);
		Buyer b = new Buyer();
		b.buy (new Chair( ));
		b.buy (new Desk( ));

	
	
	}
}
	
class Accounttt{
	private int balance;		//해커가 접근하지 말라고 private로 보호해놨지만 나는 접근할 수 있어야하잖아
	
	public Accounttt(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
}

class Userrr{
	public static void check(Accounttt account) {
		System.out.printf("현재잔액: %d원\n", account.getBalance());
	}
	public static void deposit(Accounttt account, int amount) {
		int bal = account.getBalance();
		account.setBalance(bal+amount);
	}
}

class Hacker1{		//해커가 내 잔액에 접근하려해 하지만
	public static void malcious(Account account) {
		account.balance = 0;		//여기서 계좌잔액에 접근 불가하기에 에러가난다! 잔액이 보호된거지
	}
}



// 가구 사고 팔기

class Furniture {
	protected int price; //제품가격
	public Furniture (int price) {
		this.price = price;
	}
}

class Chair extends Furniture {
	public Chair() {
		super(100); // 부모 클래스의 생성자 호출
	}
	@Override
	public String toString(){
		return "Chair";
	}
}

class Desk extends Furniture {
	public Desk() {
		super(200);
	}
	@Override
	public String toString() {
		return "Desk";
	}
}

class Buyer {
	private int money = 500;
	public void buy(Furniture f){
		if (money<f.price) {
			System.out.println("잔액부족!");
			return;
		}
		money -= f.price;
		System.out.println(f+" 구매성공! 잔액: "+money+" 만원");
	}
}

