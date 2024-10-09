package com.at2024.myprintstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 * @author lyh
 * @date 2024-10-09 22:39:17
 */
public class PrintStreamDemo1 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        //1.创建字节打印流对象
        //字节打印流无缓冲区，开启或者不开启自动刷新都没有区别
        PrintStream ps = new PrintStream(new FileOutputStream("myIo\\a.txt"), true, "UTF-8");

        ps.println("你好你好");
        ps.print("哈哈哈");
        ps.printf("%s爱上了%s","啊真","啊强");

        ps.close();
    }
}
