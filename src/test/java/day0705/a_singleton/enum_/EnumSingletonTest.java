package day0705.a_singleton.enum_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

import static org.junit.jupiter.api.Assertions.*;

class EnumSingletonTest {
    @Test
    void testSingleton() {
        EnumSingleton s1 = EnumSingleton.INSTANCE;
        EnumSingleton s2 = EnumSingleton.INSTANCE;

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
    @Test
    void testSingletonWithMultiThread() {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                System.out.println(EnumSingleton.INSTANCE.hashCode());
            }).start();
        }
    }

    @Test
    void testDestroyByReflection() throws Exception {
        EnumSingleton s1 = EnumSingleton.INSTANCE;
        System.out.println(s1.hashCode());

        Constructor<EnumSingleton> declaredConstructor = EnumSingleton.class.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);
        assertThrows(IllegalArgumentException.class, () -> {
            declaredConstructor.newInstance("INSTANCE", 0);
        });
    }

    @Test
    void testDestroyBySerialized() throws Exception {
        EnumSingleton instance = EnumSingleton.INSTANCE;
        System.out.println(instance.hashCode());

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("instance-enum"));
        oos.writeObject(instance);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("instance-enum"));
        EnumSingleton instance2 = (EnumSingleton)ois.readObject();
        ois.close();
        System.out.println(instance2.hashCode());
    }
}