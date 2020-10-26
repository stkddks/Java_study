package testProject;

public class Ex3_14 {

	public static void main(String[] args) {
		String str1 = "abc";	//스택
		String str2 = new String("abc"); //힙 // String 타입의 변수 str2에 새롭게(new) String 객체를 생성하여  연결!
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf(" str1==\"abc\" ? %b%n", str1=="abc");
		System.out.printf(" str2==\"abc\" ? %b%n", str2=="abc");
		
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
	}		
}


// 문자열 비교
// 문자열을 비교할 떄는 무조건 equals를 쓸것


/*
 * 
 * //구조체 : 다른 타입의 변수들의 묶음 자료형
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
 

 
 
 
 