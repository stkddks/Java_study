

// Ŭ������ ��ü ���� �����ϱ�

package testProject;

public class Circle {

	int radius;		//���� ������ ����(�ʵ�)
	String name;		//���� �̸� ����(�ʵ�)
	
	public Circle(int radius) {		//���� ������
		this.radius = radius;
	}		
	
	public double getArea() {		//���� ���� ��� �޼ҵ�	//getArea�� ȣ��Ǹ� ����Ǵ°�
		return 3.14*radius*radius;
	}
	
//	public static void main(String[] args) {
//		Circle pizza;					//���۷��� ���� pizza ����
//		pizza = new Circle(4);			// Circle ��ü����
//		pizza.radius=10;				// ������ �������� 10���� ����
//		pizza.name="�ڹ�����";				// ������ �̸� ����
//		double area = pizza.getArea();		// ������ ���� �˾Ƴ���
//		System.out.println(pizza.name + "�� ������" + area);
//	
//		Circle donut = new Circle(4);		// Circle ��ü����
//		donut.radius = 2;					// ������ �������� 2�� ����
//		donut.name = "�ڹٵ���";				// ������ �̸� ����
//		area = donut.getArea();				// ������ ���� �˾Ƴ���
//		System.out.println(donut.name + "�� ������" + area);	
//	}
}






/*
 
JAVA������ ��ü�� New �����ڷ� �����ϰ� �����Ѵ�.
//ClassŸ�� ������ = new ������ ();
// ������ �̸��� Ŭ���� �̸��� ���� (�����ڴ� ����Ÿ���� X)
//Class��� �ڷ����� Ÿ�� (int��, String�� �� ���� �ڷ���!)
// �ڷ����� �̸��� �ش�Ŭ������ �̸��� ����.
// �ش� Ŭ�����ڷ����� ������ �������ִ� ��! == ��ü ������ �ȴ�.
//// ��! Ŭ������ ��ü����_������ = new Ŭ����_�����ڸ�();


ex)
String str2 = new String("abc"); // StringŸ��(�ڷ���)�� ���� str2�� ���Ӱ�(new) String ��ü�� �����Ͽ�  ����!

ex)
 public static void main(String[] args) {
  CLASS reference = new CLASS();
  // CLASS Ÿ���� reference ������, ���Ӱ� ���� CLASS ��ü�� ����!
	}
 
ex) 
 //����ü : �ٸ� Ÿ���� �������� ���� �ڷ���
//����� ���� �ڷ���
class Student{
    int age;
    int score;
    String name;
}

public class Stuent_Test {
    public static void main(String[] args) {
        Student s = new Student(); //�츮�� ���� ������ Ÿ��
        s.age = 20;
        s.score = 100;
        s.name = "����";
        System.out.println(s.age + " / "+ s.score + " / " + s.name);
    }
}

*/