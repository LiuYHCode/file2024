package com.at2024.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author lyh
 * @date 2024-09-21 20:15:36
 */
public class ByteStreamDemo6 {
    public static void main(String[] args) {
        //流要初始给一个null
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            /**
             * 文件拷贝改写
             */
            fis = new FileInputStream("D:\\wife picture\\-1b2b481fdbd4cf66.gif");
            fos = new FileOutputStream("myIo\\copy.gif");

            long start = System.currentTimeMillis();
            int len;
            byte[] bytes = new byte[2];
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
            long end = System.currentTimeMillis();
            System.out.println("文件拷贝总耗时:" + (end - start) + "毫秒");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //文件流保证先开后关的原则
            if (null != fos) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            if (null != fis) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
