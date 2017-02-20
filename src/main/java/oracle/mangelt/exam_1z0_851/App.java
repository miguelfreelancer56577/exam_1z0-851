package oracle.mangelt.exam_1z0_851;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 * Hello world!
 *
 */

class ClassA {
	public int numberOfInstances;
	protected ClassA(int numberOfInstances) {
		this.numberOfInstances = numberOfInstances;
	}
}

public class App extends ClassA
{
    protected App(int numberOfInstances) {
		super(numberOfInstances);
	}

	public static void main( String[] args )
    {
    	App a = new App(3);
    	System.out.print(a.numberOfInstances);
    }
    
}

class ClassB{
	public static void main(String[] args) {
		App a = new App(4);
	}
}


