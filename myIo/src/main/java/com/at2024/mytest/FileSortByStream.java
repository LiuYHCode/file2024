package com.at2024.mytest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author lyh
 * @date 2024-09-22 17:59:04
 */
public class FileSortByStream {
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

        //流式计算方法解决
        Integer[] array = Arrays.stream(sb.toString()
                        .split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);
        String s = Arrays.toString(array).replace(", ", "-");
        String result = s.substring(1, s.length() - 1);

        //将最后的结果写入到文件
        FileWriter fw = new FileWriter("myIo\\a.txt");
        fw.write(result);

        fw.close();
        fr.close();
    }
}
