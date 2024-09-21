package com.at2024.mycharset;

import java.io.UnsupportedEncodingException;

/**
 * @author lyh
 * @date 2024-09-21 20:27:03
 */
public class CharSetDemo1 {
    public static void main(String[] args) {
        /**
         * GB2312:1980年发布，简体汉字
         * BIG5:台湾地区繁体字
         * GBK:2000年发布，包含GB1300-1中的全部中日韩汉字，以及BIG5的繁体字
         * WIN系统默认用的就是GBK。   系统显示:ANSI(简体GBK，繁体BIG5，统一显示ANSI)
         *
         * ASCII字符集：英文存储一个字节，前位补0，汉字存储两个字节，前位补1
         * GBK完全兼容ASCII
         */

        /**
         * Unicode
         * UTF-16编码规则：用2-4个字节保存
         * UTF-32编码规则：固定用4个字节保存
         * UTF-8编码规则：用1-4个字节保存（不是字符集，是Unicode的一种编码方式）
         *      英文一个字节:0xxx xxxx
         *      简体中文三个字节:1110xxxx 10xxxxxx 10xxxxxx
         */

        /**
         * 如何不产生乱码？
         * 1.不要使用字节流读取文本文件
         * 2.编码解码时使用同一个码表，使用同一种编码方式
         */

        /**
         * java中的编码方式
         *      byte[] getBytes()                           //默认编码方式
         *      byte[] getBytes(String charsetName)         //指定编码方式
         * 解码方式
         *      String(byte bytes[])                        //指定解码方式
         *      String(byte bytes[], String charsetName)    //指定解码方式
         */
        String str = "love爱你";
        try {
            byte[] bytes1 = str.getBytes("GBK");
            System.out.println(new String(bytes1,"GBK"));

            byte[] bytes2 = str.getBytes();
            System.out.println(new String(bytes2,"GBK"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

    }
}
