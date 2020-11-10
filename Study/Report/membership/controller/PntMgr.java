package membership.controller;

import java.util.Scanner;

import kh.java.point.model.vo.Grade;
import membership.model.vo.Gold;
import membership.model.vo.Silver;
import membership.model.vo.Vip;

public class PntMgr{

	Scanner sc = new Scanner(System.in);
	
	Grade[] personList = new Grade[10];
	//ArrayList list = new ArrayList();
	Silver s = new Silver();
	Gold g = new Gold();
	Vip v = new Vip();
	
	int point;
	int score = 0;
	int index = 0;
	String name;
	String rank;
	int purchase;

	public void insertPerson() {
		for(int i=0; i<personList.length; i++) {
			if ( personList[i] == null) {
				System.out.println((i+1) + "번째 회원의 이름을 입력하세요: (그만 입력할래요: 'q')");
				name = sc.next();
				if(name.equals("q")) {
					break;
				}
//				System.out.println((i+1) + "번째 회원의 등급을 입력하세요: ");
//				rank = sc.next();
				System.out.println((i+1) + "번째 회원의 점수를 입력하세요: ");
				score = sc.nextInt();
		
				//index += 1;
				if( score>100000 ) {
					rank = v.getRank();
					personList[i] = new Vip(name, rank, score);
					personList[i].setIndex(index);
				}
				else if (10000 < score && score < 100000) {		//만포인트 이상은 Gold
					rank = g.getRank();
					personList[i] = new Gold(name, rank, score);
					personList[i].setIndex(index);	
				}
				else {
					rank = s.getRank();
					personList[i] = new Silver(name, rank, score);
					personList[i].setIndex(index);
				}
				index ++;
			}
		}
	}
	
	
	
	public void newPerson() {
//		index = 2;
		for(int i=index-1; i<personList.length; i++) {	// 현재 인덱스는 배열의 마지막데이터 다음포인트를 가르킨다
			if ( personList[i] == null) {
				System.out.println("회원의 이름을 입력하세요: (그만 입력할래요: 'q')");
				name = sc.next();
				if(name.equals("q")) {		// 여기를 위해 위의 if문을 써준거야
					break;
				}
				System.out.println("회원의 구매금액을 입력하세요: ");
				purchase = sc.nextInt();
				if(name.equals("q")) {
					break;
				}
		
				int score = 0;
				int point = s.point(purchase);		// 어차피 신규라 이자는 0.03 이다
				score = point;
				index += 1;
				if (score > 100000) {	//십만포인트
					//score += point;				
					personList[i] = new Vip(name, "Vip", score);	
					personList[i].setIndex(i);
				}
				else if (10000 < score && score < 100000) {		//만포인트
					personList[i] = new Gold(name, "Gold", score);
					personList[i].setIndex(i);
					///point = s.point();
				}
				else if (score < 10000) {		//천포인트
					personList[i] = new Silver(name, "Sliver", score);
					personList[i].setIndex(i);
					//point = g.point();
				}
			}
		}
		
	}

	public void printData() {
		System.out.println("\n**************************** 전체 회원정보 출력 ****************************");
		for(int i=0; i<personList.length; i++) {
			if ( personList[i] != null) {
				System.out.println(personList[i].toString());
//				System.out.println("이름: " +personList[i].getName()+ "등급: " +personList[i].getRank()+ "점수: " +personList[i].getScore());
			}	
		} // 추상클래스의 추상메소드
	// 자식클래스들은 강제로 추상메소드인 out(), 이것을 구현해야한다
		System.out.println("\n***********************************************************************\n");
	}

	public void inserpoint() {
		
		//return score += s.point;
		System.out.println("적립하시는 회원의 이름을 입력하세요: ");
		String po_name = sc.next();
		System.out.println("구매금액을 입력하세요: ");
		int new_purchase = sc.nextInt();
		
		int po_index = searchData(po_name);
		int sum = personList[po_index].getScore();
		sum += s.point(new_purchase);
		personList[po_index].setScore(sum);
		
			if (sum > 100000) {	//십만포인트
				//score += point;				
				personList[po_index].setRank("Vip");
			}
			else if (10000 < score && score < 100000) {		//만포인트
				personList[po_index].setRank("Gold");
			}
			else if (score < 10000) {		//천포인트
				personList[po_index].setRank("Silver");
				//point = g.point();
		}
	}
	

	public void modifyData() {
		
		System.out.println("수정할 회원의 이름을 입력하세요: ");
		String name = sc.next();
		int up_index = searchData(name);
		
		System.out.println("수정할 내용이 무엇인가요? (1: 이름 / 2: 등급 / 3: 점수)");
		int sel = sc.nextInt(); 
		switch(sel) {
		case 1:
			System.out.println("새로운 이름을 입력하세요: ");
			String up_name = sc.next(); 
			personList[up_index].setName(up_name);
			break;
		case 2:
			System.out.println("새로운 등급을 입력하세요: ");
			String up_rank = sc.next();
			if(up_rank.equals("Vip")){
				personList[up_index].setScore(100001);
			}
			else if (up_rank.equals("Gold")) {
				personList[up_index].setScore(10001);
			}
			else if (up_rank.equals("Silver")){
				personList[up_index].setScore(0);
			}
			personList[up_index].setRank(up_rank);
			break;
		case 3:
			System.out.println("새로운 점수를 입력하세요: ");
			int up_score = sc.nextInt();
			if( up_score>100000 ) {
				personList[up_index].setRank("Vip");
			}
			else if (10000 < up_score && up_score < 100000) {		//만포인트 이상은 Gold
				personList[up_index].setRank("Gold");
			}
			else {
				personList[up_index].setRank("Silver");
			}
			personList[up_index].setScore(up_score);
			break;
		}
	}

	public void deleteData() {
		boolean bool=true;
		while (bool) {
			System.out.println("삭제하려는 회원의 이름을 입력하세요: ");
			String del_name = sc.next();
			int del_index = searchData(del_name);
			personList[del_index]=null;

			for(int i=del_index+1; i<personList.length; i++) {
				if (personList[i] != null ) {			// 빈 방이 널이 아닐경우
					personList[i].setIndex(i-1);
					personList[i-1]=personList[i];
				}
			}
			personList[index-1] = null;
			index--;
			System.out.println(" 삭제하려는 회원이 또 있으신가요? (1. 네 / 2. 아니요)");
			int sel = sc.nextInt();
			if (sel == 1) {
				bool = true;
			}
			else {
				bool = false;
			}
		}
	}

	public int searchData(String name) {
		int a = 0;
		for (int i=0; i<personList.length; i++) {
			if(personList[i].getName().equals(name)) {
				a = personList[i].getIndex();
				return a;
			}
		}
		return a;
	}
}

//	public double start() {
//		return 0;
//	}

//		personList[del_index].setIndex(personList[del_index].getIndex()-1);
//		personList[del_index].setName(null);
//		personList[del_index].setRank(null);
//		personList[del_index].setScore(0);;




//
//if (rank.equals("Silver")) {
//personList[i] = new Silver(name, rank, score);	
//personList[i].setIndex(index);
//
////System.out.println(index);
//}
//else if (rank.equals("Gold")) {
//personList[i] = new Gold(name, rank, score);
//personList[i].setIndex(index);		
////System.out.println(index);
//}
//else if (rank.equals("Vip")) {
//personList[i] = new Vip(name, rank, score);	
//personList[i].setIndex(index);
//System.out.println(index);
//
//}
//else {
//System.out.println("없는 등급입니다. 프로그램을 종료합니다");
//System.exit(0);
//}




