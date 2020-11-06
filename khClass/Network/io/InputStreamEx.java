
// txt 파일 불러오기

package io;
                                                                   
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputStreamEx {
	 public static void main(String[] args) {
	 try{
	        //파일 객체 생성
	        File file = new File("D:/Eclipse/Java/food.txt");
	         //입력 스트림 생성
	         FileReader file_reader = new FileReader(file);
	         int cur = 0;
	         while((cur = file_reader.read()) != -1){
	            System.out.print((char)cur);
	         }
	         file_reader.close();
	        }catch (FileNotFoundException e) {
	            e.getStackTrace();
	        }catch(IOException e){
	            e.getStackTrace();
	        }
	 
}
}
