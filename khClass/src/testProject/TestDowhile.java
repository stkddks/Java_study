package testProject;
import java.util.Scanner;
public class TestDowhile {

	public static void main(String[] args) {
		int value = 0, sum = 0;
		Scanner in = new Scanner(System.in);
		
		do{	//반복조건이 참일때 수행되는 문장들
			System.out.println("정수 숫자를 입력하세요 (종료는 99) : ");
			value = in.nextInt();
			sum += value;
		}
		while(value != 99);	//루프 마지막에 조건을 비교하여 반볻아부를 결정!	//마지막에 ; 반드시 붙일 것!!!!!!
		
		System.out.println("입력된 정수 값들의 합계:" +(sum-99));
		System.out.println("프로그램 종료!");
		in.close();
	}

}
