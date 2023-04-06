package DynamicProxy1;

public class test {
    public static void main(String[] args) {
        BigStar bigStar = new BigStar("jige");
        Star proxy = ProxyUtil.creatProxy(bigStar);

        String result = proxy.sing("zhiyin");
        System.out.println(result);

        proxy.dance();
    }
}
