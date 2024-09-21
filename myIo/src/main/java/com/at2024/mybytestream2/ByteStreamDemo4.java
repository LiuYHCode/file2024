package com.at2024.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author lyh
 * @date 2024-09-21 16:56:05
 */
public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        //创建文件输入流对象
        FileInputStream fis = new FileInputStream("myIo\\a.txt");

        byte[] bytes = new byte[2];
//        //读取的数据会填充到byte数组当中去，返回值是读取字节长度
//        int len = fis.read(bytes);
//        System.out.println(len);
//        System.out.println(new String(bytes));
//
//        len = fis.read(bytes);
//        System.out.println(len);
//        System.out.println(new String(bytes));
//
//        //abcde，最后第三次读出来是ed，byte数组覆盖，只覆盖了第一个，之前的数组数据没被覆盖
//        len = fis.read(bytes);
//        System.out.println(len);
//        System.out.println(new String(bytes));//ed

        int len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes, 0, len));

        len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes, 0, len));

        len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes, 0, len));

        fis.close();
    }
}
