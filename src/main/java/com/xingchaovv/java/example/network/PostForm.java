package com.xingchaovv.java.example.network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;
import java.util.Scanner;

/**
 * POST 表单提交
 */
public class PostForm {

    public static void main(String[] args) throws IOException {
        // 构建 URL
        // PostFormServer.php 源码在本目录下
        URL url = new URL("http://127.0.0.1:8000/PostFormServer.php?ver=1");
        // 构建 URLConnection（还未建立实际网络连接）
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        // POST 数据
        String postData = "name=chaochao2";

        // 开启输出流
        connection.setDoOutput(true);
        // 基于输出流，构建 PrintWriter（字符打印输出流）
        PrintWriter writer = new PrintWriter(connection.getOutputStream());
        // 写入
        writer.write(postData);
        writer.flush();

        // 读取输入流
        Scanner scanner = new Scanner(connection.getInputStream());
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        // 返回结果示例；参见PostFormServer.php
        // Request Method: POST
        //
        // Request Uri: /PostFormServer.php?ver=1
        //
        // Headers:
        // User-Agent: Java/11.0.6
        // Host: 127.0.0.1:8000
        // Accept: text/html, image/gif, image/jpeg, *; q=.2, */*; q=.2
        // Connection: keep-alive
        // Content-type: application/x-www-form-urlencoded
        // Content-Length: 14
        //
        // Raw HTTP Body:
        // name=chaochao2
        //
        // Query Params:
        // ver: 1
        //
        // Post Fields:
        // name: chaochao2

    }
}
