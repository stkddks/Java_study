package api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
public class Date {
	
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		String pattern; 
		Scanner s = new Scanner(System.in);
		
		java.util.Date inDate = null;
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int day = today.get(Calendar.DATE);
		
		String c_year = null;
		String c_month = null;
		String c_date = null;
		
		System.out.println("'�⵵'�� �Է����ּ���: ");
		c_year  =s.next();
		System.out.println("'��' �� �Է����ּ���: ");
		c_month = s.next();
		System.out.println("'��'�� �Է����ּ���: ");
		c_date = s.next();
//		
		
		long gap = (dDay.getTimeInMillis()-c.getTimeInMillis())/(1000*24*60*60);
		String today = year+"�� "+month+"�� "+day+"�� ";
		String date = dYear+"�� "+dMonth+"��"+dDate+"��";
		System.out.println("���� ��¥ : "+today);
		System.out.println("D-Day ��¥ : "+date);
		System.out.println(gap+"�� ���ҽ��ϴ�.");
		
		
		pattern = (String)c_year+"��"+(String)c_month+"��"+(String)c_date+"��";
		DateFormat df = new SimpleDateFormat(pattern);
		while(s.hasNextLine()) {
			try {
				inDate = df.parse(s.nextLine());
				break;
			} catch(Exception e) {
//				System.out.println("��¥�� " + pattern 
//						+ "�� ���·� �ٽ� �Է����ּ���.(�Է¿�:2019/12/31)");
			}
		} // while
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		long day1 = (cal.getTimeInMillis()
				- today.getTimeInMillis())/(60*60*1000);
		System.out.println("�Է��Ͻ� ��¥�� ����� "+ day1 +"�ð� ���̰� �ֽ��ϴ�.");
	} // main
}


