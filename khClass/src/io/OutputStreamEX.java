
// txt ���Ϸ� ������ �����ϱ�

package io;

import java.io.FileOutputStream;
//import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEX {
    public static void main(String[] args) {
	try {
	    OutputStream output = new FileOutputStream("D:/Eclipse/Java/food.txt");
	    String str ="���� ���� ���־����ϴ�.";
	    byte[] by=str.getBytes();
	    output.write(by);
			
	} catch (Exception e) {
            e.getStackTrace();
	}
    }
}