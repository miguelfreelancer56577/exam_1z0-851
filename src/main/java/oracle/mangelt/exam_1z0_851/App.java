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


public class App
{	
	
	public static void main( String[] args )
    {	
		
		Fish f = new Walleye();
		Walleye w = new Walleye();
		Bluegill b = new Bluegill();
		if (f instanceof Perch)
		System.out.print("f-p ");
		if (w instanceof Fish)
		System.out.print("w-f ");
		if (b instanceof Fish)
		System.out.print("b-f ");
		
    }
	
}

interface Fish{}

class Perch implements Fish{}

class Walleye extends Perch{}

class Bluegill{}


