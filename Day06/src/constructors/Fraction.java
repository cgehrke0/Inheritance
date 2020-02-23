package constructors;
/**
 * 
 * @author Carter
 *
 *This class represents a fraction
 *
 */
public class Fraction {
	private int numerator;
	private int denominator;
	public int getNumerator() {
		return numerator;
	}
	/**
	 * numerator settter
	 * @param numerator
	 */
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	/**
	 * denom getter
	 * @return denominator
	 */
	public int getDenominator() {
		return denominator;
	}
	/**
	 * Denom setter
	 * @param denominator
	 */
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	/**
	 * Default constructor. creates 0/1
	 */
	public Fraction() {
		this(0,1);
	}
	/**
	 * Numerator constructor. creates number/1
	 * @param number
	 */
	public Fraction(int number) {
		this(number, 1);
	}
	/**
	 * Copy constructor. creates frac.getNumerator()/frac.getDenominator()
	 * @param frac
	 */
	
	public Fraction(Fraction frac) {
		this(frac.getNumerator(), frac.getDenominator());
	}
	/**
	 * num and denom constructor. creates numerator/denominator
	 * @param num
	 * @param denom
	 */
	
	public Fraction(int num, int denom) {
		setNumerator(num);
		setDenominator(denom);
	}
	/**
	 * Computes Fraction
	 * @return result of division
	 */
	public int compute() {
		return getNumerator()/getDenominator();
	}

}
