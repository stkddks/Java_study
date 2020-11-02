 
// Q. 웹에 있는 특정한 이미지 파일을 한정된 버퍼를 사용하여 다운로드하는 프로그램을 작성하여 보자.
// 버퍼의 크기는 2048 바이트로 한다.

package image;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class DownloadImage {
	public static void main(String[] args) throws Exception {
		String website = "http://www.oracle.com/us/hp07-bg121314-openworld-2x-2280475.jpg";
		System.out.println("" + website + "사이트에서 이미지를 다운로드합니다.");
		URL url = new URL(website);
		byte[] buffer = new byte[2048];
		try ( InputStream in = url.openStream();		// 해당 url 애서 불러온다 
				OutputStream out = new FileOutputStream("C:\\Users\\user1\\Desktop\\test2.jpeg");	// 파일을 test.jpg 라는 파일로 저장한다.(내보낸다)
				) 
		{
			int length = 0;
			while ((length = in.read(buffer)) != -1) 
			{
				System.out.println("" + length + "바이트 만큼 읽었음!");
				out.write(buffer, 0, length);
			}
			
			in.close();
			out.close();
		} 
		catch (Exception e) 
		{
			System.out.println("예외: " + e.getMessage());
		}
	}
}