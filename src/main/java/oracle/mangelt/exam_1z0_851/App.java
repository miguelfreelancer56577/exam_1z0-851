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
		
		Runnable r = new Runnable() {
			
			public void run() {
				System.out.println("cat");
			}
			
		};
		
		Thread t = new Thread(r){
			
			public void run(){
				System.out.println("dog");
			}
			
		};
		
		t.start();
		
		
    }
	
}


 class One {
	 protected void foo() { }
 }

 class Two extends One {
//	 int foo() { /* more code here */ }
//	 void foo() { /* more code here */ }
//	 public void foo() { /* more code here */ }
//	 private void foo() { /* more code here */ }
//	 protected void foo() { /* more code here */ }
 }



