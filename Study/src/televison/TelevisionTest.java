package televison;

public class TelevisionTest {


	private Boolean isOn;
	private int volume;
	private int channel;
	
	public void turnOn(boolean isOn) {
//        if ((this.isOn == true) && (isOn == true)) {
//            System.out.println("������ �̹� �����ֽ��ϴ�.");
//            return;
//        }
//        if ((this.isOn == false) && (isOn == false)) {
//            System.out.println("������ �̹� �����ֽ��ϴ�.");
//            return;
//        }
		
		
		if (isOn == true) {
			this.isOn = true;
			System.out.println("������ �׽��ϴ�.");
		}
		else {
			this.isOn = false;
			System.out.println("������ �����ϴ�.");
		}
	}
	public void setChannel(int channel) {
		if ((channel < 1) || (channel > 99))
            System.out.println("ä���� 1�̻� 99���ϸ� �����մϴ�.");
        else {
            this.channel = channel;
            System.out.println("ä���� " + channel + "���� �����Ͽ����ϴ�.");
        }
	}
	public void setVoulume(int volume) {
		if ((volume < 0) || (volume > 100))
            System.out.println("������ 0�̻� 100���ϸ� �����մϴ�.");
        else {
            this.volume = volume;
            System.out.println("������ " + volume + "���� �����Ͽ����ϴ�.");
        }
	}
	void print() {
		System.out.printf("ä���� %d�̰� ������ %d�Դϴ�.\n", channel, volume); // ����
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
		  
		  System.out.println("���� ä���� " + ch + "�Դϴ�.");
		  
		  TelevisionTest yourTv = new TelevisionTest();
		  yourTv.channel = 10;
		  yourTv.volume = 5;
		  yourTv.isOn = true;
		  
		  yourTv.print();
	}

}
