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
				System.out.println((i+1) + "��° ȸ���� �̸��� �Է��ϼ���: (�׸� �Է��ҷ���: 'q')");
				name = sc.next();
				if(name.equals("q")) {
					break;
				}
//				System.out.println((i+1) + "��° ȸ���� ����� �Է��ϼ���: ");
//				rank = sc.next();
				System.out.println((i+1) + "��° ȸ���� ������ �Է��ϼ���: ");
				score = sc.nextInt();
		
				//index += 1;
				if( score>100000 ) {
					rank = v.getRank();
					personList[i] = new Vip(name, rank, score);
					personList[i].setIndex(index);
				}
				else if (10000 < score && score < 100000) {		//������Ʈ �̻��� Gold
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
		for(int i=index-1; i<personList.length; i++) {	// ���� �ε����� �迭�� ������������ ��������Ʈ�� ����Ų��
			if ( personList[i] == null) {
				System.out.println("ȸ���� �̸��� �Է��ϼ���: (�׸� �Է��ҷ���: 'q')");
				name = sc.next();
				if(name.equals("q")) {		// ���⸦ ���� ���� if���� ���ذž�
					break;
				}
				System.out.println("ȸ���� ���űݾ��� �Է��ϼ���: ");
				purchase = sc.nextInt();
				if(name.equals("q")) {
					break;
				}
		
				int score = 0;
				int point = s.point(purchase);		// ������ �űԶ� ���ڴ� 0.03 �̴�
				score = point;
				index += 1;
				if (score > 100000) {	//�ʸ�����Ʈ
					//score += point;				
					personList[i] = new Vip(name, "Vip", score);	
					personList[i].setIndex(i);
				}
				else if (10000 < score && score < 100000) {		//������Ʈ
					personList[i] = new Gold(name, "Gold", score);
					personList[i].setIndex(i);
					///point = s.point();
				}
				else if (score < 10000) {		//õ����Ʈ
					personList[i] = new Silver(name, "Sliver", score);
					personList[i].setIndex(i);
					//point = g.point();
				}
			}
		}
		
	}

	public void printData() {
		System.out.println("\n**************************** ��ü ȸ������ ��� ****************************");
		for(int i=0; i<personList.length; i++) {
			if ( personList[i] != null) {
				System.out.println(personList[i].toString());
//				System.out.println("�̸�: " +personList[i].getName()+ "���: " +personList[i].getRank()+ "����: " +personList[i].getScore());
			}	
		} // �߻�Ŭ������ �߻�޼ҵ�
	// �ڽ�Ŭ�������� ������ �߻�޼ҵ��� out(), �̰��� �����ؾ��Ѵ�
		System.out.println("\n***********************************************************************\n");
	}

	public void inserpoint() {
		
		//return score += s.point;
		System.out.println("�����Ͻô� ȸ���� �̸��� �Է��ϼ���: ");
		String po_name = sc.next();
		System.out.println("���űݾ��� �Է��ϼ���: ");
		int new_purchase = sc.nextInt();
		
		int po_index = searchData(po_name);
		int sum = personList[po_index].getScore();
		sum += s.point(new_purchase);
		personList[po_index].setScore(sum);
		
			if (sum > 100000) {	//�ʸ�����Ʈ
				//score += point;				
				personList[po_index].setRank("Vip");
			}
			else if (10000 < score && score < 100000) {		//������Ʈ
				personList[po_index].setRank("Gold");
			}
			else if (score < 10000) {		//õ����Ʈ
				personList[po_index].setRank("Silver");
				//point = g.point();
		}
	}
	

	public void modifyData() {
		
		System.out.println("������ ȸ���� �̸��� �Է��ϼ���: ");
		String name = sc.next();
		int up_index = searchData(name);
		
		System.out.println("������ ������ �����ΰ���? (1: �̸� / 2: ��� / 3: ����)");
		int sel = sc.nextInt(); 
		switch(sel) {
		case 1:
			System.out.println("���ο� �̸��� �Է��ϼ���: ");
			String up_name = sc.next(); 
			personList[up_index].setName(up_name);
			break;
		case 2:
			System.out.println("���ο� ����� �Է��ϼ���: ");
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
			System.out.println("���ο� ������ �Է��ϼ���: ");
			int up_score = sc.nextInt();
			if( up_score>100000 ) {
				personList[up_index].setRank("Vip");
			}
			else if (10000 < up_score && up_score < 100000) {		//������Ʈ �̻��� Gold
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
			System.out.println("�����Ϸ��� ȸ���� �̸��� �Է��ϼ���: ");
			String del_name = sc.next();
			int del_index = searchData(del_name);
			personList[del_index]=null;

			for(int i=del_index+1; i<personList.length; i++) {
				if (personList[i] != null ) {			// �� ���� ���� �ƴҰ��
					personList[i].setIndex(i-1);
					personList[i-1]=personList[i];
				}
			}
			personList[index-1] = null;
			index--;
			System.out.println(" �����Ϸ��� ȸ���� �� �����Ű���? (1. �� / 2. �ƴϿ�)");
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
//System.out.println("���� ����Դϴ�. ���α׷��� �����մϴ�");
//System.exit(0);
//}




