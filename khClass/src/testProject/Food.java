package testProject;

import java.util.Random;
import java.util.Scanner;

public class Food {

	public static void main(String[] args) {
		System.out.println("즐거운 점심 시간 무엇을 먹을까요?");	
		System.out.println("먹고 싶은걸 말해봥  ");
		//String food[] = new String[5];
		String food[] = new String[] {"닭곰탕", "분식", "삼겹살", "숯불구이", "중식", "라멘", "보쌈세트", "순댓국", "햄버거", "서브웨이", "베트남음식", "왕돈가스", "부대찌게", "떡볶이"}; 
		Scanner sc = new Scanner(System.in);
		//String arr[] = new String[food.length];	
		//int cho[] = new int[1];		
		//String input;
		Random ran = new Random();
		int gg = ran.nextInt(5);
//		
//		for(int i = 0; i < food.length; i++) {
//				System.out.print((i+1) + "번째 음식 : ");
//			    String input = sc.next();	
//			    food[i] = input;		
//			    
//		}
		System.out.println("=========두구두구두구두구두구=========");
		try {
			Thread.sleep(3000); //1초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
				}
		
		System.out.println("오늘은 이거 머겅 : " + food[gg]);
		sc.close();
	
		}
	
	}

