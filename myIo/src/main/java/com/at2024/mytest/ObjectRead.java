package com.at2024.mytest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author lyh
 * @date 2024-10-09 21:51:42
 */
public class ObjectRead {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //v1.0 在明确知道写入几个对象的情况下，这样子获取是可以的，但是如果不知道对象数量，数量超出会报EOF
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myIo\\a.txt"));

        Students s1 = (Students) ois.readObject();
        Students s2 = (Students) ois.readObject();
        Students s3 = (Students) ois.readObject();
//        Students s4 = (Students) ois.readObject();//EOFException

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        ois.close();
    }
}
