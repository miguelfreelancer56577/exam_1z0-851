package oracle.mangelt.exam_1z0_851;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.PriorityQueue;

/**
 * Hello world!
 *
 */


public class App 
{

	public static void main( String[] args )
    {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("banana");
		pq.add("pear");
		pq.add("apple");
		System.out.println(pq);
		System.out.println(pq.poll() + " " + pq.peek());
		System.out.println(pq);
    }
    
}



