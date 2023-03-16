package org.example;

import Serialize.SerializeWithJSON;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Person person1 =new Person("Haciyev","Fuad",34,
                new Adress("Baki seheri","Yasamal rayonu","+994552144378"));
        Person person2=new Person("Qarayev","Rafiq",22,
                new Adress("Sumqayit seheri","11-ci mikrorayon","+994552222222"));

//        SimpleSerialize.serialize(person1,person2);
//        SimpleSerialize.<Person>deserialize("test.txt",2);
        SerializeWithJSON.convertToJson(person1);

    }
}
