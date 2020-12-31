package java_base_net;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @example TCP 半关闭 Demo
 */
public class HalfCloseDemo {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("sogou.com", 80);
        Scanner scanner = new Scanner(socket.getInputStream());
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        printWriter.print("GET /test1 HTTP/1.1\r\n");
        printWriter.print("Host: sogou.com\r\n");
        printWriter.print("\r\n");
        printWriter.flush();
        socket.shutdownOutput();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        socket.close();
    }
}
