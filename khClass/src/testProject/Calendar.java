
package testProject;
public class Calendar {
	 public static void main(String[] args){
	  
		 int arr[][][]=new int[12][5][7];
		 for(int k=0;k<arr.length;k++){
			 int num=1;
			 System.out.println("\t\t\t"+(k+1)+"��"); //(k+1)�� ���
			 for(int i=0;i<arr[k].length;i++){
				 for(int j=0;j<arr[k][i].length;j++){
					 arr[k][i][j]=num++; //�迭�� ������ŭ num(��)����
					 if(k+1<8){ //1������ 7������
						 if((k+1)%2==1){ //Ȧ������ 31�ϱ���
							 if(num>32) continue;
						 }
						 else if((k+1)%2==0) //������ ¦������ 30��
							 if(num>31) continue;
							 else if((k+1)==2) //2���� 28�ϱ���
								 if(num>29) continue; 
					 } //1������ 7������
					 
					 else{ //8������ 12������
						 if((k+1)%2==0){ //¦������ 31�ϱ���
							 if(num>32) continue;
						 }
						 else if(num>31) continue; //������ Ȧ������ 30��
					 }
					 System.out.print(arr[k][i][j]+"\t"); //��������
				 }
				 System.out.println();    
			 }
			 System.out.println();
			 num=1; //�� �ʱ�ȭ
		 }
	 }
}



