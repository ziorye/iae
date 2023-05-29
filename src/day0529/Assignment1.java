package day0529;

public class Assignment1 {
    public static void main(String[] args) {
        //思考1:
        short s = 3;
        //s = s + 2;
        //s += 2;

        //思考2:
        int i = 1;
        i *= 0.1; // i = i * 0.1;
        /*
        0
         */
        System.out.println(i);
        i++;
        /*
        1
         */
        System.out.println(i);

        //思考3
        int m = 2;
        int n = 3;
        /*
        n = n * m++;
         */
        n *= m++;
        /*
        3
         */
        System.out.println("m=" + m);
        /*
        6
         */
        System.out.println("n=" + n);
    }
}
