package oracle.mangelt.exam_1z0_851;

interface TestA{
	
}

public class Rainbow {
		
	public static void main(String[] args) {
		
		System.out.println(new TestA() {
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "TestA";
			} 
		});
		
	}
}
