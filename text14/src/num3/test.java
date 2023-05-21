package num3;

public class test {
    public static void main(String[] args) {
        int i = hd();
        System.out.println(i);
    }
    public static int hd(){
        int i = 1;
        try {
            i = 2;
            //int j = 1/0;
            return i;
        } finally {
            i = 3;
            //return i;
        }
    }
}
