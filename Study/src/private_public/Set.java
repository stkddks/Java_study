package private_public;

//import test.poly.Buyer;
//import test.poly.Chair;
//import test.poly.Desk;

//import test.poly.Chair;
//import test.poly.Desk;
//import test.poly.Furniture;

public class Set {
	// ���� �޼ҵ�
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
	private int balance;		//��Ŀ�� �������� ����� private�� ��ȣ�س����� ���� ������ �� �־�����ݾ�
	
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
		System.out.printf("�����ܾ�: %d��\n", account.getBalance());
	}
	public static void deposit(Accounttt account, int amount) {
		int bal = account.getBalance();
		account.setBalance(bal+amount);
	}
}

class Hacker1{		//��Ŀ�� �� �ܾ׿� �����Ϸ��� ������
	public static void malcious(Account account) {
		account.balance = 0;		//���⼭ �����ܾ׿� ���� �Ұ��ϱ⿡ ����������! �ܾ��� ��ȣ�Ȱ���
	}
}



// ���� ��� �ȱ�

class Furniture {
	protected int price; //��ǰ����
	public Furniture (int price) {
		this.price = price;
	}
}

class Chair extends Furniture {
	public Chair() {
		super(100); // �θ� Ŭ������ ������ ȣ��
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
			System.out.println("�ܾ׺���!");
			return;
		}
		money -= f.price;
		System.out.println(f+" ���ż���! �ܾ�: "+money+" ����");
	}
}

