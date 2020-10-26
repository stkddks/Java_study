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
		
		System.out.println("'년도'를 입력해주세요: ");
		c_year  =s.next();
		System.out.println("'월' 을 입력해주세요: ");
		c_month = s.next();
		System.out.println("'일'을 입력해주세요: ");
		c_date = s.next();
//		
		
		long gap = (dDay.getTimeInMillis()-c.getTimeInMillis())/(1000*24*60*60);
		String today = year+"년 "+month+"월 "+day+"일 ";
		String date = dYear+"년 "+dMonth+"월"+dDate+"일";
		System.out.println("오늘 날짜 : "+today);
		System.out.println("D-Day 날짜 : "+date);
		System.out.println(gap+"일 남았습니다.");
		
		
		pattern = (String)c_year+"년"+(String)c_month+"월"+(String)c_date+"일";
		DateFormat df = new SimpleDateFormat(pattern);
		while(s.hasNextLine()) {
			try {
				inDate = df.parse(s.nextLine());
				break;
			} catch(Exception e) {
//				System.out.println("날짜를 " + pattern 
//						+ "의 형태로 다시 입력해주세요.(입력예:2019/12/31)");
			}
		} // while
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		long day1 = (cal.getTimeInMillis()
				- today.getTimeInMillis())/(60*60*1000);
		System.out.println("입력하신 날짜는 현재와 "+ day1 +"시간 차이가 있습니다.");
	} // main
}


