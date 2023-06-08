package day0608.test;

import day0607.Member;

/**
 * Person
 * // name
 * // age[]
 */
public class Demo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "二逼";
        animal.setLegs(2);

        System.out.println(animal.getLegs());
    }
}

class Animal {
    // state
    String name;
    private int legs;

    //behavior
    public void setLegs(int ls) {
        if (ls < 0) {
            System.out.println("非法的参数");
            legs = 0;
            //System.exit(-1);
        } else {
            legs = ls;
        }
    }
    public int getLegs() {
        //
        return legs;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", legs=" + legs +
                '}';
    }
}
