package oracle.mangelt.exam_1z0_851;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	App a = new App();
    	a.go();
    }
    
    public void go() {
    	Runnable r = new Runnable() {
			
			public void run() {
				System.out.println("foo");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		t.start();
	}
}
