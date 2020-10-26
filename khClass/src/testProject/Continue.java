package testProject;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i =1; i<=100; i++) {
			if(i%2==0) 
				continue;
			System.out.println(i+"+");
			sum += i;
		}
		System.out.println("\n 1부터 100까지의 홀수들의 합:" +sum);
		
		
		label:
			for(;;) {
				for(int i=0; i<10; i++) {
				System.out.println(i);
				if(i==5) break label;
			}
		}
		
		
		
	}
}
