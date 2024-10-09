package com.at2024.myzipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @author lyh
 * @date 2024-10-09 23:18:44
 */
public class ZipStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //1.创建一个File表示要解压的压缩包
        File src = new File("D:\\c_code\\aaa.zip");
        //2.创建一个解压的目的地
        File dest = new File("D:\\c_code\\");
        //3.开始解压
        unzip(src, dest);
    }

    public static void unzip(File src, File dest) throws IOException {
        //解压的本质就是把压缩包里面的文件或者文件夹读取出来，按照层级放到目的地中去
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));

        //先获取到压缩包里面的每一个zipentry对象
        //entry对象是压缩包里面的相对路径
        ZipEntry entry;
        while ((entry = zip.getNextEntry()) != null) {
            if (entry.isDirectory()) {
                //如果是文件夹，那么就创建文件夹
                File file = new File(dest, entry.toString());//dest路径拼接上压缩包里面的相对路径，组成文件和文件夹路径
                file.mkdir();
            } else {
                //如果是文件，就对文件进行拷贝
                FileOutputStream fos = new FileOutputStream(new File(dest, entry.toString()));
                int b;
                while ((b = zip.read()) != -1) {
                    fos.write(b);
                }
                fos.close();
            }
            //表示在压缩包中的一个文件处理完毕了
            zip.closeEntry();
        }
    }
}
