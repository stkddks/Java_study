package day3;
import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�׽�Ʈ ���̽� ��: >> ");
        int C = sc.nextInt();   
       
        int N = 0;              // �л���
        double avg = 0;        // ���
        int[] arr = new int[1000];	// ���� �Է�
        for (int i=0; i < C; i++) {
        	int num = 0; 
        	System.out.println("�л� �� �Է�: >> ");
        	N = sc.nextInt();
        	
        	int total = 0;             
        	System.out.println("�����Է� >> ");
        	for(int j=0; j < N; j++) { 
        		arr[j] = sc.nextInt();
        		total += arr[j];      
        	}
        	avg = (double)total / N; 
            
            for(int j=0; j < N; j++) { 
                if(arr[j]>avg) {
                    num++;		// ������ ��
                }
            }
            System.out.printf("%.3f", 100.0 * num / N);
            System.out.println("%");
        }
//        sc.close();
    }
}


