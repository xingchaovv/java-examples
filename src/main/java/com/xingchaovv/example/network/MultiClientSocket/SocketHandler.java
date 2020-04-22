package com.xingchaovv.example.network.MultiClientSocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class SocketHandler implements Runnable {
    private static AtomicInteger tagNum = new AtomicInteger();
    private Socket socket;
    private int num;

    public SocketHandler(Socket socket) {
        this.socket = socket;
        num = tagNum.incrementAndGet();
    }

    @Override
    public void run() {
        try {
            InputStream inStream = socket.getInputStream();
            OutputStream outStream = socket.getOutputStream();
            Scanner scanner = new Scanner(inStream);
            PrintWriter printWriter = new PrintWriter(outStream, true);

            printWriter.printf("Server > Hello! current session id: %d.\n", num);
            printWriter.println("Server > Tip: enter \"bye\" to exit.");

            // 阻塞，检查下一行
            while (scanner.hasNextLine()) {
                String clientMsg = scanner.nextLine();
                if (clientMsg.equals("bye")) {
                    printWriter.println("Server > Closed");
                    socket.close();
                    break;
                }
                printWriter.println("Server > " + new StringBuffer(clientMsg).reverse());
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
