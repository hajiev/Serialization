package Serialize;

import java.io.*;

public class SimpleSerialize {
    public static <T> void serialize(T t) throws IOException {
        try (FileOutputStream os = new FileOutputStream("test.txt")) {
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(t);
            oos.close();
        }
    }
    public static <T> void serialize(T t1,T t2) throws IOException {
        try (FileOutputStream os = new FileOutputStream("test.txt")) {
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(t1);
            oos.writeObject(t2);
            oos.close();
        }
    }
    public static <T> void serialize(T t1,T t2,T t3) throws IOException {
        try (FileOutputStream os = new FileOutputStream("test.txt")) {
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(t1);
            oos.writeObject(t2);
            oos.writeObject(t3);
            oos.close();
        }
    }
    public static <T> void deserialize(String text,int objectCount) throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream(text)) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            for (int i=0;i<objectCount;i++) {
                T person = (T) ois.readObject();
                System.out.println(person.toString());
            }
            ois.close();


        }
    }

}