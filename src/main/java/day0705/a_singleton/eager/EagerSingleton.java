package day0705.a_singleton.eager;

public class EagerSingleton {
    private EagerSingleton() {}

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
