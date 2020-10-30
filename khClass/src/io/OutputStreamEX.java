
// txt 파일로 데이터 저장하기

package io;

import java.io.FileOutputStream;
//import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEX {
    public static void main(String[] args) {
	try {
	    OutputStream output = new FileOutputStream("D:/Eclipse/Java/food.txt");
	    String str ="오늘 밥은 맛있었습니다.";
	    byte[] by=str.getBytes();
	    output.write(by);
			
	} catch (Exception e) {
            e.getStackTrace();
	}
    }
}