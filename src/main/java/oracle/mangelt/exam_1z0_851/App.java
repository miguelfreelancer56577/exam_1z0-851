package oracle.mangelt.exam_1z0_851;

/**
 * Hello world!
 *
 */
public class App implements Runnable 
{
    public static void main( String[] args )
    {
    	Thread t = new Thread(new App());
    	t.start();
        System.out.println( "End of method" );
    }
    
    public void run(){
    	System.out.println("run...");
    	throw new RuntimeException("a problem occur");
    }
}
