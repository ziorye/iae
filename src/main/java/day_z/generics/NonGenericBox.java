package day_z.generics;

public class NonGenericBox {
    private Object object;

    public void set(Object object) {
        this.object = object;
    }

    public Object get() {
        return object;
    }

    public static void main(String[] args) {
        NonGenericBox nonGenericBox = new NonGenericBox();
        nonGenericBox.set("I am String");
        Object o = nonGenericBox.get();
        //o.length()
        String os = (String) nonGenericBox.get();
        System.out.println(os.length());
    }
}
