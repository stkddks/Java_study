package thread6.synch;

public class SharedData {

	private int number = 12;
	private volatile boolean isChanged; //�ֹ߼�	//������� �ʰ� ���� ���󰡴� ��
	//����ȭ(���ֹ߼�) : �޸𸮿� ��ϵ� ���� ��� ������ ����ϴ� ��
	
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
	
	
	
	//����ȭ ó���� �޼ҵ�
	public synchronized void calcNumber() {
		number *= 3;
		System.out.println("changed....");
	}
	
	public synchronized void printNumber() {
		System.out.println("number : " + number);
	}
}
