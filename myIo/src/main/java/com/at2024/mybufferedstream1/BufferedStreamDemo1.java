package com.at2024.mybufferedstream1;

import java.io.*;

/**
 * @author lyh
 * @date 2024-09-22 21:26:00
 */
public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /**
         * 需求：利用字节缓冲流拷贝文件
         *
         * 字节缓冲输入流的构造方法：
         *      BufferedInputStream(InputStream in)
         *
         * 字节缓冲输出流的构造方法
         *      BufferedOutputStream(OutputStream out)
         */
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myIo\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myIo\\b.txt"));

        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }

        bos.close();
        bis.close();
    }
}
