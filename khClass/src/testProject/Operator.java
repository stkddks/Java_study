package testProject;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5, j=0;
		
		j=i++;
		System.out.println("j=i++; ���� ��, i=" +i+", j=" +j);
		
		i=5;
		j=0;
		 
		j=++i;
		System.out.println("j=++i; ���� ��, i=" +i+ ", j=" +j);
		System.out.println("ȫ�浿");
		
		System.out.println(i++);
		System.out.println(++j);
		System.out.println("i= "+i+ ", j= " +j);
		
		/*----------------------��ȭ����----------------------------------------------*/
		 	int  ia = 10, ib = 10, ix, iy;
	        ia++;
	        ++ib;
	        System.out.println("ia:"+ia+", ib:"+ib);	
	        // ia=10�� �ƴ϶� 11 ����!!!!!!!! 
	        // ������ ������ �� ��� ���� ����� �����°�
	        // line42 �� ����

	        ix = --ia;
	        iy = ib--;
	        System.out.println("ia:"+ia+", ib:"+ib);
	        System.out.println("ix:"+ix+", iy:"+iy);
	        
	        /*----------------------��ȭ����----------------------------------------------*/
	        
	        int num1 = 7, num2 = 7;
	        int result1, result2;

	        result1 = --num1 + 4;
	        result2 = num2-- + 4;
	        System.out.println(num2);	// ����
	        System.out.println("���� ���� �����ڿ� ���� ��� : "+ result1 + ", ������ �� : " + num1);
	        System.out.println("���� ���� �����ڿ� ���� ��� : "+ result2 + ", ������ �� : " + num2);
	        
	        /*----------------------��ȭ����----------------------------------------------*/
	        int x = 10;
	        int y = x-- + 5 + --x;
	        System.out.println("x : "+ x + ", y : " + y);
	}
}





