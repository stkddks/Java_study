package testProject;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = new int[10];
		for(int i=0; i<data.length; i++) {
			data[i] = (int)(Math.random()*100);
		}
		
		int tmp = -1;
		for(int i=0; i<data.length-1; i++){
			for (int j=i+1; j<data.length; j++) {
				if(data[i] > data[j]) {
					tmp = data[i];
					data[i] = data[j];
					data[j] = tmp;
				}
			}
			System.out.println((i+1)+"¹øÂ°: ");
			for(int d:data) {
				System.out.println(d + "");
			}
			System.out.println();
		}
		for(int d:data) {
			System.out.println(d + "");
		}
	}
}
