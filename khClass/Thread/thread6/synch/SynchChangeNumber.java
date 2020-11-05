package thread6.synch;

public class SynchChangeNumber extends Thread {
	
	private SharedData sdata;

	public SynchChangeNumber(SharedData sdata) {
		this.sdata = sdata;
	}
	@Override
	public void run() {
		for(int k = 1; k <= 5; k++) {
			sdata.calcNumber();
			
			//�ش� �����尡 �����ڿ� ����� ���� ���¶��
			if(this.getState() == Thread.State.TERMINATED) {
				//�ٸ� ���������� ��ȣ�� ����
				this.notify();
			}
		}
	}
}