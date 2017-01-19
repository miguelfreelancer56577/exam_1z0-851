package oracle.mangelt.exam_1z0_851;

/**
 * Hello world!
 *
 */
public class App implements Runnable 
{
    public static void main( String[] args )
    {
//    	Thread t = new Thread(new App());
//    	t.start();
//        System.out.println( "End of method" );
    	waitForSignal();
    }
    
    public void run(){
    	System.out.println("run...");
    	throw new RuntimeException("a problem occur");
    }
    
    public static void waitForSignal() {
		Object obj = new Object();
		synchronized (Thread.currentThread()) {
			try {
				obj.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			obj.notify();
		}
	}
}
