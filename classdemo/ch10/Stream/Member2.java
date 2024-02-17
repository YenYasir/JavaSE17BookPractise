package classdemo.ch10.Stream;

import java.io.*;

//實施序列化 以讓程式能直接讀寫物件
record Member2(String id, String name, int age) implements Serializable {
    public void save() throws IOException {
        try(var output = new ObjectOutputStream(new FileOutputStream(id))) {
            output.writeObject(this);
        }
    }

    public static Member2 load(String id)
            throws IOException, ClassNotFoundException {
        try(var input = new ObjectInputStream(new FileInputStream(id))) {
            return (Member2) input.readObject();
        }
    }
}