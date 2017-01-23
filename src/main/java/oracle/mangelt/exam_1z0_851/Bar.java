package oracle.mangelt.exam_1z0_851;

public class Bar extends Foo{
	
	public int a = 8;
	
	public void addFive() {
		
		this.a += 5; 
		System.out.print("bar " + this.a);
		
	}
}
