package com.xingchaovv.example.network;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UrlConnectionDemo {

    public static void main(String[] args) throws IOException {

        URLConnection connection = (new URL("http://corp.sogou.com/introduction.html")).openConnection();
        connection.connect();
        Map<String, List<String>> headers = connection.getHeaderFields();
        for (Map.Entry<String, List<String>> header : headers.entrySet()) {
            for (String value : header.getValue()) {
                System.out.printf("%s: %s\n", header.getKey(), value);
            }
        }

        System.out.printf("Content-Type: %s\n", connection.getHeaderField("Content-Type"));

        System.out.printf("test1: %s\n", connection.getHeaderField("test1"));
        System.out.printf("test1 is null: %s\n", connection.getHeaderField("test1") == null);

        System.out.printf("Content-Length: %s\n", connection.getContentLength());
        System.out.printf("Content-Encoding: %s\n", connection.getContentEncoding());

        String encoding = "UTF-8";
        if (connection.getContentEncoding() != null) {
            encoding = connection.getContentEncoding();
        }

        Scanner scanner = new Scanner(connection.getInputStream(), encoding);
        int lineNum = 0;
        while (scanner.hasNextLine()) {
            lineNum++;
            System.out.printf("%d: %s\n", lineNum, scanner.nextLine());
            if (lineNum == 10) {
                break;
            }
        }
        System.out.println("End of In");
    }
}
