
// 오늘 날짜와 시간을 각각 입력받아 스트링문으로 출력하기 

package api;

import java.sql.Date;
import java.util.Calendar;

public class Calender {
	public static void main(String[] args) {
	Calendar today = Calendar.getInstance();	
	// getInstance 를 통해 자식객체(GregorianCalendar)를 생성함
	// GregorianCalendar는 한구 표준 시간대의 대한 정보를 가져옴
	
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
	
	String week1[] = {"일", "월", "화", "수", "목", "금", "토"};
	for (int i=0; i<week1.length; i++) {
		if (week == i+1) {
			week2 = week1[i];
		}
	}
	
	if (am_pm == 0) {
		am_pm1 = "오전";
	}
	else {
		am_pm1 = "오후";
	}
	
	System.out.println(year+ "년 " +month+ "월 " +day+ "일 " +week2+ "요일 " +am_pm1+ " " +hour+ "시 " +minute+ "분 " +second+ "초 ");
//	
//	System.out.println(today.get(Calendar.YEAR)); 		  // 년도 출력
//	System.out.println( today.get(Calendar.MONTH)+1 ); // 0 ~ 11 => +1을 해야함
//	System.out.println( today.get(Calendar.DATE) ); // 일
//	System.out.println( today.get(Calendar.AM_PM) ); // 오전0 , 오후1		
//	System.out.println( today.get(Calendar.HOUR) ); // 시간		
//	System.out.println( today.get(Calendar.MINUTE) ); // 분		
//	System.out.println( today.get(Calendar.SECOND) ); // 초		
//	System.out.println( today.get(Calendar.DAY_OF_WEEK) ); // 일요일 1  ~ 토요일7
//	
	today.set(Calendar.YEAR, 2016);
	System.out.println(today.get(Calendar.YEAR));
	Date today1 = new Date(0);
	//시스템으로부터 현재 날짜, 시간 정보를 가져와 기본값으로 사용

	Date today2 = new Date(123456789L);
	//long형 정수값을 가지고 날짜 시간 계산함(밀리초)
	//1970년 1월 1일 09시 00분 00초를 기준으로 함.
	
	//Date today3 = new Date(Calendar.getTimeMillis());
	
	System.out.println(today1);
	System.out.println(today2);
	
	
	}
	
}
