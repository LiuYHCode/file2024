package com.at2024.mycharstream1;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author lyh
 * @date 2024-09-21 21:19:36
 */
public class CharStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /**
         * 字符输入流
         *      有参read
         */
        //1.创建对象并关联本地文件
        FileReader fr = new FileReader("myIo\\a.txt");
        int len;
        char[] chars = new char[2];
        //read有参其实就是read无参+强制类型转换
        //read(char cbuf[])读取数据，解码，强转三步合并，把强转之后的字符放在了字符数组中
        while ((len = fr.read(chars)) != -1) {
            System.out.print(new String(chars, 0, len));
        }

        fr.close();
    }
}
