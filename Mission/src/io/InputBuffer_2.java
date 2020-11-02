
// InputBuffer.java 에서 주석추가

package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class InputBuffer_2 {
    public static void main(String[] args) throws IOException {
	 try {
		 	File file = new File("C:\\Users\\user1\\Desktop\\quiz.txt");	// 객체선언
		 	FileOutputStream fileStream_o = new FileOutputStream("C:\\Users\\user1\\Desktop\\quiz.jpg");	//gif로 저장할 공간 생성
		 	
//		 	= FileReader file_reader = new FileReader(file);					// 파일 읽어오고
//		 	= BufferedReader readQuiz = new BufferedReader(file_reader);	// 버퍼를 이용해서 읽어오는 함수 // 버퍼를 이용하기 때문에 상대적으로 빠르다
		 	BufferedReader readQuiz = new BufferedReader(new FileReader(file));	
		 	// BufferedReader는 한 줄을 통째로 받는 방식
		 	// 버퍼를 이용해서 읽어오는 함수 - 버퍼를 이용하기 때문에 상대적으로 빠르다
		 	// 위 아래 줄 합친 내용 = 결국 같은 내용

//		 	StringTokenizer st = new StringTokenizer(readQuiz, " ", true);
	        StringTokenizer st = new StringTokenizer(readQuiz.readLine());	
	        // StringTokenizer는 token단위로 끊어준다(끊어서 붙여준다
	        // 여기서 readLine을 써줌으로써 데이터를 한줄 한줄 라인 단위로 읽어준다.
	        
	        ArrayList<Byte> list = new ArrayList<>();	// 바이트 형으로 담아놓을 리스트 객체 생성
	        while(st.hasMoreTokens()) {
	        	list.add((byte)(Integer.parseInt(st.nextToken(), 16))); 
	        	// 16진수로 바꿔서 저장을 하라는 소리지 
	        	// list가 바이트 단위이니까 (byte)로 형변환
	        	// 문자열을 입력받았기 때문에 숫자로 인식하기 위해 Integer.parseInt가 필요
	        }
	        
	        for(byte b : list){
//	        	byte[] by=readQuiz.getBytes();
	        	fileStream_o.write(b);
	        }
	        readQuiz.close();
	        fileStream_o.close(); //스트림 닫기
	        
//	        byte[ ] readBuffer = new byte[fileStream_o.available()];
	        
//	        while (fileStream.read( readBuffer ) != -1){}
//	        System.out.println(new String(readBuffer)); //출력
//
//	        
	    } catch (Exception e) {
		e.getStackTrace();
	    }
    }
}




//	String filePath = "C:\\Users\\user1\\Desktop\\quiz.txt";


