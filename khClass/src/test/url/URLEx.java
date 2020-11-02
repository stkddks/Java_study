package test.url;
import java.net.MalformedURLException;
import java.net.URL;
public class URLEx {
	public void testURLExample(String urlStr) {
		System.out.println(urlStr);
		URL url;
		try {
			url = new URL(urlStr);
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("포트번호 : " + url.getPort());
			System.out.println("호스트 : " + url.getHost());
			System.out.println("파일경로 : " + url.getFile());
			System.out.println("URL 전체 : " + url.toExternalForm());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}