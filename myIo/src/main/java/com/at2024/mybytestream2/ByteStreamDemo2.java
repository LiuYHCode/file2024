package com.at2024.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author lyh
 * @date 2024-09-21 15:43:16
 */
public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /**
         * 字节输入流循环读取
         */
        FileInputStream fis = new FileInputStream("myIo\\a.txt");

        int b;
        while ((b = fis.read()) != -1) {
            System.out.print((char) b);
        }

        fis.close();

//        while (fis.read() != -1) {
//            System.out.print(fis.read());//不可取，每次read会向后移动一个指针，导致读取的数据不完整，有问题
//        }
    }
}
