package main;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int n, int d) {
		this.numerator=n;
		this.denominator=d;
		
		numerator  = n/gcd(n,d); 
		denominator = d/gcd(n,d);
		
	}
	//Euclid's Algorithm
	//it gets the greatest common number that can be divided by both of numbers passed into the method
	public static int gcd(int a, int b) {
		if (b == 0) {
			return (a);
        }else {
            return (gcd(b, a % b));
        }
	}
	public String toString() {
		
		if(denominator < 0) {
			int testn = numerator*-1;
			int testd = denominator *-1;
			String end = Integer.toString(testn) + "/" + Integer.toString(testd);
			return end;
		}else{
			String end = Integer.toString(numerator) + "/" + Integer.toString(denominator);
			return end;
		}
	}
	public String toDecimal() {
		
		double decimal = (double)numerator / (double)denominator;
		
		String end = Double.toString(decimal);
		
		return end;
	}
	public Fraction add(Fraction f) {
		
		int nume = (numerator * f.denominator) + (f.numerator * denominator); 
		//System.out.println(nume);
		
		int deno = (denominator * f.denominator);
		//System.out.println(deno);
		
		//the nume 'Sign' and the deno 'Sign' get swtiched 
		return new Fraction(nume, deno);
		
		
	}
}
