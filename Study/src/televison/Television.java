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
			System.out.println("전원이 이미 켜져있습니다.");
			return true;
		}
		if ((this.power == false) && (power == false)) {
			System.out.println("전원이 이미 꺼져있습니다.");
			//여기서 다시 전원을 켜시겠습니까로 가고싶어요!
			System.exit(0);
			return false;
		}
		if(power==true) {
			this.power = true;	
			System.out.println("전원을 켰습니다.");
			return true;
		}
		else {
			this.power = false;
			System.out.println("전원을 껐습니다.");
			System.exit(0);
		return false;
		}
	}
	public void setChannel(int channel) {
		this.channel = channel;
		System.out.println("## 채널을 " + channel + "으로 설정하였습니다 ##");        
	}
	public void setVolume(int volume) {
		if ((volume < 0) || (volume > 100))
            System.out.println("볼륨은 0이상 100이하만 가능합니다.");
		
        else {
            this.volume = volume;
            System.out.println("## 볼륨을 " + volume + "으로 설정하였습니다 ##");
        }
	}

	/*getter*/
	public boolean isPower() {	//boolean 의 getter
		return power;
	}
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	
	
	void print() {
		System.out.printf("\n**********현재 채널은 %d이고 볼륨은 %d입니다**********\n", channel, volume); // 동작
	}
}
	


//if (power.equals("true")) {
//this.power = true;
//System.out.println("전원을 켰습니다.");
//}
//else {
//this.power = false;
//System.out.println("전원을 껐습니다.");
//}
	
//	
//	public boolean turnOff() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("TV를 켜시겠습니까? : (TurnOn: true / TurnOff: false)");
//		String power = sc.next();
//		if(power.equals("true")) {
//			System.out.println("전원을 켰습니다.");
//			return true;
//		}
//		System.out.println("전원을 껐습니다.");
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
////		System.out.println("TV를 켜시겠습니까? : (TurnOn: true / TurnOff: false)");
////		
////		
////		String power = sc.next();
////		if(power.equals("true")) {
////			 myTv.turnOn(power);}
////		else if(power.equals("false")) { 
////			myTv.turnOff();}
////		else {
////			System.out.println("시스템을 종료합니다.");}
////		
//		  //myTv.print();
//		  
//		  //int ch = myTv.getChannel();
//		  
//	
//	}

