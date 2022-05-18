package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

    double r = 3.14;
    double h = 5;
    double v = r*r*3.145*h;
    double s = 2*r*3.145*h+r*r*3.145*2;
        System.out.println("The volume is :" + v);
        System.out.println("The surface area is :" + s);
    }
}