
// �������ڵ�

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
		
		String[] weeks = {"��","��","ȭ","��","��","��","��"};
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int day = today.get(Calendar.DATE);
		      
      Scanner input = new Scanner(System.in);

      System.out.print("�� D-day �⵵ �Է� : ");
      year = input.nextInt();
      System.out.print("�� D-day �� �Է� : ");
      month = input.nextInt();
      System.out.print("�� D-day �� �Է� : ");
      day = input.nextInt();

      // ����� ��¥ Format
      SimpleDateFormat pattern = new SimpleDateFormat();
      pattern.applyPattern("��  yyyy�� M�� d�� E���� ��");

      // ���� �ð��� ���� �ִ� Calendar
      Calendar rightNow = new GregorianCalendar(Locale.KOREA);
      Calendar targetDay = Calendar.getInstance(); // ����ð�

      targetDay.set(year, month - 1, day); // ���� 0~11�����̹Ƿ� -1

      // D-Day�� ���� ��¥�� ���̸� millis sec ������ ����
      long difference = targetDay.getTimeInMillis() - rightNow.getTimeInMillis();
      long aDay = 24 * 60 * 60 * 1000; // �Ϸ� �ð� ����
      long days = difference / aDay; // ���� ��¥ ���

      // ���ó�¥ ���

      String today2 = pattern.format(rightNow.getTime());
      System.out.println("�� ���� ��¥ " + today2);

      // ���
//      StringBuilder print = new StringBuilder();
      System.out.print("�� D-day ��¥ ");
      System.out.println(pattern.format(targetDay.getTime()) + "\n��" + days + "�� ���Ƶ� ��");
   }

}