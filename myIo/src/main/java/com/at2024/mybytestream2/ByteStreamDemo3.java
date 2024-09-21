package com.at2024.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author lyh
 * @date 2024-09-21 16:12:16
 */
public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /**
         * 文件拷贝
         *      暂时拷贝一个小文件
         */
        FileInputStream fis = new FileInputStream("D:\\wife picture\\-1b2b481fdbd4cf66.gif");
        FileOutputStream fos = new FileOutputStream("myIo\\copy.gif");

        long start = System.currentTimeMillis();
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        long end = System.currentTimeMillis();
        System.out.println("文件拷贝总耗时:" + (end - start) + "毫秒");

        //文件流保证先开后关的原则
        fos.close();
        fis.close();
    }
}
