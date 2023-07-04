package day0530;

public class If1 {
    public static void main(String[] args) {
        test1();
        //test2();
    }

    private static void test1() {
        boolean b = true;
        /*
        b = false
         */
        if(b == false)
            System.out.println("a");
        else if(b)
            System.out.println("b");
        else if(!b)
            System.out.println("c");
        else
            System.out.println("d");
    }

    private static void test2() {
        /*
        int x = 4;
        int y = 1;
        if (x > 2) {
            if (y > 2)
                System.out.println(x + y);
                System.out.println("iae");
        } else
            System.out.println("x = " + x);
         */
        System.out.println("=== === ===");
    }
}
