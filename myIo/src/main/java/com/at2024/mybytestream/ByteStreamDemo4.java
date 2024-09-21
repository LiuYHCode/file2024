package com.at2024.mybytestream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author lyh
 * @date 2024-09-21 15:10:08
 */
public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        /**
         * 换行
         *      win:\r\n
         *      linux:\n
         *      mac:\r
         *
         * 续写
         *      FileOutputStream参数：第一个是文件名，append代表是否续写
         */

        //1.创建文件输出流
        FileOutputStream fos = new FileOutputStream("myIo\\a.txt",true);
        //2.写入数据
        String info1 = "dashuaige";
        byte[] bytes1 = info1.getBytes();

        //换行符，win系统上写\r，\n都可以，jvm后续会给我们补充为\r\n
        String crlf = "\r\n";
        byte[] bytes2 = crlf.getBytes();

        String info2 = "666";
        byte[] bytes3 = info2.getBytes();
        fos.write(bytes1);
        fos.write(bytes2);
        fos.write(bytes3);

        String info3 = "777";
        byte[] bytes4 = info3.getBytes();
        fos.write(bytes4);
        //3.关闭资源
        fos.close();
    }
}
