package oracle.mangelt.exam_1z0_851;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

/**
 * Hello world!
 *
 */


public class App 
{
	
	
	public static void synchronizedmain( String[] args )
    {
		
		HashMap props = new HashMap();
		props.put("key45", "some value");
		props.put("key12", "some other value");
		props.put("key39", "yet another value");
		Set s = props.keySet();
//		s = new TreeSet(s);
		System.out.println(s);
		
    }
	
	public synchronized static void thred(){
		
	}
    
}



