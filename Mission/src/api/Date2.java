
// 민규쓰코드

package api;

import java.util.Calendar;
import java.util.Scanner;

public class Date2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calendar c = Calendar.getInstance();
		Calendar dDay = Calendar.getInstance();
		
		String[] weeks = {"일","월","화","수","목","금","토"};
		int year,month,day,hour,minute,second,week;
		System.out.print("D-Day 년도 입력 : ");
		int dYear = sc.nextInt();
		System.out.print("D-Day 월 입력 : ");
		int dMonth = sc.nextInt();
		System.out.print("D-Day 일 입력 : ");
		int dDate = sc.nextInt();
		
		dDay.set(dYear, dMonth-1, dDate);
		year = c.get(Calendar.YEAR);
		month = c.get(Calendar.MONTH)+1;
		day = c.get(Calendar.DAY_OF_MONTH);
		hour = c.get(Calendar.HOUR_OF_DAY);
		minute = c.get(Calendar.MINUTE);
		second = c.get(Calendar.SECOND);
		week = c.get(Calendar.DAY_OF_WEEK)-1;
//      String today = year+"년 "+month+"월 "+day+"일 "+hour+"시 "+minute+"분 "+second+"초 "+weeks[week]+"요일";
		long gap = (dDay.getTimeInMillis()-c.getTimeInMillis())/(1000*24*60*60);
		String today = year+"년 "+month+"월 "+day+"일 ";
		String date = dYear+"년 "+dMonth+"월"+dDate+"일";
		System.out.println("오늘 날짜 : "+today);
		System.out.println("D-Day 날짜 : "+date);
		if(gap>0)System.out.println(gap+"일 남았습니다.");
		else if(gap == 0)System.out.println("오늘입니다!");
		else System.out.println(-gap+"일 지났습니다.");
	}
}