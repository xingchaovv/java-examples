package example.network.MultiClientSocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Manage {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8189); // 服务端，指定端口
        while (true) {
            Socket socket = server.accept(); // 阻塞，等待连接
            Thread thread = new Thread(new SocketHandler(socket));
            thread.start();
        }
    }
}
