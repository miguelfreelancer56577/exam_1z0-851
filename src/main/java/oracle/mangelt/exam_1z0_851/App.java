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
    	
    	DateFormat df = DateFormat.getDateInstance();
    	
    	Date d = new Date(0L);
    	String ds = "December 15, 2004";
    	
    	try {
			d = df.parse(ds);
			d = DateFormat.getDateInstance().parse(ds);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }
    
}
