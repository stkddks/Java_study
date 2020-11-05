package thread6.synch;

public class SharedData {

	private int number = 12;
	private volatile boolean isChanged; //휘발성	//저장되지 않고 쓰면 날라가는 애
	//최적화(비휘발성) : 메모리에 기록된 값을 계속 가져다 사용하는 것
	
	public SharedData() {}
	
	
	//number
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
	//isChanged
	public boolean isChanged() {
		return isChanged;
	}
	public void setChanged(boolean isChanged) {
		this.isChanged = isChanged;
	}
	
	
	
	//동기화 처리된 메소드
	public synchronized void calcNumber() {
		number *= 3;
		System.out.println("changed....");
	}
	
	public synchronized void printNumber() {
		System.out.println("number : " + number);
	}
}
