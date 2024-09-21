package com.at2024.mycharstream1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author lyh
 * @date 2024-09-21 21:19:36
 */
public class CharStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /**
         * 字符输出流
         * 1.建立连接
         *
         * 2.写入数据
         *      write(int c)
         *
         *      write(char cbuf[], int off, int len)
         *      write(char cbuf[])
         *
         *      write(String str, int off, int len)
         *      write(String str)
         * 3.关闭连接
         *
         */
        //1.创建对象并关联本地文件
        FileWriter fw = new FileWriter("myIo\\a.txt");
        fw.write(25105);//根据字符集的编码方式进行编码，把编码之后的数据写到文件夹中去
        fw.close();
    }
}
