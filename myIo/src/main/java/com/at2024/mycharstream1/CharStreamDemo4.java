package com.at2024.mycharstream1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author lyh
 * @date 2024-09-21 21:19:36
 */
public class CharStreamDemo4 {
    public static void main(String[] args) throws IOException {
        /**
         * 字符输入流底层原理
         * 会创建一个字符数组缓冲区，在read()的时候，会先把内存中的数据读取到字符缓冲区来\
         * 缓冲区大小是8192
         */

        /**
         * 字符输出流底层原理
         * 会创建一个字符数组缓冲区，在write()的时候，并不会马上将数据写到文件中
         * 缓冲区满了，在写入数据的时候，会先把数据覆盖缓冲区数组
         *
         * 缓冲区落磁盘的情况：
         *      1.缓冲区满
         *      2.手动flush()
         *      3.流关闭close()
         */
//        FileReader fr = new FileReader("myIo\\a.txt");
//        for (int i = 0; i < 8192; i++) {
//            fr.read();
//        }
//        //读取到8193个的时候，才会覆盖缓冲区的数据
//        fr.read();
//        fr.close();

//        FileWriter fw = new FileWriter("myIo\\a.txt");
//        for (int i = 0; i < 8192; i++) {
//            fw.write(97);
//        }
//        //写8193个数据的时候，才把缓冲区前8192个数据写到磁盘中
//        fw.write(98);
//
//        fw.close();

        FileWriter fw = new FileWriter("myIo\\a.txt");
        fw.write(97);

        fw.flush();//前面写了一个数据，然后我们刷新落盘

        //写8193个数据的时候，才把缓冲区前8192个数据写到磁盘中
        fw.write(98);

        fw.close();
    }
}
