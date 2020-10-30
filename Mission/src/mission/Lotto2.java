package mission;

import java.util.Collections;
import java.util.List;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Lotto2 {
	public static void main(String[] args) {
		Set <Integer> set = new HashSet<Integer>();		//HashSet 객체생성
		while(set.size() < 6) {		
			int num = (int)(Math.random()*45+1);		//1~45 난수발생
			
			set.add(num);
//			set.add(new Integer(num));	// num 값이 저장된 Integer객체의 주소가 들어간다는 것이지
			// 위아래 같다. 원래는 Integer객체로 생성해주는 것이 맞지만
			// jdk5.0부터 컴파일러가 자동적으로 처리하게 바뀌었다. (자동 형변환을 하게 해주는 것이지)
		}
		System.out.println("정렬되기 전: " +set);		// 6개 숫자 배정
		// Collections.sort(set);		// collection.sort는 리스트 타입이여서 set 타입을 리스트타입으로 만들어줘야한다.
		// 변환방법
		// set - ArrayList(Collection) - List || set - LinkedList(Collection) - List
		
//		List<Integer> list = new ArrayList<Integer>(set);
		List<Integer> list = new LinkedList<Integer>(set);	
		// LinkedList 생성자를 통해 HashSet에 저장된 객체들을 LinkedList 에 담아 List 타입으로 변환

		Collections.sort(list);		
	 	// 번호를 크기순으로 정렬 - Collection클래스의 sort()메소드 이용
		// 클래스 Collectors는 다양한 클래스 메소드를 가지고 있다
		// 메소드 sort는 그 중의 하나로 List의 정렬을 수행한다
		// 다만 sort(List list)는 인자로 List인터페이스 타입만 허용하므로 Set을 List로 변환한 list
		
		System.out.println("\nLotto: " +list);
		// 정렬기준은 컬렉션에 저장된 객체가 Integer이므로 Integer클래스에 정의된 기본정렬이 사용
	}

}

//Set는 중복을 허용하지 않고 순서가 없지만, 
//List는 중복을 허용하고 저장되는 순서가 유지된다는 것을 알 수 있다. 
//이러한 특징을 고려해서 컬렉션을 선택해야 한다. 

// Iterator - 저장된 객체를 한번씩 가져오는 반복자 리턴