package oracle.mangelt.exam_1z0_851;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Arrays;
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
		
		String[] colors = {"blue", "red", "green", "yellow", "orange"};
		for (int i = 0; i < colors.length; i++) {
			System.out.println("no sort: " + colors[i]);
		}
		Arrays.sort(colors);
		for (int i = 0; i < colors.length; i++) {
			System.out.println("sort: " + colors[i]);
		}
		int s2 = Arrays.binarySearch(colors, "orange");
		int s3 = Arrays.binarySearch(colors, "violet");
		int s4 = Arrays.binarySearch(colors, "brown");
		
		System.out.println(s2 + " " + s3 + " " + s4);
		
    }
    
}



