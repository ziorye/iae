package day_z.generics;

public class GenericMethod {
    public <T> void m1(T t) {
        System.out.println(t);
    }

    public static <T> void m2(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        GenericMethod.m2("static");
        new GenericMethod().m1(89);
    }
}
