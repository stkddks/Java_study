package mission;

public class Array {
	public static void main(String[] args) {
	
		//String[] arr = new String[5];
		String arr[] = {"����", "������", "Ű��", "���", "�ٳ���"};
		
		//�ٳ����� ����ϴ� ������ ���
		System.out.println(arr[4]);		//for�� ���X
		
		for (int i=4; i<5; i++) {		//for�� ���O
			System.out.printf(arr[i]);
			}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i].contentEquals("�ٳ���"))
				System.out.println(arr[i]);
		}
	}
}
