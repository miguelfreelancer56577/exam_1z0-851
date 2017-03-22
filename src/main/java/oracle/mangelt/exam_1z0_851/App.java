package oracle.mangelt.exam_1z0_851;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
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


public class App implements Serializable
{	
	
	private Tree t = new Tree();
	
	public String s = "Hello you!!!!!!!!!!"; 
	
	public static void main( String[] args )
    {	
		
		App a = new App();
		
		File f = new File("App.obj");
		
			try {
				
				if(!f.exists()){
					throw new Exception();
				}else{
					FileInputStream i = new FileInputStream (f);
					ObjectInputStream is = new ObjectInputStream(i);
					App app2 = (App)is.readObject();
					System.out.println(app2.s);
				}
				
			} catch (Exception e) {
				try {
					FileOutputStream o = new FileOutputStream(f);
					ObjectOutputStream s = new ObjectOutputStream(o);
					s.writeObject(a);
					s.close();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		
    }
	
}

class Tree implements Serializable {}

