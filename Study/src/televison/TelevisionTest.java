package televison;

public class TelevisionTest {


	private Boolean isOn;
	private int volume;
	private int channel;
	
	public void turnOn(boolean isOn) {
//        if ((this.isOn == true) && (isOn == true)) {
//            System.out.println("전원이 이미 켜져있습니다.");
//            return;
//        }
//        if ((this.isOn == false) && (isOn == false)) {
//            System.out.println("전원이 이미 꺼져있습니다.");
//            return;
//        }
		
		
		if (isOn == true) {
			this.isOn = true;
			System.out.println("전원을 켰습니다.");
		}
		else {
			this.isOn = false;
			System.out.println("전원을 껐습니다.");
		}
	}
	public void setChannel(int channel) {
		if ((channel < 1) || (channel > 99))
            System.out.println("채널은 1이상 99이하만 가능합니다.");
        else {
            this.channel = channel;
            System.out.println("채널을 " + channel + "으로 설정하였습니다.");
        }
	}
	public void setVoulume(int volume) {
		if ((volume < 0) || (volume > 100))
            System.out.println("볼륨은 0이상 100이하만 가능합니다.");
        else {
            this.volume = volume;
            System.out.println("볼륨을 " + volume + "으로 설정하였습니다.");
        }
	}
	void print() {
		System.out.printf("채널은 %d이고 볼륨은 %d입니다.\n", channel, volume); // 동작
	}
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean turnOff() {
		return isOn;
	}
	//public toString() {}
	
	
	
	public static void main(String[] args) {
		
		TelevisionTest myTv = new TelevisionTest();
		  myTv.channel = 7;
		  myTv.volume = 9;
		  myTv.isOn = true;
		  
		  myTv.print();
		  
		  int ch = myTv.getChannel();
		  
		  System.out.println("현재 채널은 " + ch + "입니다.");
		  
		  TelevisionTest yourTv = new TelevisionTest();
		  yourTv.channel = 10;
		  yourTv.volume = 5;
		  yourTv.isOn = true;
		  
		  yourTv.print();
	}

}
