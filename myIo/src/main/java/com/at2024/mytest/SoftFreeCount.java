package com.at2024.mytest;

import java.io.*;

/**
 * @author lyh
 * @date 2024-09-23 23:34:21
 */
public class SoftFreeCount {
    public static void main(String[] args) throws IOException {
        /**
         * 第一次运行，控制台显示，欢迎使用本软件，第1次使用免费
         * 第二次运行，控制台显示，欢迎使用本软件，第2次使用免费
         * 第三次运行，控制台显示，欢迎使用本软件，第3次使用免费
         *
         * 第四次之后，显示本软件只能免费使用三次，欢迎您注册会员之后继续使用
         */
        BufferedReader br = new BufferedReader(new FileReader("myIo\\count.txt"));
        String line = br.readLine();
        int count = Integer.parseInt(line == null ? "0" : line);

        count++;

        if (count <= 3) {
            System.out.println("欢迎使用本软件，第"+ count +"次使用免费");
        } else {
            System.out.println("本软件只能免费使用三次，欢迎您注册会员之后继续使用");
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("myIo\\count.txt"));
        bw.write(count + "");
        bw.close();
    }
}
