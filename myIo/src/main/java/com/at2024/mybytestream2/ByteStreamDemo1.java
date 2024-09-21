package com.at2024.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author lyh
 * @date 2024-09-21 15:29:06
 */
public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /**
         * 演示：字节输出流FileInputStream
         * 实现需求：从本地文件中读取数据。（暂时不读中文）
         *
         * 实现步骤：
         *      创建对象
         *      读取数据
         *      释放资源
         *
         * 字符输入流的细节
         * 创建对象：
         *      细节1：如果该文件不存在，则报错找不到该文件（最重要的是数据）
         *
         * 读取数据：
         *      细节1：读取文件的末尾，返回-1
         *      细节2：每次读取一个字节，读出来的数据是ASCII所对应的数字
         */
        FileInputStream fis = new FileInputStream("myIo\\a.txt");
        int info1 = fis.read();
        System.out.println((char) info1);

        int info2 = fis.read();
        System.out.println((char) info2);

        int info3 = fis.read();
        System.out.println((char) info3);

        int info4 = fis.read();
        System.out.println((char) info4);

        //如果读取到末尾没有数据，则返回-1
        int info5 = fis.read();
        System.out.println((char) info5);

        fis.close();
    }
}
