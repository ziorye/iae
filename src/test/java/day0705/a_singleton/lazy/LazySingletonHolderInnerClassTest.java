package day0705.a_singleton.lazy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LazySingletonHolderInnerClassTest {
    @Test
    void testSingletonWithMultiThread() {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(LazySingletonHolderInnerClass.getInstance().hashCode());
            }).start();
        }
    }

    /*
    @Test
    void testDestroyByReflection() throws Exception {
        LazySingletonHolderInnerClass s1 = LazySingletonHolderInnerClass.getInstance();
        System.out.println(s1);

        Constructor<LazySingletonHolderInnerClass> declaredConstructor = LazySingletonHolderInnerClass.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        LazySingletonHolderInnerClass lazySingletonHolderInnerClass = declaredConstructor.newInstance();
        System.out.println(lazySingletonHolderInnerClass);
    }
     */
}