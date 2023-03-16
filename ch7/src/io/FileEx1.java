package io;

import java.io.File;
import java.io.IOException;

public class FileEx1 {
	public static void main(String[] args) throws IOException {
		//자바에서 파일 다루기
		
		// \ : escape문자 (ex - \n, \t, \b,...) -->escape문자 외의 의도로 쓰려면 두번 겹쳐 쓴다.
		//File(String pathname)
		File file1 = new File("c:\\temp\\test1.txt");
		
		//File(String parent, String child)
		File file2 = new File("c:\\temp","test1.txt");
	
		//File(File parent, String child)
		File dir = new File("c:\\temp");
		File file3 = new File(dir, "test1.txt");

		//File(URI uri)
		
		//주요메소드
		//getName(): 파일명 가져오기
		String fileName = file1.getName();
		int pos = fileName.lastIndexOf(".");
		//'.'위치 찾기 + subString  메소드 사용하여 파일명(확장자x)만 추출하기
		String  fileNameO = fileName.substring(0,pos);
		System.out.println("파일명 "+fileName);
		System.out.println("확장자를 제외한 파일명 "+fileNameO);
		System.out.println("확장자만 확인 "+fileName.substring(pos+1));
		
		//getPath():
		System.out.println("파일명을 포함한 전체 경로 "+file1.getPath());
		
		//getAbsolutePath() : 파일의 절대경로,  getCanonicalPath() : 파일의 정규 경로
		System.out.println(file1.getAbsolutePath());
		System.out.println(file1.getCanonicalPath());
		
		//getParent()
		System.out.println("파일이 속해 있는 디렉토리 "+file1.getParent());
		
		//File.pathSeparato : 운영체제에서 사용하는 경로 구분자(윈도우: ; , 유닉스: :)
		System.out.println("File.pathSeparator"+File.pathSeparator);
		System.out.println("File.pathSeparatorChar"+File.pathSeparatorChar);
		//File.separator : 운영체제에서 사용하는 이름 구분자(윈도우: \ , 유닉스: /)
		System.out.println("File.separator"+File.separator);
		System.out.println("File.separatorChar"+File.separatorChar);
		
		
		
		
		
	}
}
