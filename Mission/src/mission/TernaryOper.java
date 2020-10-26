

/*
 * A,B,C 사원의 연봉을 입려받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고 인센티브 포함 급여가 3000만원 이상이면 "3000 이상",
 * 미만이면, "3000 미만"을 출력하세요
 * (A사원의 인세티브는 0.4, B 사원의 인센티브는 없으며, C사원읜 인센티브는 0.15) 
 */




package mission;
import java.util.Scanner;
public class TernaryOper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = "3000이상";
		String s2 ="3000미만";
		
		System.out.printf("A사원의 연봉: ");
		double A = sc.nextInt();
		double a = A*1.4;
		// double a = A+(A*0.4);
		   
		System.out.printf("B사원의 연봉: ");
		double B = sc.nextInt();
		double b = B;
		   
		System.out.printf("C사원의 연봉: ");
		double C = sc.nextInt();
		double c = C*1.15;
		   
		System.out.println("\nA사원 연봉/연봉+a : "+(int)A+ "/" +a );
		System.out.printf( a >= 3000? s1 : s2);
		System.out.println("\nB사원 연봉/연봉+a : "+(int)B+ "/" +b);
		System.out.printf( b >= 3000? s1 : s2);
		System.out.println("\nC사원 연봉/연봉+a : "+(int)C+ "/" +c);
		System.out.printf( c >= 3000? s1 : s2);
		
		/*
		System.out.printf("\nA사원 연봉/연봉+a : "+A+ "/" +a);
		if (a>=3000.0 | b>=3000.0 | c>=3000.0) {
			System.out.println("\n3000만원 이상");
		} else{
			System.out.println("\n3000만원 미만");  
		}
		
		System.out.printf("B사원 연봉/연봉+a : "+B+ "/" +b);
		if (b>30_000_000) {
			System.out.println("\n3000만원 이상");
		} else {
			System.out.println("\n3000만원 미만");  
		}
		
		System.out.printf("C사원 연봉/연봉+a : "+C+ "/" +c);
		if (c>30_000_000) {
			System.out.println("\n3000만원 이상");
		} else{
			System.out.println("\n3000만원 미만");  
		}   
		*/
		sc.close();
	}
		   
}

/*
if (a>=3000.0 || b>=3000.0 || c>=3000.0) {
	String as= "3000만원 이상", bs= "3000만원 이상", cs = "3000만원 이상";
	System.out.printf("\nA사원 연봉/연봉+a : "+A+ "/" +a+ "\n" +as);
	System.out.printf("B사원 연봉/연봉+a : "+B+ "/" +b+ "\n" +bs);
	System.out.printf("C사원 연봉/연봉+a : "+C+ "/" +c+ "\n" +cs);
} else{
	String as="3000만원 미만", bs="3000만원 미만", cs = "3000만원 미만";
	System.out.printf("\nA사원 연봉/연봉+a : "+A+ "/" +a+ "\n%s" +as);
	System.out.printf("B사원 연봉/연봉+a : "+B+ "/" +b+ "\n%s" +bs);
	System.out.printf("C사원 연봉/연봉+a : "+C+ "/" +c+ "\n%s" +cs);
	//System.out.println("\n3000만원 미만");  
}
*/