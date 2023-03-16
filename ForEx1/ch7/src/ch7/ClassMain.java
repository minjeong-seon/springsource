package ch7;

import java.util.Scanner;

/*Exception 클래스를 상속 받아서 NotExistIdException, WrongPassworException 작성
 *  
 */

public class ClassMain {
	public static void main(String[] args) {
		//사용자로부터 아이디와 비밀번호를 입력받아 login 메소드 호출하기
		Scanner sc = new Scanner(System.in);
		System.out.print("ID: ");
		String id = sc.nextLine();
		System.out.print("PW: ");
		String pwd = sc.nextLine();
		try {
			login(id, pwd);
		} catch (NotExistIdException | WrongPasswordException e) {
			e.printStackTrace();
		}
		
	}
	public static void login(String id, String pwd) throws NotExistIdException, WrongPasswordException {
		//id가 blue와 일치하지 않는다면 NotExistIdException 발생
		if (!id.equals("blue")) {
			throw new NotExistIdException("아이디를 확인해 주세요.");
		}
		//pwd가 12345와 일치하지 않는다면 WrongPassworException 발생
		if (!pwd.equals("12345")) {
			throw new WrongPasswordException("비밀번호를 확인해 주세요.");
		}
	}

	
}
