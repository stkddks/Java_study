package api;

//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Date {
	
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar dDay = Calendar.getInstance();
		Scanner s = new Scanner(System.in);
		
		String[] weeks = {"��","��","ȭ","��","��","��","��"};
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int day = today.get(Calendar.DATE);
		
//		int c_year;
//		int c_month;
//		int c_date;
		
		System.out.println("'�⵵'�� �Է����ּ���: ");
		int c_year  =s.nextInt();
		System.out.println("'��' �� �Է����ּ���: ");
		int c_month = s.nextInt();
		c_month = (c_month%12);
		System.out.println("'��'�� �Է����ּ���: ");
		int c_date = s.nextInt();
		
		
		String today2 = year+"�� "+month+"�� "+day+"�� ";
		String date = c_year+"�� "+c_month+"��"+c_date+"��";
		System.out.println("���� ��¥ : "+today2);
		System.out.println("D-Day ��¥ : "+date);
		dDay.set(c_year, c_month-1, c_date);
		long gap = (dDay.getTimeInMillis()-today.getTimeInMillis())/(1000*24*60*60);
		
		if(gap>0) {
			System.out.println(gap+"�� ���ҽ��ϴ�.");
		}
		else if(gap == 0) {
			System.out.println("�����Դϴ�!");
		}
		else {
			System.out.println(-gap+"�� �������ϴ�.");
		}
	} // main
}


