
// ���� ��¥�� �ð��� ���� �Է¹޾� ��Ʈ�������� ����ϱ� 

package api;

import java.sql.Date;
import java.util.Calendar;

public class Calender {
	public static void main(String[] args) {
	Calendar today = Calendar.getInstance();	
	// getInstance �� ���� �ڽİ�ü(GregorianCalendar)�� ������
	// GregorianCalendar�� �ѱ� ǥ�� �ð����� ���� ������ ������
	
	int year = today.get(Calendar.YEAR);
	int month = today.get(Calendar.MONTH)+1;
	int day = today.get(Calendar.DATE);
	int am_pm = today.get(Calendar.AM_PM);
	int hour = today.get(Calendar.HOUR);
	int minute = today.get(Calendar.MINUTE);
	int second = today.get(Calendar.SECOND);
	int week = today.get(Calendar.DAY_OF_WEEK);
	String week2 = null;
	String am_pm1 = null;
	
	String week1[] = {"��", "��", "ȭ", "��", "��", "��", "��"};
	for (int i=0; i<week1.length; i++) {
		if (week == i+1) {
			week2 = week1[i];
		}
	}
	
	if (am_pm == 0) {
		am_pm1 = "����";
	}
	else {
		am_pm1 = "����";
	}
	
	System.out.println(year+ "�� " +month+ "�� " +day+ "�� " +week2+ "���� " +am_pm1+ " " +hour+ "�� " +minute+ "�� " +second+ "�� ");
//	
//	System.out.println(today.get(Calendar.YEAR)); 		  // �⵵ ���
//	System.out.println( today.get(Calendar.MONTH)+1 ); // 0 ~ 11 => +1�� �ؾ���
//	System.out.println( today.get(Calendar.DATE) ); // ��
//	System.out.println( today.get(Calendar.AM_PM) ); // ����0 , ����1		
//	System.out.println( today.get(Calendar.HOUR) ); // �ð�		
//	System.out.println( today.get(Calendar.MINUTE) ); // ��		
//	System.out.println( today.get(Calendar.SECOND) ); // ��		
//	System.out.println( today.get(Calendar.DAY_OF_WEEK) ); // �Ͽ��� 1  ~ �����7
//	
	today.set(Calendar.YEAR, 2016);
	System.out.println(today.get(Calendar.YEAR));
	Date today1 = new Date(0);
	//�ý������κ��� ���� ��¥, �ð� ������ ������ �⺻������ ���

	Date today2 = new Date(123456789L);
	//long�� �������� ������ ��¥ �ð� �����(�и���)
	//1970�� 1�� 1�� 09�� 00�� 00�ʸ� �������� ��.
	
	//Date today3 = new Date(Calendar.getTimeMillis());
	
	System.out.println(today1);
	System.out.println(today2);
	
	
	}
	
}
