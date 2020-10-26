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
		
		String[] weeks = {"일","월","화","수","목","금","토"};
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int day = today.get(Calendar.DATE);
		
//		int c_year;
//		int c_month;
//		int c_date;
		
		System.out.println("'년도'를 입력해주세요: ");
		int c_year  =s.nextInt();
		System.out.println("'월' 을 입력해주세요: ");
		int c_month = s.nextInt();
		c_month = (c_month%12);
		System.out.println("'일'을 입력해주세요: ");
		int c_date = s.nextInt();
		
		
		String today2 = year+"년 "+month+"월 "+day+"일 ";
		String date = c_year+"년 "+c_month+"월"+c_date+"일";
		System.out.println("오늘 날짜 : "+today2);
		System.out.println("D-Day 날짜 : "+date);
		dDay.set(c_year, c_month-1, c_date);
		long gap = (dDay.getTimeInMillis()-today.getTimeInMillis())/(1000*24*60*60);
		
		if(gap>0) {
			System.out.println(gap+"일 남았습니다.");
		}
		else if(gap == 0) {
			System.out.println("오늘입니다!");
		}
		else {
			System.out.println(-gap+"일 지났습니다.");
		}
	} // main
}


