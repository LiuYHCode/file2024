package com.at2024.mybytestream2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author lyh
 * @date 2024-09-21 17:06:13
 */
public class ByteStreamDemo5 {
    public static void main(String[] args) throws IOException {
        /**
         * 文件拷贝改写
         */
        FileInputStream fis = new FileInputStream("D:\\wife picture\\-1b2b481fdbd4cf66.gif");
        FileOutputStream fos = new FileOutputStream("myIo\\copy.gif");

        long start = System.currentTimeMillis();
        int len;
        byte[] bytes = new byte[2];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        long end = System.currentTimeMillis();
        System.out.println("文件拷贝总耗时:" + (end - start) + "毫秒");

        //文件流保证先开后关的原则
        fos.close();
        fis.close();
    }
}
