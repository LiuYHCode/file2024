package com.at2024.mytest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author lyh
 * @date 2024-09-22 14:35:30
 */
public class FileEncy {
    public static void main(String[] args) throws IOException {
        /**
         * 文件加密解密，本次使用的加密解密规则是通过异或来处理的
         * 异或，相同得false，不同true
         * 100 ^ 10 = 110
         * 110 ^ 10 = 100
         *
         *      0110 0100(100)
         *    ^ 0000 1010(10)
         *    --------------------
         *      0110 1110(110)
         */

//        FileInputStream fis = new FileInputStream("myIo\\copy.gif");
        FileInputStream ency = new FileInputStream("myIo\\ency.gif");
//        FileOutputStream fos = new FileOutputStream("myIo\\ency.gif");
        FileOutputStream redu = new FileOutputStream("myIo\\redu.gif");

        int len;
        while ((len = ency.read()) != -1) {
            redu.write(len ^ 10);
        }

        ency.close();
        redu.close();
    }
}
