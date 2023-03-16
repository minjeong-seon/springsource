package network;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

/* URL(Uniform Resource Location)
 * 
 * 		ex)https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EC%98%81%ED%99%94
 * 		ex)https://drive.google.com/drive/folders/1-s___a8XZdflN5JPSqJX6hJ4R95opezO
 * 
 * 프로토콜: https (자원에 접근하기 위해 서버와 통신하는데 필요한 통신규약)
 * 호스트명: www.naver.com, serach.naver.com (서버 이름)
 * 경로명: 접근하려는 자원이 저장된 서버상의 위치 (ex: /drive/folders/1-s___a8XZdflN5JPSqJX6hJ4R95opezO)
 * 파일명: Scanner.html
 * 쿼리: URL에서 ? 이후 부분 (없을 수도 있음)
 * 
 */

public class UrlEx1 {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%98%81%EC%96%B4");
				System.out.println("url.getAuthority() : "+url.getAuthority());
				System.out.println("url. : "+url.getAuthority());
				System.out.println("url. : "+url.getFile());
				System.out.println("url.getPort() : "+url.getPort());
				System.out.println("url.getPath() : "+url.getPath());
				System.out.println("url.getQuery() : "+url.getQuery());
				System.out.println("url.getUserInfo() : "+url.getUserInfo());
			} catch (MalformedURLException e) {
				
				e.printStackTrace();
			}
	}
}