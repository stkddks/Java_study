package mission;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class ImageLoader {
 public static void main(String[] args) throws FileNotFoundException, IOException {
//  File path = new File("C:\\temp\\img");
	 File path = new File("C:\\");
  if(!path.exists()) path.mkdir();
  
  File text  = new File(path,"quiz.txt");
//  File img2  = new File(path,"02Se.jpg");

  FileInputStream fis = new FileInputStream(text);
  BufferedInputStream bis = new BufferedInputStream(fis);
  
//  FileOutputStream fos = new FileOutputStream(img2);
//  BufferedOutputStream bos = new BufferedOutputStream(fos);
  
  byte[] buf = new byte[1024];

  int readlength = 0;
  while( (readlength = bis.read(buf)) != -1 ) {
//   bos.write(buf,0,readlength);
  }
  
  
 }
}

