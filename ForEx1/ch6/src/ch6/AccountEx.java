package ch6;

public class AccountEx {

	public static void main(String[] args) {
		Account account1=new Account("110-10-123456","홍길동",10000);
		Account account2=new Account("110-10-998877","김이박",200000);
		
		System.out.println((account1.owner)+" "+(account1.accountNo));
		System.out.println("=========================");
		System.out.println("입금 후 잔액: "+account1.deposit(10000));
		System.out.println("출금 후 잔액: "+account1.withdraw(5000));
		
		System.out.println();
		
		System.out.println((account2.owner)+" "+(account2.accountNo));
		System.out.println("=========================");
		System.out.println("입금 후 잔액: "+account2.deposit(300000));
		System.out.println("출금 후 잔액: "+account2.withdraw(450000));
	}

}
