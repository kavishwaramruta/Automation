package oops.abstractions;

public class Axis implements RBI 
{

	@Override
	public void savingAccount() {
		System.out.println("Axis bank saving account");
	}

	@Override
	public void creditCard() {
		System.out.println("Axis bank creditcard account");
		
	}

	
	public void debitcard() {
		System.out.println("Axis bank debitcard account");
		
	}

	@Override
	public void netBanking() {
		System.out.println("Axis bank netbanking account");
		
	}

}
