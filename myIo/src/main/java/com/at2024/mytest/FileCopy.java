package com.at2024.mytest;

import java.io.*;

/**
 * @author lyh
 * @date 2024-09-22 13:51:02
 */
public class FileCopy {
    public static void main(String[] args) throws IOException {
        //文件拷贝，从原路径拷贝到目标路径，使用字节流
        File origin = new File("D:\\TyporaPDF\\JavaEE");
        File dest = new File("D:\\TyporaPDF\\CopyTest");
        copyFileDir(origin, dest);
    }

    private static void copyFileDir(File origin, File dest) throws IOException {
        File[] files = origin.listFiles();
        dest.mkdir();
        for (File file : files) {
            if (file.isFile()) {
                //是文件，则进行拷贝
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest, file.getName()));

                //读取数据进行拷贝
                int len;
                byte[] bytes = new byte[1024];
                while ((len = fis.read(bytes)) != -1) {
                    fos.write(bytes, 0, len);
                }

                //关闭资源
                fos.close();
                fis.close();
            } else {
                //文件夹，进行递归处理
                copyFileDir(file, new File(dest, file.getName()));
            }
        }
    }

}
