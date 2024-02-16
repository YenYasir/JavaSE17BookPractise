package classdemo.ch10;

import java.io.*;

record Member(String id, String name, int age) {
    public void save() throws IOException {
        //建立DataOutputStream包裹FileOutputStream
        try(var output = new DataOutputStream(new FileOutputStream(id))) {
            //根據不同型態呼叫write方法
            output.writeUTF(id);
            output.writeUTF(name);
            output.writeInt(age);
        }
    }

    public static Member load(String id) throws IOException {
        try(var input = new DataInputStream(new FileInputStream(id))) {
            return new Member(input.readUTF(), input.readUTF(), input.readInt());
        }
    }
}