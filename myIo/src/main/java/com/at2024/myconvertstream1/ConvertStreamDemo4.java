package com.at2024.myconvertstream1;

import java.io.*;

/**
 * @author lyh
 * @date 2024-09-25 22:22:36
 */
public class ConvertStreamDemo4 {
    public static void main(String[] args) throws IOException {
        /**
         * 利用字节流读取文件中的数据，每次读取一行，并且不能出现乱码
         *
         * 1.字节流在读取中文的时候，是会出现乱码的，但是字符流可以搞定（这里说的字符流不会乱码，因为字符流会根据GBK和UTF-8，
         * 读取中文的时候，决定一次读取2个字节或者3个字节，如果输出到控制台有乱码，是因为idea这里是utf-8输出，你要指定一下gbk输出）
         * 2.字节流里面是没有读取一行数据的方法的
         */
        FileInputStream fis = new FileInputStream("myIo\\d.txt");//字节流
        InputStreamReader isr = new InputStreamReader(fis, "GBK");//字节转换成了字符流
        BufferedReader br = new BufferedReader(isr);//缓冲流中有读取一行数据的办法
        String line;
        while ((line = br.readLine()) != null) {
            System.out.print(line);
        }
        br.close();//关br，里面会一起关


        /*BufferedReader br1 = new BufferedReader(new InputStreamReader(
                new FileInputStream("myIo\\d.txt"), "GBK"));//一步到位*/
    }
}
