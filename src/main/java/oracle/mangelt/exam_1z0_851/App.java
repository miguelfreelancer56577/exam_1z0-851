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
			test();
		} catch (Exception e) {
			System.out.print("exception ");
		}
		
    }
	
	static void test() {
		try {
		String x = null;
		System.out.print(x.toString() + " ");
		}
		finally { System.out.print("finally "); }
	}
	
}



