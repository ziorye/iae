package day0705.a_singleton.eager;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import static org.junit.jupiter.api.Assertions.*;

class EagerSingletonSerializableTest {
    @Test
    void testDestroyBySerialized() throws Exception {
        EagerSingletonSerializable instance = EagerSingletonSerializable.getInstance();
        System.out.println(instance.hashCode());

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("instance"));
        oos.writeObject(instance);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("instance"));
        EagerSingletonSerializable instance2 = (EagerSingletonSerializable)ois.readObject();
        ois.close();
        System.out.println(instance2.hashCode());
    }
}