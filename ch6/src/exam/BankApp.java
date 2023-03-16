package exam;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class BankApp {
	//인스턴스 변수(초기화 완료) --클래스 이하 모든 메소드에서 사용하기 위한 변수
	private static Account[] accountArray= new Account[10];   //account 배열 10개 선언&생성
	private static Scanner scanner = new Scanner(System.in);   //사용자 입력받기
	
		public static void main(String[] args) {
			boolean run = true;
			while(run) {
				System.out.println("-------------------------------------");
				System.out.println("1. 계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5. 종료");
				System.out.println("-------------------------------------");
				System.out.println("선택 >> ");
				
				//sc.nextLine(); String 타입으로 입력값을 처리한다는 의미
				//scanner.nextInt(); int 타입으로 입력값을 처리
//				int selectNo = scanner.nextInt();  
				//nextInt : ▲ int값만 가져가므로 키보드 입력 후 enter누르면 다음으로 넘어가버림
				int selectNo = Integer.parseInt(scanner.nextLine());
				
				
				switch (selectNo) {
				case 1:
					creatAccount();
					break;
				case 2:
					accountList();
					break;
				case 3:
					deposit();
					break;
				case 4:
					withdraw();
					break;
				case 5:
					//while문 종료
					run=false;
					break;
				default:
					break;
				}
			}//while문 종료
	}//main 종료
		
		private static void creatAccount() {
			//계좌생성(Account 인스턴스를 생성하기 위한 값을 입력받기)-계좌번호, 이름, 잔액
			//for문을 돌려 i에 해당되는 배열 초기값이 null이면 수행 <-한번만 수행되고 빠져나오도록 처리
			
			for (int i = 0; i < accountArray.length; i++) {
				System.out.println("계좌번호 >>");
				String ano = scanner.nextLine();
				System.out.println("예금주 >>");
				String owner = scanner.nextLine();
				System.out.println("잔액 >>");
				int balace = Integer.parseInt(scanner.nextLine());
					if (accountArray[i]==null) {
					accountArray[i]=new Account(ano, owner, balace);
					System.out.println("계좌가 생성되었습니다.");
					break;
				}
				
			}
		}
		private static void accountList() {
			//accountArray에 있는 내용 출력하기
			for (int i = 0; i < accountArray.length; i++) {
					if (accountArray[i]!=null) {
						System.out.printf("계좌번호: %s | 예금주: %s | 잔액: %d\n",
							accountArray[i].getAno(),
							accountArray[i].getOwner(),
							accountArray[i].getBalance());
					break;
					}
			}
		}
			
		private static void deposit() {
			//계좌번호 + 예금액 입력받고
			//accountArray에서 일치하는 계좌를 찾아 잔액+예금액 출력
			for (int i = 0; i < accountArray.length; i++) {
				System.out.println("계좌번호: ");
				String ano=scanner.nextLine();
				if (ano.equals(accountArray[i].getAno())) {
					System.out.println("예금액: ");
					int amount=Integer.parseInt(scanner.nextLine());
					amount+=accountArray[i].getBalance();
					System.out.printf("잔액: %d원\n",amount);
					}else {
						System.out.println("계좌번호를 다시 확인해주세요.");
					}break;
				}
				
			}
		
		
		private static void withdraw() {
			System.out.print("계좌번호 >> ");
			String ano = scanner.nextLine();
			for (int i = 0; i < accountArray.length; i++) {
				if(accountArray[i].getAno().equals(ano)) {
					System.out.print("출금액 >> ");
					int amount = Integer.parseInt(scanner.nextLine());
					accountArray[i].setBalance(accountArray[i].getBalance() - amount);
					System.out.printf("잔액: %d원\n",accountArray[i].getBalance());
					}else {
						System.out.println("계좌번호를 다시 확인해주세요.");
					}break;
				}
			}		
		
		}