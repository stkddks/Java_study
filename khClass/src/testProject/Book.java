package testProject;

public class Book {			//Ŭ����
	String title;
	String author;
	
	public Book(String t) {		// ������1(�����ڴ� Ŭ�����̸��� ������ �޼ұ����� �̿��� �Ѵ�)
		title = t;
		author = "���ڹ̻�";
	}
	public Book(String t, String a) {		//������2
		title = t; 
		author = a;
	}
	
	public static void main(String[] args) {
		//�Ʒ��� Book �ڷ���(Ŭ������)�� ��ü����
		//������ �̸��� Ŭ�����̸��� �����ϱ� �׳� Ŭ�����̸� ���شٰ� �����ϸ� �ȴ�.
		Book littlePrince = new Book("�����", "�����㺣��");		// �Ķ���Ͱ� 2���ϱ� ������2 �� ����
		Book loveStory = new Book("������");					// �Ķ���Ͱ� 1���ϱ� ������1 �� ����
		System.out.println(littlePrince.title+ " " + littlePrince.author);
		System.out.println(loveStory.title + " "+ loveStory.author);
	}
}




