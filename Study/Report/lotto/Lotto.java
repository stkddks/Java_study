
// Q
// 로또번호 자동 생성기 프로그램을 작성하세요
// 단, 중복 값이 있으면 안되고, 오름차순으로 정렬하여 출력하세요
// 참고> Random 클래스 사용 혹은 Math.random() 사용

package lotto;

import java.util.Collections;
import java.util.List;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Lotto {
	public static void main(String[] args) {
		Set <Integer> set = new HashSet<Integer>();		//HashSet 객체생성
		while(set.size() < 6) {		
			int num = (int)(Math.random()*45+1);		//1~45 난수발생
			set.add(num);
		}
		System.out.println("정렬되기 전: " +set);		// 6개 숫자 배정
		List<Integer> list = new LinkedList<Integer>(set);	
		Collections.sort(list);		
		System.out.println("\nLotto: " +list);
	}
}

