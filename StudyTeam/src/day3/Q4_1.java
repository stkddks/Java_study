package day3;

import java.util.Scanner;

public class Q4_1 {

   public static void main(String[] args) {

      String course[] = { "Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
      int score[] = { 95, 88, 76, 62, 55 };
      Scanner sc = new Scanner(System.in);

      while (true) {
         
         int i = 0;
         System.out.print("�̸� ? >>");
         String name = sc.next();
         if (name.equals("�׸�")) {
        	 System.exit(0);
         }
         for (i = 0; i < course.length; i++) {
            if (course[i].equals(name)) {
               int n = score[i];
               System.out.println(name + " ������ ������ " + n);
            }
            else if (!course[i].equals(name)) {
                System.out.println(name+" ���� �����Դϴ�");
                break;
             }
         }

      }

   }
}