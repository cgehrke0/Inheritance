package constructors;

public class Complex {
	private double real, imag;
	
	// A normal parameterized constructor
	public Complex(double re, double im) {
		this.real = re;
		this.imag = im;
	}
	
	//copy constructor
	Complex(Complex c) {
		System.out.println("Copy constructor called");
		real = c.real;
		imag = c.imag;
	}
	
	// Overriding the toString of Object class
	@Override
	public String toString() {
		return "(" + real + " + " + imag + "i)";
	}
	// Overriding the quals of Object class
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		
		Complex complex = (Complex) obj;
		return (this.real == complex.real && this.imag == complex.imag);
	}

}
