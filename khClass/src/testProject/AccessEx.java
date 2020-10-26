package testProject;
/*
class Sample{
	public int a;
	private int b;
	int c;		// 접근제한자 default 생략되어있다.
}
*/
/*
class Sample{		// 방법1
	public int a;
	public int b;
	//private int b;
	int c;		// 접근제한자 default 생략되어있다.
}
*/
class Sample{		//방법2
	public int a;
	private int b;
	int c;		// 접근제한자 default 생략되어있다.
	
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
		System.out.println("성공!");
	}

}
