package com.at2024.myconvertstream1;

import java.io.*;

/**
 * @author lyh
 * @date 2024-09-25 22:22:36
 */
public class ConvertStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /**
         * 转换流本质上，这个InputStreamReader的父亲是Reader，是字符流中的一员
         *
         * 利用转换流按照指定字符编码读取
         * D:\TyporaPDF\Work2024\gbkfile.txt
         */
        //创建对象读取数据
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream("D:\\TyporaPDF\\Work2024\\gbkfile.txt"), "GBK");
        //开始读取
        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.print((char) ch);
        }
        //释放资源
        isr.close();

/*
        //jdk11之后，FileReader更新了新的指定编码读取的方法
        FileReader fr = new FileReader("D:\\TyporaPDF\\Work2024\\gbkfile.txt", "GBK");
        //开始读取
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        //释放资源
        fr.close();*/
    }
}
