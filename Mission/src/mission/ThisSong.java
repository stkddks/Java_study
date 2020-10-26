package mission;

public class ThisSong {

	private String genre;
	private String title;
	private String artist;
	private int year;
	private String countey;
	
	void show() { 		//메소드
		System.out.println("10월 셋째주 차트 1위의 영광은요~~~~~");
		System.out.println(genre+"장르 "+artist+ "의 " +title+ "입니다!!!!!");
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
		ThisSong myFavorite = new ThisSong("인디", "가을목이", "소란", 2020, "KOREA");
		myFavorite.show();	// show() 메소드 호출
	}

}
