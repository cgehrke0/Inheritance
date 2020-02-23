package constructors;

public class ComplexTest {

	public static void main(String[] args) {
		Complex c1 = new Complex(10,15);
		
		//Following involves a copy constructor call
		Complex c2 = new Complex(c1);
		
		//
		//
		Complex c3 = c2;
		if(c1.equals(c2)) {
			System.out.println("c1 equals c2");
		} else {
			System.out.println("c1 Not equals c2");
		}
		if(c1 == c2) {
			System.out.println("c1 == c2");
		} else {
			System.out.println("c1 != c2");
		}
		
		System.out.println(c2);
	}
}
