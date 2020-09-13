package oops.abstractions;

public class user2 {

	public static void main(String[] args) 
	{
		
	RBI acc=bankfeature("ICICI");
	acc.creditCard();
	acc.debitcard();
	acc.savingAccount();
	acc.netBanking();
	acc.demonetization();
	
	sc.RBIGuideLines();
		
	}

 public static RBI bankfeature(String bankname)
 {
	 RBI acc=null;
	if(bankname.contentEquals("Hdfc"))	
	{
		acc=new Hdfc();
	}else if(bankname.contentEquals("ICICI"))
	{ 
		acc=new ICICI();
	}else if(bankname.equals("Axis"))
			{
		acc=new Axis();
	}
	return acc;
	}
}
