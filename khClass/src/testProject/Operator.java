package testProject;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5, j=0;
		
		j=i++;
		System.out.println("j=i++; 실행 후, i=" +i+", j=" +j);
		
		i=5;
		j=0;
		 
		j=++i;
		System.out.println("j=++i; 실행 후, i=" +i+ ", j=" +j);
		System.out.println("홍길동");
		
		System.out.println(i++);
		System.out.println(++j);
		System.out.println("i= "+i+ ", j= " +j);
		
		/*----------------------심화문제----------------------------------------------*/
		 	int  ia = 10, ib = 10, ix, iy;
	        ia++;
	        ++ib;
	        System.out.println("ia:"+ia+", ib:"+ib);	
	        // ia=10이 아니라 11 주의!!!!!!!! 
	        // 라인이 끝나면 다 계산 끝낸 결과가 나오는겨
	        // line42 도 참고

	        ix = --ia;
	        iy = ib--;
	        System.out.println("ia:"+ia+", ib:"+ib);
	        System.out.println("ix:"+ix+", iy:"+iy);
	        
	        /*----------------------심화문제----------------------------------------------*/
	        
	        int num1 = 7, num2 = 7;
	        int result1, result2;

	        result1 = --num1 + 4;
	        result2 = num2-- + 4;
	        System.out.println(num2);	// 참고
	        System.out.println("전위 감소 연산자에 의한 결과 : "+ result1 + ", 변수의 값 : " + num1);
	        System.out.println("후위 감소 연산자에 의한 결과 : "+ result2 + ", 변수의 값 : " + num2);
	        
	        /*----------------------심화문제----------------------------------------------*/
	        int x = 10;
	        int y = x-- + 5 + --x;
	        System.out.println("x : "+ x + ", y : " + y);
	}
}





