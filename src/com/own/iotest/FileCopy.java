package com.own.iotest;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;

/**
 * @Author:lcl
 * @Date:2020/5/30
 * @Content: 文件复制的方式
 */
public class FileCopy {

    private static String src = "E:\\工作相关\\txt\\规范注意事项.txt";
    private static String tar = "E:\\工作相关\\txt\\files-cocy.txt";

    /**
     * 方法一：通过IO 文件输入输出流
     *
     * 基础：流的关闭顺序：
     *          先打开的后关闭
     *          有依赖关系的流，如a依赖b,先关闭a,再关b
     */
    public static void ioTest(){
        InputStream is = null;
        OutputStream os = null;
        try {
            is =  new FileInputStream(new File(src));
            os =  new FileOutputStream(new File(tar));

           byte[] b = new byte[1024];
           int length;
           while ((length = is.read(b)) > 0){
               os.write(b,0, length);
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                os.close();
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


    public static void nioTest(){
        FileChannel srcChannel = null;
        FileChannel tarChannel = null;
        try {
             srcChannel = new FileInputStream(src).getChannel();
             tarChannel = new FileOutputStream(tar).getChannel();



            for (long size = srcChannel.size();size > 0;){
                long transferTo = srcChannel.transferTo(srcChannel.position(), size, tarChannel);

                size -= transferTo;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                srcChannel.close();
                tarChannel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void filesCocyTest(){
        InputStream is = null;
        OutputStream os = null;
        try {
            File file = new File(src);
            os = new FileOutputStream(new File(tar));

            Files.copy(file.toPath(), os);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        filesCocyTest();
    }
}
