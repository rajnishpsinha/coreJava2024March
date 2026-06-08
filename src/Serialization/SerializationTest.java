package Serialization;

import java.io.*;

public class SerializationTest  {

    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    public boolean serializeThis(Roads roads) {
        try{
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\testing\\roads.ser");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(roads);
        }catch(Exception  e )
        {
            System.out.println("Exception occured");
            System.out.println("Exception occured hi");

        }

        return true;
    }

    public boolean deserializethis() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream= new FileInputStream("E:\\testing\\roads.ser");
        ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
        Roads roads1=(Roads)objectInputStream.readObject();

        System.out.println(roads1);


        return false;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializationTest serializationTest = new SerializationTest();

      boolean result=  serializationTest.serializeThis(new Roads(1000,48000));
        serializationTest.deserializethis();
    }

}
