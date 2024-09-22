package com.at2024.mycharstream1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author lyh
 * @date 2024-09-22 13:31:22
 */
public class CharStreamDemo5 {
    public static void main(String[] args) throws IOException {
        /**
         * 特殊情况分析
         */
        FileReader fr = new FileReader("myIo\\a.txt");

        //先读取文件的数据
        fr.read();

        //创建字符输出流对象，会把文件内容进行清空
        FileWriter fw = new FileWriter("myIo\\a.txt");

        //再用fr进行读取，能读取到数据吗？
        //答案是可以的，但是只能读取缓冲区中的数据，除缓冲区之外的数据会丢失
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.println((char) ch);
        }

        //先开后关
        fw.close();
        fr.close();
    }
}
