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
		
		Map<String , List<Test>> map = new HashMap<String , List<Test>>();
		
		map.put("1", new ArrayList<Test>());
		map.put("2", new ArrayList<Test>());
		
		System.out.println(map);
		
//		-----------------------
		
		
		switch ("1") {
		
		case "1":
			System.out.println("cad 1");
			break;
			
		case "2":
			System.out.println("cad 2");
			break;

		default:
			break;
		}
		
//		-------------------------
		
		try {
			List<String> lines =  Files.readAllLines(Paths.get("C:\\Users\\vn0x53q\\workspaceKepler\\exam_1z0-851\\README.md"), Charset.defaultCharset());
			for (String string : lines) {
				System.out.println(string);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		long l = 1_0_0_0000_0;
		
		System.out.println(l);
		
		
		
		
		
		
    }
	
}

class Test{}


