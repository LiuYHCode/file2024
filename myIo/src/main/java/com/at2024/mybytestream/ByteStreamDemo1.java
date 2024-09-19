package com.at2024.mybytestream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author lyh
 * @date 2024-09-19 23:26:47
 */
public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /**
         * 演示：字节输出流FileOutputStream
         * 实现需求：写出一段文字到本地文件中。（暂时不写中文）
         *
         * 实现步骤：
         *      创建对象
         *      写出数据
         *      释放资源
         */
        //1.创建文件输出流
        FileOutputStream fos = new FileOutputStream("myIo\\a.txt");
        //2.写入数据
        fos.write(97);
        //3.关闭资源
        fos.close();
    }
}
