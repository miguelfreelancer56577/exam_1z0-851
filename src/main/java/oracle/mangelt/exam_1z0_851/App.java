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
    	
    	go();
    	
    }
    
    public static void go() {
    	String o = "";
    	z:
    	for(int x = 0; x < 3; x++) {
    		z2:
	    	for(int y = 0; y < 2; y++) {
		    	if(x==1) break z2;
		    	if(x==2 && y==1) break z;
		    	o = o + x + y;
	    	}
    	}
    	System.out.println(o);
	}
    
}
