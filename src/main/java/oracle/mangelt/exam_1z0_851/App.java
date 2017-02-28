package oracle.mangelt.exam_1z0_851;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.TreeSet;

/**
 * Hello world!
 *
 */


public class App 
{
	
enum Regex{
		
		NONUMERIC("\\D");
		
		private String ex;
		
		Regex(String ex){
			this.ex = ex;
		}
		
		public String getEx() {
			return ex;
		}
	}
	
	public static void main( String[] args )
    {
		
		String regex = "\\D";
		
		String replacement = "TRF8709701----------+++ñññññññññññññññ313";
		
		System.out.println(replacement.replaceAll(regex, ""));
		
		System.out.println(Regex.NONUMERIC.getEx());
		
    }
    
}



