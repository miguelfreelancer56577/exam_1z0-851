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
		
		Base b = new Base();
		Sub s = new Sub();
		System.out.print(Base.FOO);
		System.out.print(Sub.FOO);
		System.out.print(b.FOO);
		System.out.print(s.FOO);
		System.out.print(((Base) s).FOO);
//		((Base) s).Hi();
//		s.Hi();
		((Sub) b).Hi();
    }
	
}


class Base {
	public static final String FOO = "foo";
	public void Hi(){
		System.out.println(">>hi Base<<");
	}
}

class Sub extends Base {
	public static final String FOO = "bar";
	public void Hi(){
		System.out.println(">>hi Sub<<");
	}
}