package com.at2024.mycharstream1;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author lyh
 * @date 2024-09-21 21:19:36
 */
public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /**
         * 字符输入流
         */
        //1.创建对象并关联本地文件

        //2.读取数据 read();
        //字符流底层也是字节流，默认也是一个字节一个字节读取的
        //如果遇见中文会一次读取多个，GBK一次读取两个字节，UTF-8一次读取三个字节

        //3.read()细节
        //读取的数据默认也是一个字节一个字节读取的，中文读取多个
        //读取完之后，方法的底层会解码转换为十进制

        //想看到这些汉字，就将十进制再进行转码就行
        FileReader fr = new FileReader("myIo\\a.txt");
        int read;
        while ((read = fr.read()) != -1) {
            System.out.print((char) read);
        }

        fr.close();
    }
}
