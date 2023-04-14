[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-f059dc9a6f8d3a56e377f745f24479a46679e63a5d9fe6f495e02850cd0d8118.svg)](https://classroom.github.com/online_ide?assignment_repo_id=7038730&assignment_repo_type=AssignmentRepo)
# CSC 240 Computer Science III
## Homework 3

[![Points badge](../../blob/badges/.github/badges/points.svg)](../../actions)

Develop a Fraction class that is capable of doing arithmetic with fractions.  An outline of the class is given below.  Fractions are held in lowest terms, that is, you should divide out any common multiple of the numerator and denominator. The  gcd() method will help with this. You should complete the implementations of all the class methods (including the constructor).  Also create a TestFraction class and paste in the code shown below.  Your Fraction class should produce the correct results when used in TestFraction. You should submit the files `Fraction.java` and `TestFraction.java` files here. 

```java
/**
 * Code Template Authors: Dr. Stephen Roehrig
 *                        and David G. Cooper
 * Submission Author: 
 * Date: 
 * Purpose: An object for holding and adding fractions
 */
public class Fraction {
    private int numerator;
    private int denominator;
    
    public Fraction(int n, int d) {
        // add code here
    }
    // greatest common divisor:
    public static int gcd(int a, int b) { 
        if (b == 0) {
            return (a);
        } else {
            return (gcd(b, a % b));
        }
    }

    public String toString() {
        // add code here 
    }

    public String toDecimal() {
        // add code here
    }

    public Fraction add(Fraction f) {
        // add code here
    }
}
```


```java
/**
 * Code Authors: Dr. Stephen Roehrig
 *               and David G. Cooper
 * Purpose: Test the Fraction class
 */
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
```

With my classes, this prints:
```
f1              = 1/1
f2              = 1/3
f3              = 1/2
f4              = -3/4
f1 + f2         = 4/3
f3 + f4         = -1/4
f2 in decimal is: 0.3333333333333333
```
 
