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
			Font font = new Font("�ü�", 50, 0);
			System.out.println("\n=============================== ȸ������ ===============================");
			System.out.println("1. ����ȸ�� ��� \t\t 2. ���ο� ȸ�� ��� \t\t 3. ��ü ȸ�� ���� ���");
			System.out.println("4. ����Ʈ���� \t\t 5. ȸ�� ���� ���� \t\t 6. ȸ�� ���� ����");
			System.out.println("\t\t\t 0. ���α׷� ����");
			System.out.println("======================================================================");
			System.out.print("���� > ");
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
				System.out.println("�̿����ּż� �����մϴ�. ���α׷��� �����մϴ�.");
				System.exit(0);
				break;
			default:
			}
			//sc.close();
		}
	}
}
