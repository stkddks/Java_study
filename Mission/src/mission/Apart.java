package mission;
import java.util.Scanner;
public class Apart {

	public static void main(String[] args) {
		
		System.out.println("===========A아파트 정보 입력=============");
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("건물의 층 수 입력: ");
		int a = sc.nextInt();			// 건물의 층수
		System.out.println(a+"층이 생성되었습니다.");
		
		String [][] floor = new String[a][];	// 입주자 이름 (몇층 몇호)
		int []room = new int[a];// 호수(방 갯수)
		
		int hosel;	// 선택호수 변수
		for(int i=0; i<a; i++) {
		    System.out.print((i+1)+"층의 총 호실 입력 : ");
		    hosel = sc.nextInt();	//
		    floor[i]=new String[hosel];		//people
		    room[i]=sc.nextInt();;	// 나중 출력을 위한 배열		//
		    }
		
		for(int i=0; i<a; i++) {
			System.out.println((i+1)+"층은 " + room[i] +"호실까지 생성 되었습니다.");
			}
		System.out.println("각 호실마다 입주자의 이름을 입력하세요");
		
		for(int i=0; i<a; i++) {
			System.out.println("=========" + (i+1)+"층 정보 입력 =========");
			for(int j=0; j<room[i]; j++) {
				System.out.printf((i+1)+"층 "+(j+1)+"호 입주자 : ");
				floor[i][j] = sc.next();
				}
			} 
		System.out.println("============각 층 입주자 정보 출력=============");
		
		for(int i=0; i<a; i++) {
			System.out.print((i+1)+"층 :");
			for(int j=0; j<room[i]; j++) {
				System.out.print(floor[i][j]+"\t");
		 }
		System.out.println("");
		sc.close();
		}
	}
}
