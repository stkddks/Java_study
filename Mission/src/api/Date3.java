
// 지원쓰코드

package api;

import java.text.SimpleDateFormat;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;
public class Date3 {
	
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar dDay = Calendar.getInstance();
		Scanner s = new Scanner(System.in);
		
		String[] weeks = {"일","월","화","수","목","금","토"};
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int day = today.get(Calendar.DATE);
		      
      Scanner input = new Scanner(System.in);

      System.out.print("♡ D-day 년도 입력 : ");
      year = input.nextInt();
      System.out.print("♡ D-day 월 입력 : ");
      month = input.nextInt();
      System.out.print("♡ D-day 일 입력 : ");
      day = input.nextInt();

      // 출력할 날짜 Format
      SimpleDateFormat pattern = new SimpleDateFormat();
      pattern.applyPattern("♡  yyyy년 M월 d일 E요일 ♡");

      // 현재 시간을 갖고 있는 Calendar
      Calendar rightNow = new GregorianCalendar(Locale.KOREA);
      Calendar targetDay = Calendar.getInstance(); // 현재시간

      targetDay.set(year, month - 1, day); // 월은 0~11단위이므로 -1

      // D-Day와 현재 날짜의 차이를 millis sec 단위로 구함
      long difference = targetDay.getTimeInMillis() - rightNow.getTimeInMillis();
      long aDay = 24 * 60 * 60 * 1000; // 하루 시간 단위
      long days = difference / aDay; // 남은 날짜 계산

      // 오늘날짜 출력

      String today2 = pattern.format(rightNow.getTime());
      System.out.println("♡ 오늘 날짜 " + today2);

      // 출력
//      StringBuilder print = new StringBuilder();
      System.out.print("♡ D-day 날짜 ");
      System.out.println(pattern.format(targetDay.getTime()) + "\n♡" + days + "일 남아따 ♡");
   }

}