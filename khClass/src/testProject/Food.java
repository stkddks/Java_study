package testProject;

import java.util.Random;
import java.util.Scanner;

public class Food {

	public static void main(String[] args) {
		System.out.println("��ſ� ���� �ð� ������ �������?");	
		System.out.println("�԰� ������ ���ؔg  ");
		//String food[] = new String[5];
		String food[] = new String[] {"�߰���", "�н�", "����", "���ұ���", "�߽�", "���", "���Ӽ�Ʈ", "����", "�ܹ���", "�������", "��Ʈ������", "�յ�����", "�δ����", "������"}; 
		Scanner sc = new Scanner(System.in);
		//String arr[] = new String[food.length];	
		//int cho[] = new int[1];		
		//String input;
		Random ran = new Random();
		int gg = ran.nextInt(5);
//		
//		for(int i = 0; i < food.length; i++) {
//				System.out.print((i+1) + "��° ���� : ");
//			    String input = sc.next();	
//			    food[i] = input;		
//			    
//		}
		System.out.println("=========�α��α��α��α��α�=========");
		try {
			Thread.sleep(3000); //1�� ���
			} catch (InterruptedException e) {
				e.printStackTrace();
				}
		
		System.out.println("������ �̰� �Ӱ� : " + food[gg]);
		sc.close();
	
		}
	
	}

