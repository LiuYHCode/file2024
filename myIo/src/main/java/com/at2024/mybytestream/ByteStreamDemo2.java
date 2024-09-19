package com.at2024.mybytestream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author lyh
 * @date 2024-09-19 23:26:47
 */
public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /**
         * 字节输出流的细节
         *      1.创建字节输出流对象：
         *          细节1：参数是字符串表示的路径或者是File对象都可以的
         *          细节2：如果路径下的文件不存在，则会创建一个新的文件，但是要保证父路径是存在的
         *          细节3：如果文件存在，会清空文件的内容再进行写入
         *      2.写数据：
         *          write方法的参数是整数，但是写入的内容是数字所对应的ascii码
         *      3.释放资源：
         *          每次使用完流之后都要进行资源的释放（java程序占用资源）
         */
        //1.创建文件输出流
        FileOutputStream fos = new FileOutputStream("myIo\\a.txt");
        //2.写入数据
        fos.write(97);
        //3.关闭资源
        fos.close();
    }
}
