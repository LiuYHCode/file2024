package com.at2024.myconvertstream1;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @author lyh
 * @date 2024-09-25 22:22:36
 */
public class ConvertStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /**
         * 将本地的GBK文件进行读取，转换成UTF-8写出
         */
        InputStreamReader isr = new InputStreamReader(new FileInputStream("myIo\\d.txt"), "GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myIo\\e.txt"), "UTF-8");

        int ch;
        while ((ch = isr.read()) != -1) {
            osw.write((char) ch);
        }
        osw.close();
        isr.close();
    }
}
