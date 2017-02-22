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
	
	public static void main( String[] args )
    {
		
		TreeSet<Integer> s = new TreeSet<Integer>();
		TreeSet<Integer> subs = new TreeSet<Integer>();
		for(int i = 606; i < 613; i++)
		if(i%2 == 0) s.add(i);
		subs = (TreeSet)s.subSet(608, true, 611, true);
		s.add(609);
		System.out.println(s + " " + " " + subs + " " + subs.last());
		
    }
    
}



