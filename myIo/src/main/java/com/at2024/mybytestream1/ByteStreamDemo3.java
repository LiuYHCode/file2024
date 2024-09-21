package com.at2024.mybytestream1;

import java.io.FileOutputStream;

/**
 * @author lyh
 * @date 2024-09-20 23:52:09
 */
public class ByteStreamDemo3 {
    public static void main(String[] args) throws Exception {
        /**
         * void write(int b);                        写入一个字符
         * void write(byte b[]);                          写入字符数组
         * void write(byte b[], int off, int len);        写入字符数组从下标off开始长度len位的字符数组
         */
        FileOutputStream fos = new FileOutputStream("myIo\\a.txt");
        fos.write(97);//a

        byte[] bytes = {97, 98, 99, 100, 101};
        fos.write(bytes);

        fos.write(bytes, 1, 2);

        fos.close();
    }
}
