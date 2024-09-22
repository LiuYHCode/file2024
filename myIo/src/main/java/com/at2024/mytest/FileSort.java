package com.at2024.mytest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author lyh
 * @date 2024-09-22 17:24:17
 */
public class FileSort {
    public static void main(String[] args) throws IOException {
        /**
         * 将文件中的数据进行排序写回
         * 1-2-9-7-3
         */
        FileReader fr = new FileReader("myIo\\a.txt");

        //读取文件数据
        int len;
        StringBuilder sb = new StringBuilder();
        while ((len = fr.read()) != -1) {
            sb.append((char) len);
        }

        String fileInfo = sb.toString();
        System.out.println(fileInfo);
        String[] arrStr = fileInfo.split("-");

        ArrayList<Integer> numList = new ArrayList<>();
        for (String s : arrStr) {
            numList.add(Integer.valueOf(s));
        }

        System.out.println(numList);

        //第一种排序
        //numList.sort((o1, o2)->{return o1.compareTo(o2);});
        //第二种排序，调用Arrays工具类
        Collections.sort(numList);
        System.out.println(numList);

        //将数据写入到文本文件中
        FileWriter fw = new FileWriter("myIo\\a.txt");

        for (int i = 0; i < numList.size(); i++) {
            if (i < numList.size() - 1) {
                fw.write(numList.get(i) + "-");
            } else {
                fw.write(numList.get(i) + "");
            }
        }

        fw.close();
        fr.close();
    }
}
