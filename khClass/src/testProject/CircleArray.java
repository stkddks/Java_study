package testProject;
//import Circle;
public class CircleArray {
	
	public static void main(String[] args) {
		Circle [] c;			// Circle �迭�� ���� ���۷��� c����
		c = new Circle[5];		// 5���� ���۷��� �迭 �ļ� 
		
		for(int i=0; i<c.length; i++)		//�迭�� ���� ��ŭ
			c[i] = new Circle(i);			// i ��° ���� ��ü ����
		
		for (int i=0; i<c.length; i++) {	// �迭�� ��� ���� ��ü�� ���� ���
			System.out.println((int)(c[i].getArea())+" ");
		}
	}
}
