package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 * <p>
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        if (a < b) {
            System.out.println("a is less than b");
        }
        int c = 3;
        int d = 3;
        if (c <= d) {
            System.out.println("c is less than or equal to b");
        }
        int e = 17;
        int f = 8;
        if (e > f) {
            System.out.println("e is greater than f");
        }
        int g = 5;
        int h = 7;
        if (g >= h) {
            System.out.println("g is greater or equal to h");
        }
        int i = 2;
        int j = 2;
        if (i == j) {
            System.out.println("i is equal to j");
        }

    }
}







