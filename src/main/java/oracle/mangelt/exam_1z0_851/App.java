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
		
		RecursiveTest test = new RecursiveTest();
		
		test.val1(3);
		
    }
	
}

class RecursiveTest{
	public void val1(int x){
		val2(x);
	}
	
	public void val2(int y){
		val1(y);
	}
}

