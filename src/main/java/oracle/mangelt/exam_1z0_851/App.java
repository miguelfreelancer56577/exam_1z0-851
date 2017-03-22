package oracle.mangelt.exam_1z0_851;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;


public class App implements Serializable
{	
	
	public static void main( String[] args )
    {	
		
		Three t = new Three();
		
		Three t2 = (Three)t.getInstance();
		
		System.out.println(t2.concurrentclass);
		
		Three t3 = (Three)new Two();
		
		System.out.println(t3.concurrentclass);
		
    }
	
}

class One{
	public String concurrentclass = "one" ;
	public One getInstance(){
		return this;
	}
}

class Two extends One{
	public String concurrentclass = "Two" ;
	public One getInstance(){
		return this;
	}
}

class Three extends Two{
	public String concurrentclass = "three" ;
	public One getInstance(){
		return this;
	}
}
