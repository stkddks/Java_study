
// �αԾ��ڵ�

package api;

import java.util.Calendar;
import java.util.Scanner;

public class Date2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calendar c = Calendar.getInstance();
		Calendar dDay = Calendar.getInstance();
		
		String[] weeks = {"��","��","ȭ","��","��","��","��"};
		int year,month,day,hour,minute,second,week;
		System.out.print("D-Day �⵵ �Է� : ");
		int dYear = sc.nextInt();
		System.out.print("D-Day �� �Է� : ");
		int dMonth = sc.nextInt();
		System.out.print("D-Day �� �Է� : ");
		int dDate = sc.nextInt();
		
		dDay.set(dYear, dMonth-1, dDate);
		year = c.get(Calendar.YEAR);
		month = c.get(Calendar.MONTH)+1;
		day = c.get(Calendar.DAY_OF_MONTH);
		hour = c.get(Calendar.HOUR_OF_DAY);
		minute = c.get(Calendar.MINUTE);
		second = c.get(Calendar.SECOND);
		week = c.get(Calendar.DAY_OF_WEEK)-1;
//      String today = year+"�� "+month+"�� "+day+"�� "+hour+"�� "+minute+"�� "+second+"�� "+weeks[week]+"����";
		long gap = (dDay.getTimeInMillis()-c.getTimeInMillis())/(1000*24*60*60);
		String today = year+"�� "+month+"�� "+day+"�� ";
		String date = dYear+"�� "+dMonth+"��"+dDate+"��";
		System.out.println("���� ��¥ : "+today);
		System.out.println("D-Day ��¥ : "+date);
		if(gap>0)System.out.println(gap+"�� ���ҽ��ϴ�.");
		else if(gap == 0)System.out.println("�����Դϴ�!");
		else System.out.println(-gap+"�� �������ϴ�.");
	}
}