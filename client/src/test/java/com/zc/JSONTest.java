package com.zc;


import zc.utils.Md5;

public class JSONTest {
    public static void main(String[] args) throws Exception{
        String str=Md5.check("你在干嘛呢");
        System.out.println(str);
    }
}
