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


public class App extends Thread
{
	private int x = 2;
	
	public App(){
		x = 5;
		start();
	}
	
	public static void main( String[] args ) throws Exception
    {	
		
		new App().makeItSo();
		
    }
	
	public void makeItSo() throws Exception {
		join();
		x = x - 1;
		System.out.println(x);
	}
	
	public void run() { x *= 2; }
	
}

