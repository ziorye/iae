package day0529;

/**
 * Operators 3: Comparison Operators
 *
 * == !=
 * > >=
 * < <=
 * instanceof (The Type Comparison Operator)
 *
 * result = boolean
 * = vs ==
 */
public class Comparison {
    public static void main(String[] args) {
        int i = 18;
        int j = 28;

        /*
        false
         */
        System.out.println(i == j);
        /*
        28
         */
        System.out.println(i = j);

        boolean b1 = false;
        boolean b2 = true;
        /*
        false
         */
        System.out.println(b1 == b2);
        /*
        true
         */
        System.out.println(b1 = b2);
    }
}
