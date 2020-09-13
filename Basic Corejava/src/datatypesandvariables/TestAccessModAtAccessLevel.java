package datatypesandvariables;

import functions.AccessModifiers;

public class TestAccessModAtAccessLevel extends AccessModifiers
{

	public static void main(String[] args) {
		
        AccessModifiers obj= new AccessModifiers();
        obj.Publicmethod();
        
        TestAccessModAtAccessLevel obj2= new TestAccessModAtAccessLevel();
        obj2.protectedmethod();
	}

}
