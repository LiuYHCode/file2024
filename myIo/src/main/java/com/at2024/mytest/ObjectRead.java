package com.at2024.mytest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * @author lyh
 * @date 2024-10-09 21:51:42
 */
public class ObjectRead {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //v1.0 在明确知道写入几个对象的情况下，这样子获取是可以的，但是如果不知道对象数量，数量超出会报EOF
        //v2.0 添加到List集合中写入文件
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myIo\\a.txt"));

        List<Students> stuList = (List<Students>) ois.readObject();

        for (Students students : stuList) {
            System.out.println(students);
        }
        ois.close();
    }
}
