
// Q
// 제공된 파일(quiz.txt) 의 내용을 읽어 들여
// 바이트 스트림으로 저장해 보세요(저장시 확장자명을 gif 으로 변경하세요)
// 참고> 아래 메소드 활용 
// (FileReader, BufferedReader, FileOutputStream, ArrayList<Byte>, StringTokenizer, Exception 처리)​

package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Stream_Image {
	public static void main(String[] args) throws IOException {
		try {
			File file = new File("C:\\Users\\user1\\Desktop\\quiz.txt");	
			FileReader file_reader = new FileReader(file);					
			BufferedReader readQuiz = new BufferedReader(file_reader);	
			ArrayList<Byte> list = new ArrayList<>();	
			FileOutputStream fileStream_o = new FileOutputStream("C:\\Users\\user1\\Desktop\\quiz.gif");	
			
			StringTokenizer st = new StringTokenizer(readQuiz.readLine());	
			
			while(st.hasMoreTokens()) {
				list.add((byte)(Integer.parseInt(st.nextToken(), 16)));
			}
			
			for(byte b : list){
				fileStream_o.write(b);
			}
			
			readQuiz.close();
			fileStream_o.close(); 
		}
		catch (Exception e) {
			e.getStackTrace();
		}
	}
}
