package mission;

public class ThisBTS {

	private String title;
	private String artist;
	private int year;
	private String countey;
	
	void show() { 		//�޼ҵ�
		System.out.println("10�� ��°�� ��Ʈ 1���� ��������~~~~~");
		System.out.println(title+ " " + artist+ "�Դϴ�!!!!!");
		System.out.println("Congratulations");
	}
	
	//public BTS() {}		//������
	
	public ThisBTS(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.countey=country;
	}	
	// this �� Ŭ������ �������� ���� ����� ��, ������ ���ؼ�(?) ���°�
	// this.title�� class���� ������ String title�� ����Ű�ٴ� �Ҹ���!
	
	
	public static void main(String[] args) {
		ThisBTS myFavorite = new ThisBTS("Dynamite", "BTS", 2020, "KOREA");
		myFavorite.show();	// show() �޼ҵ� ȣ��
	}

}