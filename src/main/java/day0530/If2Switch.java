package day0530;

public class If2Switch {
    public static void main(String[] args) {
        int a = 3;
        int x = 100;

        if (a == 1)
            x += 5;
        else if (a == 2)
            x += 10;
        else if (a == 3)
            x += 16;
        else
            x += 34;

        System.out.println("x = " + x);
    }
}
