package game;
import java.util.Scanner;

public class Game_369 {
   static Scanner scan = new Scanner(System.in);
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      System.out.println("������ �������ּ���. 1. 369���� 2. ���������� ����");
      int gamesel = scan.nextInt();
      switch(gamesel){
      case 1:
         System.out.println("369 ������ �����մϴ�.");
         System.out.println("����ڳ� ��ǻ�Ͱ� 50�� ���Ҷ����� ��Ƽ�� ������� �¸��Դϴ�.");
         System.out.println("������ �����ּ���. 1.��ǻ�� �� 2.����� ��");
         int sel = scan.nextInt();
         switch(sel){
         case 1: 
            computerFirst();
            break;
         case 2:
            meFirst();
            break;
         }
         break;
      case 2:
         System.out.println("���������� ������ �����մϴ�.");
         rcp();
         break;
      }
   }
   
   public static void meFirst() {
      System.out.println("������ ����� ���� �����մϴ�.");
      int cp = 2;
      while(true) {
         System.out.print("����� : ");
         String num = scan.next();
         if(Integer.toString(cp-1).contains("3") || Integer.toString(cp-1).contains("6") || Integer.toString(cp-1).contains("9")) {
            if(!num.equals("¦")) {
               System.out.println("��ǻ�Ϳ��� �����ϴ�.");
               break;
            }
         }
         else if(Integer.toString(cp-1).equals("33") || Integer.toString(cp-1).equals("36") || Integer.toString(cp-1).equals("36")) {
            if(!num.equals("¦¦")) {
               System.out.println("��ǻ�Ϳ��� �����ϴ�.");
               break;
            }
         }
         else {
            if((cp-1)!=Integer.parseInt(num)) {
               System.out.println("��ǻ�Ϳ��� �����ϴ�.");
               break;
            }
         }
         
         if(Integer.toString(cp).contains("3") || Integer.toString(cp).contains("6") || Integer.toString(cp).contains("9")) {
            System.out.println("��ǻ�� : ¦");
         }
         else if(Integer.toString(cp).equals("33") || Integer.toString(cp).equals("36") || Integer.toString(cp).equals("39")) {
            System.out.println("��ǻ�� : ¦¦");
         }
         else {
            System.out.println("��ǻ�� : " + cp);
         }
         
         /*
         if(cp==50 || Integer.parseInt(num)==50) {
            System.out.println("������� �¸��Դϴ�.");
            break;
         }
         */
         cp += 2;
         
      }
   }
   
   public static void computerFirst() {
      System.out.println("������ ��ǻ�� ���� �����մϴ�.");
      int cp = 28;
      while(true) {         
         if(Integer.toString(cp).contains("3") || Integer.toString(cp).contains("6") || Integer.toString(cp).contains("9")) {
            System.out.println("��ǻ�� : ¦");
         }
         else if(Integer.toString(cp).equals("33") || Integer.toString(cp).equals("36") || Integer.toString(cp).equals("39")) {
            System.out.println("��ǻ�� : ¦¦");
         }
         else {
            System.out.println("��ǻ�� : " + cp);
         }
         
         System.out.print("����� : ");
         String num = scan.next();
         if(Integer.toString(cp+1).contains("3") || Integer.toString(cp+1).contains("6") || Integer.toString(cp+1).contains("9")) {
            if(!num.equals("¦")) {
               System.out.println("��ǻ�Ϳ��� �����ϴ�.");
               break;
            }
         }
         else if(Integer.toString(cp+1).equals("33") || Integer.toString(cp+1).equals("36") || Integer.toString(cp+1).equals("36")) {
            if(!num.equals("¦¦")) {
               System.out.println("��ǻ�Ϳ��� �����ϴ�.");
               break;
            }
         }
         else {
            if((cp+1)!=Integer.parseInt(num)) {
               System.out.println("��ǻ�Ϳ��� �����ϴ�.");
               break;
            }
         }
         /*
         if(cp==50 || Integer.parseInt(num)==50) {
            System.out.println("������� �¸��Դϴ�.");
            break;
         }
         */
         cp += 2;
      }
   }
   
   public static void rcp() {
      String str[] = {"����", "����", "��"};
         String UserSelect, ComSelect;
         int n; //��ǻ�Ͱ� ���� ��
         System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
         do {
            System.out.print("���� ���� ��! >> ");
            UserSelect = scan.next();
            if(UserSelect.equals("�׸�")) break;
            n = (int)(Math.random()*3);
            ComSelect=str[n];
            if(UserSelect.equals("����")) {
               if(str[n].equals("����")) {
                  System.out.println("����� = "+UserSelect+" , ��ǻ�� = "+ComSelect+" �����ϴ�.");
                  continue;
               }
               else if(str[n].equals("����")) {
                  System.out.println("����� = "+UserSelect+" , ��ǻ�� = "+ComSelect+" ����ڰ� �����ϴ�.");
                  continue;
               }
               else if(str[n].equals("��")) {
                  System.out.println("����� = "+UserSelect+" , ��ǻ�� = "+ComSelect+" ����ڰ� �̰���ϴ�.");
                  continue;
               }
            }
            else if(UserSelect.equals("����")) {
               if(str[n].equals("����")) {
                  System.out.println("����� = "+UserSelect+" , ��ǻ�� = "+ComSelect+" ����ڰ� �̰���ϴ�.");
                  continue;
               }
               else if(str[n].equals("����")) {
                  System.out.println("����� = "+UserSelect+" , ��ǻ�� = "+ComSelect+" �����ϴ�.");
                  continue;
               }
               else if(str[n].equals("��")) {
                  System.out.println("����� = "+UserSelect+" , ��ǻ�� = "+ComSelect+" ����ڰ� �����ϴ�.");
                  continue;
               }
            }
            else if(UserSelect.equals("��")) {
               if(str[n].equals("����")) {
                  System.out.println("����� = "+UserSelect+" , ��ǻ�� = "+ComSelect+" ����ڰ� �����ϴ�.");
                  continue;
               }
               else if(str[n].equals("����")) {
                  System.out.println("����� = "+UserSelect+" , ��ǻ�� = "+ComSelect+" ����ڰ� �̰���ϴ�.");
                  continue;
               }
               else if(str[n].equals("��")) {
                  System.out.println("����� = "+UserSelect+" , ��ǻ�� = "+ComSelect+" �����ϴ�.");
                  continue;
               }
            }
            System.out.print("����� = "+UserSelect+" , ��ǻ�� = "+ComSelect+" ");
         }while(true);
         System.out.println("������ �����մϴ�...");
         scan.close();
   }

}