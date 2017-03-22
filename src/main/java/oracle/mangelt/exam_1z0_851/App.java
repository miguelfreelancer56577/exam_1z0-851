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
		
		MultiCalc calculator = new MultiCalc();
		calculator.calculate(2);
		System.out.println("Value is: " + calculator.value);
		
    }
	
}

class SimpleCalc {
	public int value;
	public void calculate() { value += 7; }
}

class MultiCalc extends SimpleCalc {
	
	public void calculate() { 
		value -= 3; 
	}
	
	public void calculate(int multiplier) {

		calculate();
		
		super.calculate();
		
		value *= multiplier;
	}
}

