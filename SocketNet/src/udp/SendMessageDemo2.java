package udp;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class SendMessageDemo2 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入");
            String str = sc.nextLine();

            byte[] bytes = str.getBytes();

            InetAddress address = InetAddress.getByName("127.0.0.1");

            int port = 10086;

            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

            ds.send(dp);
            if (str.equals("886")) {
                break;
            }
        }

        ds.close();
    }
}
