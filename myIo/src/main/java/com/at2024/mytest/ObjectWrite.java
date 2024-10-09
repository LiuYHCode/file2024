package com.at2024.mytest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author lyh
 * @date 2024-09-26 23:51:00
 */
public class ObjectWrite {
    public static void main(String[] args) throws IOException {
        /**
         * 需求：将多个自定义对象序列化到文件中，但是对象的个数不确定，该如何操作呢？
         */
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myIo\\a.txt"));

        Students s1 = new Students("lyh", 18, "hz");
        Students s2 = new Students("tst", 18, "hz");
        Students s3 = new Students("zh", 18, "hz");

        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.writeObject(s3);

        oos.close();
    }
}
