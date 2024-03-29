package java_base_net;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @example Socket 客户端例子
 */
public class MySocketClient {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();
        socket.connect(new InetSocketAddress("time-a.nist.gov", 13), 1000);
        socket.setSoTimeout(1000);
        Scanner scanner = new Scanner(socket.getInputStream(), "UTF-8");
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
