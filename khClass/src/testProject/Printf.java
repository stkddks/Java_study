package testProject;

public class Printf {
	 
    public static void main(String[] args) {
        //자리수 지정은 안 했을 경우 왼쪽으로 정렬된다.
        System.out.printf("자리수 미지정 :%d%n",1);
        System.out.printf("자리수 미지정 :%d%n",10);
        System.out.printf("자리수 미지정 :%d%n",100);
        System.out.printf("자리수 미지정 :%d%n",1000);
        
        //자리수 지정했을 경우  오른쪽으로 정렬된다.(남는 자리수는 공백)
        System.out.printf("자리수 지정 :%4d%n",1);
        System.out.printf("자리수 지정 :%4d%n",10);
        System.out.printf("자리수 지정 :%4d%n",100);
        System.out.printf("자리수 지정 :%4d%n",1000);
        
        //자리수 지정 후 '-'사용하면 왼쪽으로 정렬된다.
        System.out.printf("자리수 지정('-'사용) :%-4d%n",1);
        System.out.printf("자리수 지정('-'사용) :%-4d%n",10);
        System.out.printf("자리수 지정('-'사용) :%-4d%n",100);
        System.out.printf("자리수 지정('-'사용) :%-4d%n",1000);
        
        //자리수 지정 후 '0'사용하면 오른쪽으로 정렬된다. (왼쪽 자리수는 0으로 채운다)
        System.out.printf("자리수 지정('0'사용) :%04d%n",1);
        System.out.printf("자리수 지정('0'사용) :%04d%n",10);
        System.out.printf("자리수 지정('0'사용) :%04d%n",100);
        System.out.printf("자리수 지정('0'사용) :%04d%n",1000);
        
        //float 예시
        float f = 1.2345f;
        
        //소수점 자리수 미지정시
        System.out.printf("소수점 자리수 미지정 : %f%n",f);
        //소수점 자리 지정시
        System.out.printf("소수점 자리수 지정 : %.3f%n",f);    
        
        
    }//main
 
}//class

/*기본 출력문 println()은 변수의 값을 그대로 출력하므로, 값을 변환하지 않고는 다른 형식으로 출력할 수 없다.
반면에 printf()는 지시자를 통해 변수의 값을 여러 가지 형식으로 변환하여 출력할 수 있다.*/


// 출려서식 %[-][0][n][.m]지시자


/* 출력 서식의 지시자를 제외한 나머지는 생략 가능하다. 예) %d 식으로 사용 가능.
n : 출력할 전체 자리수 지정(오른쪽 정렬).  예) %3d, 전체자리수가 3인 정수
0 : 전체 자리수가 지정된 경우 왼쪽의 남는 자리에 0을 출력.  예) %03d
- : 전체 자리수가 지정된 경우 왼쪽 정렬하고 빈칸에 공백 출력.
.m : 소수점 아래 자리수 지정. 잘리는 소수점 자리수는 반올림 시켜서 표시.  예)3.2f */




