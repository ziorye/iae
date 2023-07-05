package day0705.a_singleton.lazy;

public class LazySingletonLockBlockDoubleCheckVolatile {
    private static volatile LazySingletonLockBlockDoubleCheckVolatile INSTANCE;

    private LazySingletonLockBlockDoubleCheckVolatile() {
    }

    public static LazySingletonLockBlockDoubleCheckVolatile getInstance() {
        if (INSTANCE == null) {
            synchronized (LazySingletonLockBlockDoubleCheckVolatile.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazySingletonLockBlockDoubleCheckVolatile();
                }
            }
        }
        return INSTANCE;
    }
}
