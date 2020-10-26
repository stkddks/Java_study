
//호텔 프로그램 만들기

package mission;
import java.util.*;
public class Hotel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] room = new boolean[10];	// 방 크기 설정 (기본값 false) 
		while(true) {
			int roomNum = 0;	
			System.out.println("호텔관리 프로그램 v1.0");
			System.out.println("1.입실	2.퇴실	3.방보기	4.종료");
			System.out.printf("선택 > ");
			int selct = sc.nextInt();

			switch(selct) {
			case 1: 
				System.out.print("몇 번 방에 입실하시겠습니까? ");
				roomNum = sc.nextInt() - 1;
				
				if (room[roomNum]) {		//true 일때 = 방이 차있다
					System.out.println((roomNum + 1) + "번 방은 이미 손님이 계십니다.");
					System.out.println();
					break;
				}
				room[roomNum] = true;
				System.out.println((roomNum + 1) + "번 방에 입실하셨습니다.");
				System.out.println();
				
				
				try {
					Thread.sleep(1000); //1초 대기
					} catch (InterruptedException e) {
						e.printStackTrace();
						}
				break;
				
			case 2:
				System.out.print("몇 번 방에서 퇴실하시겠습니까? ");
				int outroomNum = sc.nextInt() - 1;
				
				if (!room[outroomNum]) {	//false 일때
					System.out.println("선택하신 " + (outroomNum + 1) + "번 방은 이미 비어있습니다.");
					System.out.println();
					break;
				}
				room[outroomNum] = false;
				System.out.println((outroomNum + 1) + "번 방에서 퇴실하셨습니다.");
				System.out.println();
				try {
					Thread.sleep(1000); //1초 대기
					} catch (InterruptedException e) {
						e.printStackTrace();
						}
				break;
				
			case 3: 
				for (int i = 0; i < room.length; i++) {
					if (room[i]) {
						System.out.println("\t" + (i + 1) + "번 방은 현재 손님이 있습니다.");
					} else {
						System.out.println("\t" + (i + 1) + "번 방은 현재 비어있습니다.");
					}
				}
				System.out.println();
				try {
					Thread.sleep(1000); //1초 대기
					} catch (InterruptedException e) {
						e.printStackTrace();
						}
				break;
				
			case 4: 
				System.out.println("프로그램을 종료합니다!");
				sc.close();
				return;
			default:
				System.out.println("비정상적인 입력입니다.");
			}
		}
	}
}
