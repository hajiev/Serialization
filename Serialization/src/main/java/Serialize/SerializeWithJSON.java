package Serialize;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Type;

public class SerializeWithJSON {
    public static <T> void convertToJson(T t) throws IOException {
        Gson gson=new Gson();
        String text = gson.toJson(t);
        try(FileWriter fw=new FileWriter("gson.txt")){
            fw.write(text);
            System.out.println("Object serialized");
        }
    }

    public static <T> void convertFromJson(String text,T t) throws IOException {
        FileReader reader=new FileReader(text);
        Gson gson=new Gson();
        gson.fromJson(reader, );

        try(FileWriter fw=new FileWriter("gson.txt")){
            fw.write(text);
            System.out.println("Object serialized");
        }
    }

}
