package thread6.synch;

public class TestSynchronized {
	public static void main(String[] args) {
		// 공유영역 동기화 오류 해결 테스트
		SharedData shareObj = new SharedData();
		Thread changeThread = new SynchChangeNumber(shareObj);
		Thread readThread = new SynchReadNumber(shareObj);
		changeThread.start();
		readThread.start();
	}
}
