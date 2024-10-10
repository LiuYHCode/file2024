package com.at2024.myzipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author lyh
 * @date 2024-10-10 21:15:49
 */
public class ZipStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //压缩文件夹
        //1.创建File对象表示要压缩的文件夹
        File src = new File("D:\\c_code\\aaa");
        //2.创建File对象表示压缩包放在哪里（压缩包的父级路径）
        File destParent = new File(src.getParent());
        //3.创建File对象表示
        File dest = new File(destParent, src.getName());
        //4.创建压缩文件流
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest + ".zip"));
        //5.进行文件夹的压缩
        //难点1，传给zip压缩方法的时候，使用dest.getName()，这样子拿到的就是aaa这个最初的文件夹
        toZip(src, zos, dest.getName());
        //6.关流
        zos.close();
    }

    public static void toZip(File src, ZipOutputStream zos, String name) throws IOException {
        //从src去拿文件或者文件夹，先列出来子的文件目录，看一下有哪些
        File[] files = src.listFiles();

        //处理空文件夹
        if (files == null || files.length == 0) {
            ZipEntry entry = new ZipEntry(name + "/");
            zos.putNextEntry(entry);
            zos.closeEntry();
            return;
        }

        for (File file : files) {
            // 检查是否为空文件夹
            if (file.isFile()) {
                //难点2，每一个entry都是在压缩包下面的相对路径，所以文件存放的位置就是传到zip方法的时候目的地文件夹name+文件name
                //ZipEntry会自动创建好对应的文件夹，假如压缩包里面是aaa\aa\aa.txt，如果没有aa\文件夹，创建aa.txt会把aa子文件夹连带创建
                ZipEntry entry = new ZipEntry(name + "\\" + file.getName());
                System.out.println(file.getName());
                //如果是文件的话，那就将文件放入压缩包，此时是一个entry，里面没有详细的数据
                zos.putNextEntry(entry);
                //数据写入
                int b;
                FileInputStream fis = new FileInputStream(file);
                while ((b = fis.read()) != -1) {
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();
            } else {
                //如果是文件夹，那就进行递归
                toZip(file, zos, name + "\\" + file.getName());
            }
        }
    }
}
