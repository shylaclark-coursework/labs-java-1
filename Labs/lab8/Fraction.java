public class Fraction {
	private int num;
	private int den;
	
	public Fraction( int num, int den ) {
		this.num = num;
		this.den = den;
	}
	
	public Fraction add( Fraction f1 ) {
		int temp1 = (this.num * f1.den) + (f1.num * this.den);
		int temp2 = this.den * f1.den;
		
		return new Fraction( temp1, temp2 );
	}
	
	public Fraction subtract( Fraction f1 ) {
		int temp1 = (this.num * f1.den) - (f1.num * this.den);
		int temp2 = this.den * f1.den;
		
		return new Fraction( temp1, temp2 );
	}
	
	public Fraction multiply( Fraction f1 ) {
		int temp1 = this.num * f1.num;
		int temp2 = this.den * f1.den;
		
		return new Fraction( temp1, temp2 );
	}
	
	public Fraction divide( Fraction f1 ) {
		int temp1 = this.num * f1.den;
		int temp2 = this.den * f1.num;
		
		return new Fraction( temp1, temp2 );
	}
	
	public String toString() {
		return ( num + "/" + den );
	}
}