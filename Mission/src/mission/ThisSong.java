package mission;

public class ThisSong {

	private String genre;
	private String title;
	private String artist;
	private int year;
	private String countey;
	
	void show() { 		//�޼ҵ�
		System.out.println("10�� ��°�� ��Ʈ 1���� ��������~~~~~");
		System.out.println(genre+"�帣 "+artist+ "�� " +title+ "�Դϴ�!!!!!");
		System.out.println("Congratulations :)");
	}
	public ThisSong(String genre, String title, String artist, int year, String country) {
		this.genre = genre;
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.countey=country;
	}	
	
	public static void main(String[] args) {
		ThisSong myFavorite = new ThisSong("�ε�", "��������", "�Ҷ�", 2020, "KOREA");
		myFavorite.show();	// show() �޼ҵ� ȣ��
	}

}
