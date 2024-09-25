package com.at2024.myobjectstream;

import com.at2024.domain.Student;

import java.io.*;

/**
 * @author lyh
 * @date 2024-09-25 23:48:02
 */
public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /**
         * 利用序列化流/对象操作流操作输出流，将对象写到本地文件中
         *
         * 构造方法：
         *      new ObjectOutputStream(new OutputStream());     //把基本流变为高级流
         *
         * 成员方法
         *      writeObject(Object obj)     //把对象序列化到文件中去
         */
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myIo\\f.txt"));

        Student student = new Student("大拇哥", 18);

        oos.writeObject(student);

        oos.close();
    }
}
