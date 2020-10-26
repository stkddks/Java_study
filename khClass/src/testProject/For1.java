package testProject;

public class For1 {

	public static void main(String[] args) {
		//별찍기_다이아몬드
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

	}

}
