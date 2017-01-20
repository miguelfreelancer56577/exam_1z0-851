package oracle.mangelt.exam_1z0_851;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	RaceCar racer = new RaceCar();
    	Car car = new RaceCar();
    	Vehicle vehicle = new RaceCar();
    	System.out.println(racer.speed() + ", " + car.speed() + ", " + vehicle.speed());
    	
    }
    
}
