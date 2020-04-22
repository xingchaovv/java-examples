package com.xingchaovv.java.example.network;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class UrlDemo {

    public static void main(String[] args) throws MalformedURLException, URISyntaxException {
        String urlStr = "https://user1:mypassword@www.sogou.com:444/web?query=%E6%B5%8B%E8%AF%95&color=red#main";
        URL url = new URL(urlStr);
        System.out.printf("url: %s\n", url);

        System.out.printf("protocol: %s\n", url.getProtocol());

        System.out.printf("authority: %s\n", url.getAuthority());
        System.out.printf("userInfo: %s\n", url.getUserInfo());
        System.out.printf("host: %s\n", url.getHost());

        System.out.printf("port: %s\n", url.getPort());
        System.out.printf("defaultPort: %s\n", url.getDefaultPort());

        System.out.printf("path: %s\n", url.getPath());
        System.out.printf("query: %s\n", url.getQuery());
        System.out.printf("anchor: %s\n", url.getRef()); // same as anchor 锚点

        URI uri1 = new URI("http://sogou.com/web/pages/page1.html");
        System.out.printf("uri1: %s\n", uri1);
        System.out.printf("uri1 to URL : %s\n", uri1.toURL());

        URL url1 = new URL("http://sogou.com/web/pages/page1.html");
        System.out.printf("url1 to URI : %s\n", url1.toURI());

        URI uri3 = new URI("http://sogou.com/web/pages/page1.html");
        URI uri4 = new URI("../../lists/list1.html");
        URI uri5 = uri3.resolve(uri4);
        URI uri6 = new URI("http://sogou.com/web/pages");
        System.out.printf("uri5: %s\n", uri5);
        System.out.printf("uri3 relative to uri6: %s\n", uri6.relativize(uri3));
    }
}
