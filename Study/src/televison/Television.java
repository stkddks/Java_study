package televison;
import televison.Person;
public class Television {
	
	private boolean power;
	private int volume;
	private int channel;
	//Scanner sc = new Scanner(System.in);
	
	/*setter*/
	public boolean setPower(boolean power) {
		if ((this.power == true) && (power == true)) {
			System.out.println("������ �̹� �����ֽ��ϴ�.");
			return true;
		}
		if ((this.power == false) && (power == false)) {
			System.out.println("������ �̹� �����ֽ��ϴ�.");
			//���⼭ �ٽ� ������ �ѽðڽ��ϱ�� ����;��!
			System.exit(0);
			return false;
		}
		if(power==true) {
			this.power = true;	
			System.out.println("������ �׽��ϴ�.");
			return true;
		}
		else {
			this.power = false;
			System.out.println("������ �����ϴ�.");
			System.exit(0);
		return false;
		}
	}
	public void setChannel(int channel) {
		this.channel = channel;
		System.out.println("## ä���� " + channel + "���� �����Ͽ����ϴ� ##");        
	}
	public void setVolume(int volume) {
		if ((volume < 0) || (volume > 100))
            System.out.println("������ 0�̻� 100���ϸ� �����մϴ�.");
		
        else {
            this.volume = volume;
            System.out.println("## ������ " + volume + "���� �����Ͽ����ϴ� ##");
        }
	}

	/*getter*/
	public boolean isPower() {	//boolean �� getter
		return power;
	}
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	
	
	void print() {
		System.out.printf("\n**********���� ä���� %d�̰� ������ %d�Դϴ�**********\n", channel, volume); // ����
	}
}
	


//if (power.equals("true")) {
//this.power = true;
//System.out.println("������ �׽��ϴ�.");
//}
//else {
//this.power = false;
//System.out.println("������ �����ϴ�.");
//}
	
//	
//	public boolean turnOff() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("TV�� �ѽðڽ��ϱ�? : (TurnOn: true / TurnOff: false)");
//		String power = sc.next();
//		if(power.equals("true")) {
//			System.out.println("������ �׽��ϴ�.");
//			return true;
//		}
//		System.out.println("������ �����ϴ�.");
//		System.exit(0);
//		return false;
//	}
	
	
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		Television myTv = new Television();
//		myTv.turnOff();
////		System.out.println("TV�� �ѽðڽ��ϱ�? : (TurnOn: true / TurnOff: false)");
////		
////		
////		String power = sc.next();
////		if(power.equals("true")) {
////			 myTv.turnOn(power);}
////		else if(power.equals("false")) { 
////			myTv.turnOff();}
////		else {
////			System.out.println("�ý����� �����մϴ�.");}
////		
//		  //myTv.print();
//		  
//		  //int ch = myTv.getChannel();
//		  
//	
//	}

