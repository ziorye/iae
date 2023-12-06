package day_z.generics;

public class GenericBox<T> {
    private T object;

    public void set(T object) {
        this.object = object;
    }

    public T get() {
        return object;
    }

    public static void main(String[] args) {
        GenericBox<String> genericBox = new GenericBox<>();
        genericBox.set("I am String");
        String s = genericBox.get();
        System.out.println(s.length());
    }
}
