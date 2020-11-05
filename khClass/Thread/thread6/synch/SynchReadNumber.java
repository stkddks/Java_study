package thread6.synch;

public class SynchReadNumber extends Thread {
	private SharedData sdata;
	public SynchReadNumber(SharedData sdata) {
		this.sdata = sdata;
	}
	@Override
	public void run() {
		for(int n = 1; n <= 5; n++) {
			try {
				//�ٸ� �������� ����ȭ ����� �����⸦ ��ٸ��� �����̸�
				if(this.getState() == Thread.State.BLOCKED) {
					//�ٸ� �����尡 ��ȣ�� ���� ������ ��ٷ���.
					this.wait();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			sdata.printNumber();
		}
	}
}


