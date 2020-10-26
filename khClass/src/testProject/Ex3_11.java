package testProject;

public class Ex3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0;
		System.out.println(shortPi);

	}

}



// 반올림예제 Math.round() 함수 사용
// 이 예제의 결과 pi의 값을 소수점 넷째 자리인 5에서 반올림해서 3.142가 출력되엇다.
// round 메서드는 매개변수로 받은 값을 소수점 첫째 자리에서 반올림을 하니까 Math.round(3141.592)의 결과는 3142 이다.
// 이것을 1000.0 으로 나누니까 3.142의 결과값이 나오는 것이다.







