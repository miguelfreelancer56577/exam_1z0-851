package oracle.mangelt.exam_1z0_851;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;


public class App 
{
	
	public static void main( String[] args )
    {	
		
		try {
			new A().sayHello("Aiko");
		} catch (TestException e) {
			e.printStackTrace();
		}
		
    }
	
	
	
}


class TestException extends Exception { }
class A {
	public String sayHello(String name) throws TestException {
		if(name == null) throw new TestException();
		return "Hello " + name;
	}
}


