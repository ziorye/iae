package day0705.a_singleton.lazy;

public class LazySingletonLockBlockDoubleCheck {
    private static LazySingletonLockBlockDoubleCheck INSTANCE;

    private LazySingletonLockBlockDoubleCheck() {
    }

    public static LazySingletonLockBlockDoubleCheck getInstance() {
        if (INSTANCE == null) {
            synchronized (LazySingletonLockBlockDoubleCheck.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazySingletonLockBlockDoubleCheck();
                }
            }
        }
        return INSTANCE;
    }
}
