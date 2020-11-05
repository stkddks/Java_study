
// 스레드 동기화예제 2

package thread5.run;

import thread5.common.Buffer;
import thread5.synch.Consumer;
import thread5.synch.Producer;

public class ProducerConsumerTest {
	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		(new Thread(new Producer(buffer))).start();
		(new Thread(new Consumer(buffer))).start();
	}
}


/*
	동기화는 임계영역 즉, 단 하나의 스레드만 실행할 수 있는 코드 영역을을 위해 (자바에서)지원하는 아이이다
	그래서 동기화 블록을 통해 공유하고 있는 변수를 가져와 나만 쓸수있게 락(lock)을 걸어두는 것이다. 
	락은 걸어두고 있는 동안은 다른 쓰레드들이 얘를 쓰지 못한다. ( ex) 입금&출금 구현에서 잔액은 두 메소드 다 써야하는 필드잖아. 이런 잔액같은 애들 )
	(동기화메소드 보다는 동기화블록을 쓰는 것이 더 좋다고 한다.)
	
	그런데 내가 일을 하고 있지 않을 때에도 락을 계속 걸어두고 있으면 그건 싸가지가 바가지 인거지
	그래서 wait을 이용해 나는 지금 일을 하고 있지 않으니 기다릴께 
	하고 락을 반납하는 것이다.
	
	만약 내가 할 일을 다 끝나서 더이상 락을 하지 않아도 된다면
	notify()를 통해서 락 하고 있던 아이를 "얘 데려가!"하고 통지를 하게 되는데
	대기를 타고있던 쓰레드 애들 중에서 임의로 선택 된 한 쓰레드한테만 통지가 가게 된다. 걔만 그 통지를 듣게 되는 거지!!!!! 
	notifyAll()을 하면 모두에게 풀렸다고 통지가 되지만 그들 중 우선순위에 따라서 높은 스레드가 락을 할 수 있는 권한을 얻게 된다.
*/
