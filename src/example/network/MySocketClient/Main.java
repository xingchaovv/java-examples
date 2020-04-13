package example.network.MySocketClient;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("time-a.nist.gov", 13);
        Scanner scanner = new Scanner(socket.getInputStream(), "UTF-8");
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
