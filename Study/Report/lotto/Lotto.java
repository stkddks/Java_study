
// Q
// �ζǹ�ȣ �ڵ� ������ ���α׷��� �ۼ��ϼ���
// ��, �ߺ� ���� ������ �ȵǰ�, ������������ �����Ͽ� ����ϼ���
// ����> Random Ŭ���� ��� Ȥ�� Math.random() ���

package lotto;

import java.util.Collections;
import java.util.List;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Lotto {
	public static void main(String[] args) {
		Set <Integer> set = new HashSet<Integer>();		//HashSet ��ü����
		while(set.size() < 6) {		
			int num = (int)(Math.random()*45+1);		//1~45 �����߻�
			set.add(num);
		}
		System.out.println("���ĵǱ� ��: " +set);		// 6�� ���� ����
		List<Integer> list = new LinkedList<Integer>(set);	
		Collections.sort(list);		
		System.out.println("\nLotto: " +list);
	}
}

