package oracle.mangelt.exam_1z0_851;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

/**
 * Hello world!
 *
 */


public class App 
{
	
	public static void main( String[] args )
    {
		
		new TestFive().go();
		
    }
	
}

class TestFive {
	
   private int x;
  
   public void foo() {
	   synchronized (this) {
		   int current = x;
		   x = current + 1;
		   System.out.print(x + ", ");
	   }
   }
   
//   public synchronized void foo() {
//	   int current = x;
//	   x = current + 1;
//	   System.out.println(x + ", ");
//   }
  
   public void go() {
	   for(int i = 0; i < 100; i++) {
		   new Thread() {
			   public void run() {
				   foo();
			   }
		   }.start();
	   }
   }
}



