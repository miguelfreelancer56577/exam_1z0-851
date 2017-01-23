package oracle.mangelt.exam_1z0_851;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	try {
    		test(); 
		}catch (RuntimeException ex) {
			System.out.print("runtime.. "); 
		}
    	
    	System.out.print("end ");
    	
    	
    }
    
    static void test() throws RuntimeException {
    	try {
    		System.out.print("test ");
    		throw new RuntimeException();
    	}//finally{}
    	catch (Exception ex) { System.out.print("exception "); }
	}
    
}
