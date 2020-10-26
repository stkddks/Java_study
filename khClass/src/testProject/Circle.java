

// 클래스와 객체 생성 공부하기

package testProject;

public class Circle {

	int radius;		//원의 반지금 변수(필드)
	String name;		//원의 이름 변수(필드)
	
	public Circle(int radius) {		//원의 생성자
		this.radius = radius;
	}		
	
	public double getArea() {		//원의 면적 계산 메소드	//getArea가 호출되면 실행되는겨
		return 3.14*radius*radius;
	}
	
//	public static void main(String[] args) {
//		Circle pizza;					//레퍼런스 변수 pizza 선언
//		pizza = new Circle(4);			// Circle 객체선언
//		pizza.radius=10;				// 피자의 반지금을 10으로 설정
//		pizza.name="자바피자";				// 피자의 이름 설정
//		double area = pizza.getArea();		// 피자의 면적 알아내기
//		System.out.println(pizza.name + "의 면적은" + area);
//	
//		Circle donut = new Circle(4);		// Circle 객체생성
//		donut.radius = 2;					// 도넛의 반지름을 2로 설정
//		donut.name = "자바도넛";				// 도넛의 이름 설정
//		area = donut.getArea();				// 도넛의 면적 알아내기
//		System.out.println(donut.name + "의 면적은" + area);	
//	}
}






/*
 
JAVA에서는 객체를 New 연산자로 선언하고 생성한다.
//Class타입 변수명 = new 생성자 ();
// 생성자 이름은 클래스 이름과 동일 (생성자는 리턴타입이 X)
//Class라는 자료형의 타입 (int형, String형 과 같은 자료형!)
// 자료형의 이름은 해당클래스의 이름과 같다.
// 해당 클래스자료형의 변수를 생성해주는 것! == 객체 생성이 된다.
//// 즉! 클래스명 객체참조_변수명 = new 클래스_생성자명();


ex)
String str2 = new String("abc"); // String타입(자료형)의 변수 str2에 새롭게(new) String 객체를 생성하여  연결!

ex)
 public static void main(String[] args) {
  CLASS reference = new CLASS();
  // CLASS 타입의 reference 변수에, 새롭게 만든 CLASS 객체를 대입!
	}
 
ex) 
 //구조체 : 다른 타입의 변수들의 묶음 자료형
//사용자 정의 자료형
class Student{
    int age;
    int score;
    String name;
}

public class Stuent_Test {
    public static void main(String[] args) {
        Student s = new Student(); //우리가 만든 데이터 타입
        s.age = 20;
        s.score = 100;
        s.name = "성연";
        System.out.println(s.age + " / "+ s.score + " / " + s.name);
    }
}

*/