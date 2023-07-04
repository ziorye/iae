package day0529;

public class Arithmetic1 {
    public static void main(String[] args) {
        int i1 = 18;
        int i2 = 28;
        int i = i1++;

        /*
        i=18 i1=19
         */
        System.out.print("i=" + i);
        System.out.println(" i1=" + i1);

        i = ++i1;
        /*
        i=20 i1=20
         */
        System.out.print("i=" + i);
        System.out.println(" i1=" + i1);

        i = i2--;
        /*
        i=28 i2=27
         */
        System.out.print("i=" + i);
        System.out.println(" i2=" + i2);

        i = --i2;
        /*
        i=26 i2=26
         */
        System.out.print("i=" + i);
        System.out.println(" i2=" + i2);
    }
}
