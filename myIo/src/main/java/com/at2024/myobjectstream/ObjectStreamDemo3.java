package com.at2024.myobjectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author lyh
 * @date 2024-09-25 23:48:02
 */
public class ObjectStreamDemo3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /**
         * 序列化流的一些小细节
         * 1.如果写出了序列化对象到文件中，我们对javaBean进行修改，再使用反序列化流去读取的话就会报错
         *      这个情况，可以在javaBean中指定一个固定的版本号解决
         *
         * 2.如果我们对写入到本地的对象文件进行修改，那么再次读取文件的时候就会报错，显示文件可能被篡改
         *
         * 3.如果有想要隐藏的信息，那就在属性添加
         */
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myIo\\f.txt"));
        Object o = ois.readObject();
        System.out.println(o.toString());

        ois.close();
    }
}
