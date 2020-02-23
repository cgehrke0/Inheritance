package constructors;

public class TestConstructor {

	public static void main(String[] args) {
		//Test Person class
		Person person = new Person();
		Person person1 = new Person("Smith");

		System.out.println("person name: " + person.getName());
		System.out.println("person name: " + person1.getName());


		//Test Rectangle class
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(7);
		Rectangle r3 = new Rectangle(4,3);

		System.out.println(r1.area()); 
		System.out.println(r2.area());
		System.out.println(r3.area());
		
		//Test Fraction Class
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction(5);
		Fraction f3 = new Fraction(9,3);
		Fraction f4 = new Fraction(f3);
		
		System.out.println(f1.compute());
		System.out.println(f2.compute());
		System.out.println(f3.compute());
		System.out.println(f4.compute());
		
		//Test Clock class
		Clock c1 = new Clock();
		Clock c2 = new Clock(3);
		Clock c3 = new Clock(2,30);
		
		System.out.println("Clock1: " + c1);
		System.out.println("Clock2: " + c2);
		System.out.println("Clock3: " + c3);
		

	}
}
