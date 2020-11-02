
// InputBuffer.java ���� �ּ��߰�

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
		 	File file = new File("C:\\Users\\user1\\Desktop\\quiz.txt");	// ��ü����
		 	FileOutputStream fileStream_o = new FileOutputStream("C:\\Users\\user1\\Desktop\\quiz.jpg");	//gif�� ������ ���� ����
		 	
//		 	= FileReader file_reader = new FileReader(file);					// ���� �о����
//		 	= BufferedReader readQuiz = new BufferedReader(file_reader);	// ���۸� �̿��ؼ� �о���� �Լ� // ���۸� �̿��ϱ� ������ ��������� ������
		 	BufferedReader readQuiz = new BufferedReader(new FileReader(file));	
		 	// BufferedReader�� �� ���� ��°�� �޴� ���
		 	// ���۸� �̿��ؼ� �о���� �Լ� - ���۸� �̿��ϱ� ������ ��������� ������
		 	// �� �Ʒ� �� ��ģ ���� = �ᱹ ���� ����

//		 	StringTokenizer st = new StringTokenizer(readQuiz, " ", true);
	        StringTokenizer st = new StringTokenizer(readQuiz.readLine());	
	        // StringTokenizer�� token������ �����ش�(��� �ٿ��ش�
	        // ���⼭ readLine�� �������ν� �����͸� ���� ���� ���� ������ �о��ش�.
	        
	        ArrayList<Byte> list = new ArrayList<>();	// ����Ʈ ������ ��Ƴ��� ����Ʈ ��ü ����
	        while(st.hasMoreTokens()) {
	        	list.add((byte)(Integer.parseInt(st.nextToken(), 16))); 
	        	// 16������ �ٲ㼭 ������ �϶�� �Ҹ��� 
	        	// list�� ����Ʈ �����̴ϱ� (byte)�� ����ȯ
	        	// ���ڿ��� �Է¹޾ұ� ������ ���ڷ� �ν��ϱ� ���� Integer.parseInt�� �ʿ�
	        }
	        
	        for(byte b : list){
//	        	byte[] by=readQuiz.getBytes();
	        	fileStream_o.write(b);
	        }
	        readQuiz.close();
	        fileStream_o.close(); //��Ʈ�� �ݱ�
	        
//	        byte[ ] readBuffer = new byte[fileStream_o.available()];
	        
//	        while (fileStream.read( readBuffer ) != -1){}
//	        System.out.println(new String(readBuffer)); //���
//
//	        
	    } catch (Exception e) {
		e.getStackTrace();
	    }
    }
}




//	String filePath = "C:\\Users\\user1\\Desktop\\quiz.txt";


