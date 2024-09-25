package com.at2024.myconvertstream1;

import java.io.*;

/**
 * @author lyh
 * @date 2024-09-25 22:22:36
 */
public class ConvertStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /**
         * 利用转换流按照指定字符编码写出数据
         */
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myIo\\d.txt"), "GBK");
        osw.write("你好你好");
        osw.close();

        /* //jdk11之后的写法
        FileWriter fw = new FileWriter("myIo\\d.txt", Charset.forName("GBK"));
        fw.write("你好你好");
        fw.close();*/
    }
}
