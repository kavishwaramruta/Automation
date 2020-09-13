package oops.abstractions;

public class AbstractClassExample1Implementation extends AbstractClassExample {

	@Override
	public void abstractmethod() {
		
		System.out.println("This is abstract method which is overridden in its implemented class");
		
	}
	
	public static void main(String args[])
	{
		AbstractClassExample ab= new AbstractClassExample1Implementation();
		ab.abstractmethod();
		ab.nonabstractmethod();
	}

}
