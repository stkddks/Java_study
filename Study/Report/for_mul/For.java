
// Q
// for���� ����Ͽ� ������(2~9�ܱ���) ���η� ����ϱ�

package for_mul;
public class For {
	public static void main(String[] args) {		
		int count=0;
		int count1=0;
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(i+ "*" +j+ "=" +(i*j)+ "\t");
				count+=1;
			}
			System.out.println();
			count1+=1;
		}
		System.out.println();
	}
}