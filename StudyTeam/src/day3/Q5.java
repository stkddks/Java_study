package day3;
import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("테스트 케이스 수: >> ");
        int C = sc.nextInt();   
       
        int N = 0;              // 학생수
        double avg = 0;        // 평균
        int[] arr = new int[1000];	// 점수 입력
        for (int i=0; i < C; i++) {
        	int num = 0; 
        	System.out.println("학생 수 입력: >> ");
        	N = sc.nextInt();
        	
        	int total = 0;             
        	System.out.println("점수입력 >> ");
        	for(int j=0; j < N; j++) { 
        		arr[j] = sc.nextInt();
        		total += arr[j];      
        	}
        	avg = (double)total / N; 
            
            for(int j=0; j < N; j++) { 
                if(arr[j]>avg) {
                    num++;		// 나누는 수
                }
            }
            System.out.printf("%.3f", 100.0 * num / N);
            System.out.println("%");
        }
//        sc.close();
    }
}


