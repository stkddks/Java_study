package mission;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Lotto3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("����� Ƚ�� �Է�: ");
		int a = sc.nextInt();
		
		for (int i=0; i<a; i++) {
			HashSet <Integer> set = new HashSet<Integer>();		//HashSet ��ü����
			while(set.size() < 6) {		
				int num = ran.nextInt(45);		//1~45 �����߻�
				set.add(num);
				
			}
			
			ArrayList<Integer> list = new ArrayList<Integer>(set);	
			Collections.sort(list);		
			System.out.println(list);
		}
	}
}
