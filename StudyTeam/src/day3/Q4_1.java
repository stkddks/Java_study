package day3;

import java.util.Scanner;

public class Q4_1 {

   public static void main(String[] args) {

      String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
      int score[] = { 95, 88, 76, 62, 55 };
      Scanner sc = new Scanner(System.in);

      while (true) {
         
         int i = 0;
         System.out.print("이름 ? >>");
         String name = sc.next();
         if (name.equals("그만")) {
        	 System.exit(0);
         }
         for (i = 0; i < course.length; i++) {
            if (course[i].equals(name)) {
               int n = score[i];
               System.out.println(name + " 과목의 점수는 " + n);
            }
            else if (!course[i].equals(name)) {
                System.out.println(name+" 없는 과목입니다");
                break;
             }
         }

      }

   }
}