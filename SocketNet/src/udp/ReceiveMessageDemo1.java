package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ReceiveMessageDemo1 {
    public static void main(String[] args) throws IOException {
        //1.创建对象
        //接收端口需要和发送端口一致
        DatagramSocket ds = new DatagramSocket(10086);


        //2.接收数据包
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        //该方法是阻塞的
        ds.receive(dp);
        
        //3.解析数据包
        byte[] data = dp.getData();
        int len = data.length;
        InetAddress address = dp.getAddress();
        int port = dp.getPort();
        System.out.println("接收到数据" + new String(data,0,len));
        System.out.println("数据从" + address + "这台电脑中的" + port + "端口发出");

        //4.释放资源
        ds.close();

    }
}
