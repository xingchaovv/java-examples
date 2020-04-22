package com.xingchaovv.example.network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressDemo {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("1.2.3.4");
        System.out.println(address);

        InetAddress address2 = InetAddress.getByName("www.sogou.com");
        System.out.println(address2);
        System.out.println(Arrays.toString(address2.getAddress()));
    }
}
