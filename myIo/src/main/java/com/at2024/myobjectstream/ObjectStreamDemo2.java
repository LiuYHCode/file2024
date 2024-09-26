package com.at2024.myobjectstream;

import com.at2024.domain.Student;

import java.io.*;

/**
 * @author lyh
 * @date 2024-09-25 23:48:02
 */
public class ObjectStreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /**
         * 利用反序列化流/对象操作输入流，把文件中的对象读到程序中
         *
         * 构造方法：
         *      ObjectInputStream(InputStream in);     //把基本流变为高级流
         *
         * 成员方法
         *      writeObject(Object obj)     //把对象序列化到文件中去
         */
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myIo\\f.txt"));
        Object o = ois.readObject();
        System.out.println(o.toString());

        ois.close();
    }
}
