package ch7;

//Excewption 상속받기

public class BalanceInsufficientException extends RuntimeException {

	public BalanceInsufficientException() {
		super();
		
	}

	public BalanceInsufficientException(String message) {
		super(message);
		
	}

}
