package testProject;
import java.util.Scanner;
public class For {
	public static void main(String[] args) {
		
		// 1~10 ������ ��
		int x=0;
		for (int i=1; i<=10; i++) {
			x+=i;
			
		}
		System.out.println("1~10������ ����?" +x);
		//End
		
		
		
		//1~10 ������ Ȧ���� ��
		int y=0;
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				y+=i;
			}
		}
		System.out.println("1~10 ������ Ȧ���� ����?" +y);
		//End
		
		
		System.out.println("");
		System.out.println("");
		
		
		//������(9��)
		//int z=9;	//�������� �Է¹޴� ������
		Scanner sc = new Scanner(System.in);
		System.out.printf("�� ���� �Ͻðڽ��ϱ�? : ");
		int z = sc.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.println(z+ "*" +i+ "=" + (z*i));
		} //End
		
		System.out.println("");
		System.out.println("");
		
		// ����(����)
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
//		System.out.println(count);
//		System.out.println(count1); 
		//End
		
		
		System.out.println("");
		System.out.println(""); 
		

		// ������(����)
						
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {			
				System.out.print(j+ "*" +i+ "=" +(j*i)+"\t");		
			}
			System.out.println();		
			count1=count1+1;
		} //End
					
								
		System.out.println("");
		System.out.println("");
		
		
		//�����_�ﰢ��
		for(int i=1;i<5;i++){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println("");
		} //End
		
		System.out.println("");
		System.out.println("");
		
		//�����_���̾Ƹ��
		for(int i=0;i<4;i++){
			for(int j=0;j<3-i;j++){
				System.out.print(" "); 
			}
			for(int j=0;j<2*i+1;j++){
				System.out.print("*"); 
			}
			System.out.println("");
		} 
		for(int i=0;i<4;i++){
			for(int j=3;j>3-i;j--){
				System.out.print(" "); 
			}
			for(int j=8;j>2*i+1;j--){
				System.out.print("*"); 
			}
			System.out.println("");
		} //End
		
		sc.close();
	}
}

