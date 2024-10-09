package com.at2024.myzipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author lyh
 * @date 2024-10-09 23:46:46
 */
public class ZipStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //1.创建一个File表示要解压的压缩包
        File src = new File("D:\\c_code\\abc.zip");
        //2.创建一个解压的目的地
        File dest = new File("D:\\c_code\\");
        //3.开始解压
        toZip(src, dest);
    }

    public static void toZip(File src, File dest) throws IOException {
        //并不是直接到dest，还要指定好压缩包的名字
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest, "abc.zip")));
        //压缩包里面是空的，现在添加压缩包里面的entry对象
        ZipEntry entry = new ZipEntry("abc.txt");
        zos.putNextEntry(entry);
        //对象添加进去了，现在要写入数据
        FileInputStream fis = new FileInputStream(src);
        int b;
        while ((b = fis.read()) != -1) {
            zos.write(b);
        }
        zos.closeEntry();
        zos.close();
    }
}
