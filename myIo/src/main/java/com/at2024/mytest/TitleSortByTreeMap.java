package com.at2024.mytest;

import java.io.*;
import java.util.*;

/**
 * @author lyh
 * @date 2024-09-22 21:55:07
 */
public class TitleSortByTreeMap {
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
        br.close();

        //排序
        //TreeMap自带排序，根据key值排序好
        TreeMap<Integer, String> dataMap = new TreeMap<>();
        for (String lineData : titleLineList) {
            String[] split = lineData.split("\\.");
            dataMap.put(Integer.valueOf(split[0]), split[1]);
        }

        //如果想要落文件的内容是带上序号的话，那就dataInfo的时候，写到map中的是line的数据就可以，不要进行切割
        BufferedWriter bw = new BufferedWriter(new FileWriter("myIo\\b.txt"));
        Set<Map.Entry<Integer, String>> entries = dataMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            bw.write(entry.getValue());
        }
        bw.close();
    }
}
