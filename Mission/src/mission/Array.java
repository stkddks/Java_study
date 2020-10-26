package mission;

public class Array {
	public static void main(String[] args) {
	
		//String[] arr = new String[5];
		String arr[] = {"딸기", "복숭아", "키위", "사과", "바나나"};
		
		//바나나만 출력하는 세가지 방법
		System.out.println(arr[4]);		//for문 사용X
		
		for (int i=4; i<5; i++) {		//for문 사용O
			System.out.printf(arr[i]);
			}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i].contentEquals("바나나"))
				System.out.println(arr[i]);
		}
	}
}
