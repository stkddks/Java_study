package mission;

import java.util.Collections;
import java.util.List;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Lotto2 {
	public static void main(String[] args) {
		Set <Integer> set = new HashSet<Integer>();		//HashSet ��ü����
		while(set.size() < 6) {		
			int num = (int)(Math.random()*45+1);		//1~45 �����߻�
			
			set.add(num);
//			set.add(new Integer(num));	// num ���� ����� Integer��ü�� �ּҰ� ���ٴ� ������
			// ���Ʒ� ����. ������ Integer��ü�� �������ִ� ���� ������
			// jdk5.0���� �����Ϸ��� �ڵ������� ó���ϰ� �ٲ����. (�ڵ� ����ȯ�� �ϰ� ���ִ� ������)
		}
		System.out.println("���ĵǱ� ��: " +set);		// 6�� ���� ����
		// Collections.sort(set);		// collection.sort�� ����Ʈ Ÿ���̿��� set Ÿ���� ����ƮŸ������ ���������Ѵ�.
		// ��ȯ���
		// set - ArrayList(Collection) - List || set - LinkedList(Collection) - List
		
//		List<Integer> list = new ArrayList<Integer>(set);
		List<Integer> list = new LinkedList<Integer>(set);	
		// LinkedList �����ڸ� ���� HashSet�� ����� ��ü���� LinkedList �� ��� List Ÿ������ ��ȯ

		Collections.sort(list);		
	 	// ��ȣ�� ũ������� ���� - CollectionŬ������ sort()�޼ҵ� �̿�
		// Ŭ���� Collectors�� �پ��� Ŭ���� �޼ҵ带 ������ �ִ�
		// �޼ҵ� sort�� �� ���� �ϳ��� List�� ������ �����Ѵ�
		// �ٸ� sort(List list)�� ���ڷ� List�������̽� Ÿ�Ը� ����ϹǷ� Set�� List�� ��ȯ�� list
		
		System.out.println("\nLotto: " +list);
		// ���ı����� �÷��ǿ� ����� ��ü�� Integer�̹Ƿ� IntegerŬ������ ���ǵ� �⺻������ ���
	}

}

//Set�� �ߺ��� ������� �ʰ� ������ ������, 
//List�� �ߺ��� ����ϰ� ����Ǵ� ������ �����ȴٴ� ���� �� �� �ִ�. 
//�̷��� Ư¡�� ����ؼ� �÷����� �����ؾ� �Ѵ�. 

// Iterator - ����� ��ü�� �ѹ��� �������� �ݺ��� ����