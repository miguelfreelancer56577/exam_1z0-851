package oracle.mangelt.exam_1z0_851;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;


public class App 
{
	
	public static void main( String[] args )
    {	
		
		Locale l = Locale.getDefault();
		DateFormat df = DateFormat.getDateInstance();
		Date d = new Date();
		System.out.println(l.getCountry());
		System.out.println(l.getDisplayCountry());
		System.out.println(d.toString());
		System.out.println(df.format(d));
		
		
		
    }
	
}

