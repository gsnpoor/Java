package TCPtest2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket ss = new ServerSocket(10000);

        while (true) {
            Socket socket = ss.accept();

            new Thread(new MyRunnable(socket)).start();
        }
    }
}
