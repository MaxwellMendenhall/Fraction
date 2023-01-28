package main;

public class TestFraction {

	public static void main(String[] args) {
		 	Fraction f1 = new Fraction(3, 3);
	        Fraction f2 = new Fraction(4, 12);
	        Fraction f3 = new Fraction(5, 10);
	        Fraction f4 = new Fraction(-6, 8);

	        System.out.println("f1              = " + f1);
	        System.out.println("f2              = " + f2);
	        System.out.println("f3              = " + f3);
	        System.out.println("f4              = " + f4);
	        System.out.println("f1 + f2         = " + f1.add(f2));
	        System.out.println("f3 + f4         = " + f3.add(f4));
	        System.out.println("f2 in decimal is: " + f2.toDecimal());
	}

}
