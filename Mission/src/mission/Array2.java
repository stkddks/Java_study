

// ���� ���̰� 15. ���� ���̰� 11�� 2���� �迭�� �����ϼ���
// 1���� 165���� �ε��� ������� ���� �ʱ�ȭ�ϼ� �� ���� ����ϴ� �ڵ带 �ۼ��ϼ���

package mission;

public class Array2 {
	public static void main(String[] args) {
		int[][] score1;
		score1 = new int[15][11];
		int z=1;
		for (int i=0; i<score1.length; i++) {
			for(int j=0; j<score1[i].length; j++) {		
				score1[i][j] = z;
				System.out.print(i+ "��" +j+ "��:" +score1[i][j]+ "\t\t");
				z++;
			}
			System.out.println();
		}
		System.out.println();
	}
	
}


