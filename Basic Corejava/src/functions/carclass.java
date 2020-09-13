package functions;

public class carclass {

			
    String name;
    String color;
    int wheels=4;
    
      
    
    public carclass(String name, String colour)
    
    {
    	this.name=name;
    	this.color=colour;
    	
    }
    
  //default constructor 
    public carclass() {
		// TODO Auto-generated constructor stub
	}
    
	public void driving()
    {
    	System.out.println("I am driving "+color+" color "+name+" which has "+wheels+" wheels");
    	
    }
    
    
    
    

	

}
