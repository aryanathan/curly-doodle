package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all arithmetic operators below. These include:
 *
 * addition, subtraction, multiplication, division and modulus
 *
 */
class ArithmeticOperators {

    public static void main(String[] args) {

        int a = 12;
        int b = 17;
        int d = a + b;
        System.out.println("Addition result = " + d);

        int c = 11;
        int e = 15;
        int f = e - c;
        System.out.println("Subtraction result = " + f);

        int g = 2;
        int h = 3;
        int i = g * h;
        System.out.println("Multiplication result = " + i);

        int j = 16;
        int k = 4;
        int l = 16 / 4;
        System.out.println("Division result = " + l);

        int m = 15;
        int n = 8;
        int o = m % n ;
        System.out.println("Modulus result = " + o);

    }

}
