 
// Q. ���� �ִ� Ư���� �̹��� ������ ������ ���۸� ����Ͽ� �ٿ�ε��ϴ� ���α׷��� �ۼ��Ͽ� ����.
// ������ ũ��� 2048 ����Ʈ�� �Ѵ�.

package image;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class DownloadImage {
	public static void main(String[] args) throws Exception {
		String website = "http://www.oracle.com/us/hp07-bg121314-openworld-2x-2280475.jpg";
		System.out.println("" + website + "����Ʈ���� �̹����� �ٿ�ε��մϴ�.");
		URL url = new URL(website);
		byte[] buffer = new byte[2048];
		try ( InputStream in = url.openStream();		// �ش� url �ּ� �ҷ��´� 
				OutputStream out = new FileOutputStream("C:\\Users\\user1\\Desktop\\test2.jpeg");	// ������ test.jpg ��� ���Ϸ� �����Ѵ�.(��������)
				) 
		{
			int length = 0;
			while ((length = in.read(buffer)) != -1) 
			{
				System.out.println("" + length + "����Ʈ ��ŭ �о���!");
				out.write(buffer, 0, length);
			}
			
			in.close();
			out.close();
		} 
		catch (Exception e) 
		{
			System.out.println("����: " + e.getMessage());
		}
	}
}