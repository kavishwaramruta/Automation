package oops.abstractions;

public class Hdfc implements RBI 
{
	@Override
	public void savingAccount() {
		System.out.println("Hdfc bank saving account");
	}

	@Override
	public void creditCard() {
		System.out.println("Hdfc bank creditcard account");
		
	}

	
	public void debitcard() {
		System.out.println("Hdfc bank debitcard account");
		
	}

	@Override
	public void netBanking() {
		System.out.println("Hdfc bank netbanking account");
		
	}

}
