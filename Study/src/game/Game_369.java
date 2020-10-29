package game;
import java.util.Scanner;

public class Game_369 {
   static Scanner scan = new Scanner(System.in);
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      System.out.println("게임을 선택해주세요. 1. 369게임 2. 가위바위보 게임");
      int gamesel = scan.nextInt();
      switch(gamesel){
      case 1:
         System.out.println("369 게임을 시작합니다.");
         System.out.println("사용자나 컴퓨터가 50을 말할때까지 버티면 사용자의 승리입니다.");
         System.out.println("순서를 정해주세요. 1.컴퓨터 선 2.사용자 선");
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
         System.out.println("가위바위보 게임을 시작합니다.");
         rcp();
         break;
      }
   }
   
   public static void meFirst() {
      System.out.println("순서는 사용자 부터 시작합니다.");
      int cp = 2;
      while(true) {
         System.out.print("사용자 : ");
         String num = scan.next();
         if(Integer.toString(cp-1).contains("3") || Integer.toString(cp-1).contains("6") || Integer.toString(cp-1).contains("9")) {
            if(!num.equals("짝")) {
               System.out.println("컴퓨터에게 졌습니다.");
               break;
            }
         }
         else if(Integer.toString(cp-1).equals("33") || Integer.toString(cp-1).equals("36") || Integer.toString(cp-1).equals("36")) {
            if(!num.equals("짝짝")) {
               System.out.println("컴퓨터에게 졌습니다.");
               break;
            }
         }
         else {
            if((cp-1)!=Integer.parseInt(num)) {
               System.out.println("컴퓨터에게 졌습니다.");
               break;
            }
         }
         
         if(Integer.toString(cp).contains("3") || Integer.toString(cp).contains("6") || Integer.toString(cp).contains("9")) {
            System.out.println("컴퓨터 : 짝");
         }
         else if(Integer.toString(cp).equals("33") || Integer.toString(cp).equals("36") || Integer.toString(cp).equals("39")) {
            System.out.println("컴퓨터 : 짝짝");
         }
         else {
            System.out.println("컴퓨터 : " + cp);
         }
         
         /*
         if(cp==50 || Integer.parseInt(num)==50) {
            System.out.println("사용자의 승리입니다.");
            break;
         }
         */
         cp += 2;
         
      }
   }
   
   public static void computerFirst() {
      System.out.println("순서는 컴퓨터 부터 시작합니다.");
      int cp = 28;
      while(true) {         
         if(Integer.toString(cp).contains("3") || Integer.toString(cp).contains("6") || Integer.toString(cp).contains("9")) {
            System.out.println("컴퓨터 : 짝");
         }
         else if(Integer.toString(cp).equals("33") || Integer.toString(cp).equals("36") || Integer.toString(cp).equals("39")) {
            System.out.println("컴퓨터 : 짝짝");
         }
         else {
            System.out.println("컴퓨터 : " + cp);
         }
         
         System.out.print("사용자 : ");
         String num = scan.next();
         if(Integer.toString(cp+1).contains("3") || Integer.toString(cp+1).contains("6") || Integer.toString(cp+1).contains("9")) {
            if(!num.equals("짝")) {
               System.out.println("컴퓨터에게 졌습니다.");
               break;
            }
         }
         else if(Integer.toString(cp+1).equals("33") || Integer.toString(cp+1).equals("36") || Integer.toString(cp+1).equals("36")) {
            if(!num.equals("짝짝")) {
               System.out.println("컴퓨터에게 졌습니다.");
               break;
            }
         }
         else {
            if((cp+1)!=Integer.parseInt(num)) {
               System.out.println("컴퓨터에게 졌습니다.");
               break;
            }
         }
         /*
         if(cp==50 || Integer.parseInt(num)==50) {
            System.out.println("사용자의 승리입니다.");
            break;
         }
         */
         cp += 2;
      }
   }
   
   public static void rcp() {
      String str[] = {"가위", "바위", "보"};
         String UserSelect, ComSelect;
         int n; //컴퓨터가 내는 것
         System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
         do {
            System.out.print("가위 바위 보! >> ");
            UserSelect = scan.next();
            if(UserSelect.equals("그만")) break;
            n = (int)(Math.random()*3);
            ComSelect=str[n];
            if(UserSelect.equals("가위")) {
               if(str[n].equals("가위")) {
                  System.out.println("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" 비겼습니다.");
                  continue;
               }
               else if(str[n].equals("바위")) {
                  System.out.println("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" 사용자가 졌습니다.");
                  continue;
               }
               else if(str[n].equals("보")) {
                  System.out.println("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" 사용자가 이겼습니다.");
                  continue;
               }
            }
            else if(UserSelect.equals("바위")) {
               if(str[n].equals("가위")) {
                  System.out.println("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" 사용자가 이겼습니다.");
                  continue;
               }
               else if(str[n].equals("바위")) {
                  System.out.println("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" 비겼습니다.");
                  continue;
               }
               else if(str[n].equals("보")) {
                  System.out.println("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" 사용자가 졌습니다.");
                  continue;
               }
            }
            else if(UserSelect.equals("보")) {
               if(str[n].equals("가위")) {
                  System.out.println("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" 사용자가 졌습니다.");
                  continue;
               }
               else if(str[n].equals("바위")) {
                  System.out.println("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" 사용자가 이겼습니다.");
                  continue;
               }
               else if(str[n].equals("보")) {
                  System.out.println("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" 비겼습니다.");
                  continue;
               }
            }
            System.out.print("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" ");
         }while(true);
         System.out.println("게임을 종료합니다...");
         scan.close();
   }

}