package example.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MySocketServer {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8189); // 服务端，指定端口
        Socket socket = server.accept(); // 阻塞，等待连接
        InputStream inStream = socket.getInputStream();
        OutputStream outStream = socket.getOutputStream();
        Scanner scanner = new Scanner(inStream);
        PrintWriter printWriter = new PrintWriter(outStream, true);

        printWriter.println("Hello! Enter bye to exit.");

        // 阻塞，检查下一行
        while (scanner.hasNextLine()) {
            String clientMsg = scanner.nextLine();
            if (clientMsg.equals("bye")) {
                socket.close();
                break;
            }
            printWriter.println("Server: I received: " + clientMsg);
        }
    }
}
