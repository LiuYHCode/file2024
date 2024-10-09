package com.at2024.myprintstream;

import java.io.*;

/**
 * @author lyh
 * @date 2024-10-09 22:39:17
 */
public class PrintStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //1.创建字符打印流对象
        //字符打印流有缓冲区，开启或者不开启自动刷新有区别，自动刷新，不关闭流也会自动把缓冲区的数据写入到文件
        PrintWriter ps = new PrintWriter(new FileWriter("myIo\\a.txt"), true);

        ps.println("你好你好");
        ps.print("哈哈哈");
        ps.printf("%s爱上了%s","啊真","啊强");

        ps.close();

        //系统中的标准输出流就是PrintStream
        //System.out独一个，java虚拟机初始化的时候进行创建，在java程序停止之前不允许对out进行关闭，否则控制台打印不了输出信息
        PrintStream printStream = System.out;
        printStream.println("111");
    }
}
