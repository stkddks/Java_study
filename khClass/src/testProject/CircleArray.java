package testProject;
//import Circle;
public class CircleArray {
	
	public static void main(String[] args) {
		Circle [] c;			// Circle 배열에 대한 레퍼런스 c선언
		c = new Circle[5];		// 5개의 레퍼런스 배열 셍성 
		
		for(int i=0; i<c.length; i++)		//배열의 개수 만큼
			c[i] = new Circle(i);			// i 번째 원소 객체 생성
		
		for (int i=0; i<c.length; i++) {	// 배열의 모든 원소 객체의 면적 출력
			System.out.println((int)(c[i].getArea())+" ");
		}
	}
}
