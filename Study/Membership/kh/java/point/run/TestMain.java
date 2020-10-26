package kh.java.point.run;

import java.awt.Font;
import java.util.Scanner;

import kh.java.point.controller.PntMgr;
import javax.swing.*;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PntMgr run = new PntMgr();
		Scanner sc = new Scanner(System.in);

		while(true) {
			Font font = new Font("궁서", 50, 0);
			System.out.println("\n=============================== 회원관리 ===============================");
			System.out.println("1. 기존회원 등록 \t\t 2. 새로운 회원 등록 \t\t 3. 전체 회원 정보 출력");
			System.out.println("4. 포인트적립 \t\t 5. 회원 정보 수정 \t\t 6. 회원 정보 삭제");
			System.out.println("\t\t\t 0. 프로그램 종료");
			System.out.println("======================================================================");
			System.out.print("선택 > ");
			int sel = sc.nextInt();
			switch(sel) {
			case 1:
				run.insertPerson();
				break;
			case 2:
				run.newPerson();
				break;
			case 3:
				run.printData();
				break;
			case 4:
				run.inserpoint();
				break;
			case 5:
				run.modifyData();
				break;
			case 6:
				run.deleteData();
				//index --;
				break;
			case 0:
				System.out.println("이용해주셔서 감사합니다. 프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
			}
			//sc.close();
		}
	}
}
