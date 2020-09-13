package oops.abstractions;

public class ICICI implements RBI
{
	@Override
	public void savingAccount() {
		System.out.println("ICICI bank saving account");
	}

	@Override
	public void creditCard() {
		System.out.println("ICICI bank creditcard account");
		
	}

	
	public void debitcard() {
		System.out.println("ICICI bank debitcard account");
		
	}

	@Override
	public void netBanking() {
		System.out.println("ICICI bank netbanking account");
		
	}
}
