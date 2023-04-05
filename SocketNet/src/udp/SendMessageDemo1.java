package udp;

import java.io.IOException;
import java.net.*;

public class SendMessageDemo1 {
    public static void main(String[] args) throws IOException {
        //1.创建对象
        DatagramSocket ds = new DatagramSocket();

        //2.打包数据
        String str = "aa你好!!";
        byte[] bytes = str.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 10086;

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length,address,port);

        //发送数据
        ds.send(dp);

        //释放资源
        ds.close();
    }
}
