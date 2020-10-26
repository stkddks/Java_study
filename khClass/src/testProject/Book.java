package testProject;

public class Book {			//클래스
	String title;
	String author;
	
	public Book(String t) {		// 생성자1(생성자는 클래스이름과 동일한 메소그형태 이여야 한다)
		title = t;
		author = "작자미상";
	}
	public Book(String t, String a) {		//생성자2
		title = t; 
		author = a;
	}
	
	public static void main(String[] args) {
		//아래는 Book 자료형(클래스명)의 객체생성
		//생성자 이름이 클래스이름과 같으니까 그냥 클래스이름 써준다고 생각하면 된다.
		Book littlePrince = new Book("어린왕자", "생텍쥐베리");		// 파라메터가 2개니까 생성자2 를 따름
		Book loveStory = new Book("춘향전");					// 파라메터가 1개니까 생성자1 을 따름
		System.out.println(littlePrince.title+ " " + littlePrince.author);
		System.out.println(loveStory.title + " "+ loveStory.author);
	}
}




