package mission;
import java.util.Scanner;
public class Apart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int apart[][] = new int[20][];
		//apart[0] = new int[1];
		System.out.println("===========A아파트 정보 입력=============");
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("건물의 층 수 입력: ");
		int a = sc.nextInt();			// 건물의 층수
		System.out.println(a+"층이 생성되었습니다.");
		
		int [][]floor = new int[a][];	// 층마다의 호수(방 갯수)
		int []room = new int[a];// 호수(방 갯수)
		String [][] rooms = new String[a][];	// 입주자 이름 (몇층 몇호)
		int hosel;	// 층마다의 호실 갯수
		
		for(int i=0; i<a; i++) {
		    System.out.print((i+1)+"층의 총 호실 입력 : ");
		    hosel = sc.nextInt();
		    floor[i]=new int[hosel];
		    rooms [i]=new String[hosel];
		    room[i]=hosel;	// 나중 출력을 위한 배열
		    }
		
		for(int i=0; i<a; i++) {
			System.out.println((i+1)+"층은 " + room[i] +"호실까지 생성 되었습니다.");
			}
		System.out.println("각 호실마다 입주자의 이름을 입력하세요");
		
		for(int i=0; i<a; i++) {
			System.out.println("=========" + (i+1)+"층 정보 입력 =========");
			for(int j=0; j<room[i]; j++) {
				System.out.printf((i+1)+"층 "+(j+1)+"호 입주자 : ");
				rooms[i][j] = sc.next();
				}
			} 
		System.out.println("============각 층 입주자 정보 출력=============");
		
		for(int i=0; i<a; i++) {
		System.out.print((i+1)+"층 :");
		for(int j=0; j<room[i]; j++) {
			System.out.print(rooms[i][j]+"\t");
		 }
		System.out.println("");
		sc.close();
		}

//		System.out.println("1층의 총 호실 입력: ");
//		int a1 = sc.nextInt();
//		System.out.println("2층의 총 호실 입력: ");
//		int b1 = sc.nextInt();
//		System.out.println("3층의 총 호실 입력: ");
//		int c1 = sc.nextInt();
//		System.out.println(a+ "층은" +a1+ "호실까지 생성되었습니다.");
//		System.out.println((a+1)+ "층은" +b1+ "호실까지 생성되었습니다.");
//		System.out.println((a+2)+ "층은" +c1+ "호실까지 생성되었습니다.");

	}
}
