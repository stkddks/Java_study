package day3;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String course[] = {"Java", "C++", "HTML5", "C#", "DB"};
    	int score[]  = {95, 88, 76, 62, 55};
    	
    	while(true) {
    		for(int i=0; i<course.length; i++) {
    			System.out.printf("�����̸� >> ");
    			String name = sc.next();
    			if (name.equals("stop")) {
    				System.out.println("�ý����� �����մϴ�");
    				System.exit(0);
    			}
    			int index = 0;
    			
    			for (int j=0; j<score.length; j++) {
    				if(course[j].equals(name)) {
    					index = j;
    					break;
    				}
    				else {
    					index = 100;
    				}
    			}
    			
    			if (index == 100) 
    				System.out.println("���� �����Դϴ�");
    			else 
    				System.out.println(name+" �� ������ " + score[index]);
    		}
//    		sc.close();
    	}
    }
}



