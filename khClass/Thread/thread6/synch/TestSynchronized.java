package thread6.synch;

public class TestSynchronized {
	public static void main(String[] args) {
		// �������� ����ȭ ���� �ذ� �׽�Ʈ
		SharedData shareObj = new SharedData();
		Thread changeThread = new SynchChangeNumber(shareObj);
		Thread readThread = new SynchReadNumber(shareObj);
		changeThread.start();
		readThread.start();
	}
}
