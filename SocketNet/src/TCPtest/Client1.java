package TCPtest;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10000);
        OutputStream os = socket.getOutputStream();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入数据");
            String str = sc.nextLine();
            os.write(str.getBytes());
            if (str.equals("886")) {
                break;
            }
        }
        os.close();
        socket.close();
    }
}
