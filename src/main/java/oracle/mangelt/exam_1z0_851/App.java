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
    	
    	int x = 5;
    	
    	App a = new App();
    	
    	a.doStuff(x);
    	
    	System.out.println(" main x = " + x);
    	
    	
    }
    
    void doStuff(int x){
    	System.out.println(" doStuff x = " + x++);
    }
    
}
