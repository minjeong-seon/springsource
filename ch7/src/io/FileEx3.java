package io;

import java.io.File;

public class FileEx3 {
	//삭제된 파일 개수 저장하는 변수 선언
	static int deleteFiles = 0;
	
	public static void main(String[] args) {
		if (args.length!=1) {
			System.out.println("사용법 : java FileEx2 디렉토리명");
			System.exit(0);
		}

		//현재 작업중인 디렉토리 보기
		String currDir = System.getProperty("user.dir");	//User's current working directory 가져와서 변수 저장
		System.out.println(currDir);
		File dir = new File(currDir);	//현재 작업중인 directory 저장할 변수 초기화
		String ext = "."+args[0];	//확장자명 저장할 변수
		
		delete(dir, ext);	//파일 삭제에 대한 메소드 호출
		System.out.println(deleteFiles+" 개의 파일이 삭제되었습니다.");
	}
	
	//파일 삭제 메소드 작성
		public static void delete(File dir, String ext) {
			File[] files = dir.listFiles();	//디렉토리의 파일명을 배열로 저장
			for (int i = 0; i < files.length; i++) {
				if (files[i].isDirectory()) {		//file[i] 가 디렉토리인지 확인
					//재귀호출 : 자신의 메소드를 호출
					delete(files[i],ext);		//디렉토리인 경우 파일 삭제
				}else {
				String fileName = files[i].getAbsolutePath();	//아닌 경우 배열의 절대경로를 fileName변수에 저장
				
					if (fileName.endsWith(ext)) {		//String  변수가 ext로 끝나면
						System.out.println(fileName);
						if (files[i].delete()) {
							System.out.println(" - 삭제 완료");
						deleteFiles++;
						}else {
						System.out.println(" - 삭제 실패");
						}
					}
				}	
			
			
			
			
			
		}	
	}
}

