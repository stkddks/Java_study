package testProject;
/*
class Sample{
	public int a;
	private int b;
	int c;		// ���������� default �����Ǿ��ִ�.
}
*/
/*
class Sample{		// ���1
	public int a;
	public int b;
	//private int b;
	int c;		// ���������� default �����Ǿ��ִ�.
}
*/
class Sample{		//���2
	public int a;
	private int b;
	int c;		// ���������� default �����Ǿ��ִ�.
	
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
}




public class AccessEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample aClass = new Sample();
		aClass.a = 10;
		aClass.setB(10);
		aClass.c = 10;
		System.out.println("����!");
	}

}
