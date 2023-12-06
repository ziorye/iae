package day_z.generics;

import day_z.generics.bean.A;
import day_z.generics.bean.B;
import day_z.generics.bean.C;
import day_z.generics.bean.Z;

import java.util.ArrayList;

public class Wildcards {
    public static void m1(ArrayList<?> m) {
        System.out.println(m);
    }

    public static void m2(ArrayList<? extends A> m) {
        System.out.println(m);
    }

    public static void m3(ArrayList<? super B> m) {
        System.out.println(m);
    }

    public static void main(String[] args) {
        Wildcards.m1(new ArrayList<A>());
        Wildcards.m1(new ArrayList<B>());
        Wildcards.m1(new ArrayList<C>());
        Wildcards.m1(new ArrayList<Z>());
        Wildcards.m1(new ArrayList<String>());

        Wildcards.m2(new ArrayList<A>());
        Wildcards.m2(new ArrayList<B>());
        Wildcards.m2(new ArrayList<C>());
        //Wildcards.m2(new ArrayList<Z>());

        Wildcards.m3(new ArrayList<A>());
        Wildcards.m3(new ArrayList<B>());
        //Wildcards.m3(new ArrayList<C>());
    }
}

