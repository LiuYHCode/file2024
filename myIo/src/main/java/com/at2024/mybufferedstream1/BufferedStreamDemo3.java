package com.at2024.mybufferedstream1;

import java.io.*;

/**
 * @author lyh
 * @date 2024-09-22 21:46:26
 */
public class BufferedStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /**
         * 字符缓冲流
         */
        BufferedReader br = new BufferedReader(new FileReader("myIo\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("myIo\\b.txt"));

//        String s = br.readLine();
//        System.out.println(s);
//        String s1 = br.readLine();
//        System.out.println(s1);
//        String s2 = br.readLine();
//        System.out.println(s2);

        String data;
        while ((data = br.readLine()) != null) {
            bw.write(data);
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}
