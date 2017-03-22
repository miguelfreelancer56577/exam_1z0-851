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
	
	public static void main( String[] args )
    {	
		
		java.util.List<A> list = new java.util.ArrayList<A>();
		list.add(new B());
		list.add(new C());
		for (A a : list) {
			a.x();
//			a.y();
		}
		
    }
	
}

interface A{
	void x();
}

class B implements A {
	public void x(){
		System.out.println("hello a");
	}
	public void y(){
		
	}
}

class C extends B{
	public void x(){
		System.out.println("hello c");
	}
}

