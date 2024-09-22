package com.at2024.mytest;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author lyh
 * @date 2024-09-22 21:55:07
 */
public class TitleSort {
    public static void main(String[] args) throws IOException {
        /**
         * 对带序号的文章顺序进行排序
         *
         * 2.因为有你
         * 1.听我说谢谢你
         * 3.哈哈哈
         */
        BufferedReader br = new BufferedReader(new FileReader("myIo\\a.txt"));

        //读取数据
        String data;
        ArrayList<String> titleLineList = new ArrayList<>();
        while ((data = br.readLine()) != null) {
            titleLineList.add(data);
        }

        //排序
        Collections.sort(titleLineList, (o1, o2) -> {
            int i1 = Integer.parseInt(o1.split("\\.")[0]);
            int i2 = Integer.parseInt(o2.split("\\.")[0]);
            return i1 - i2;
        });
        br.close();

        //将排序好的数据写到文件中
        BufferedWriter bw = new BufferedWriter(new FileWriter("myIo\\b.txt"));
        for (String s : titleLineList) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}
