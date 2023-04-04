import com.test.sample;

import java.util.Scanner;
import java.lang.String;
import static java.lang.System.in;
public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(in);
        char[] st = {'a','b','c','d'};
        while(true){
            String bb = str.next();
            System.out.println(sample.pu(bb));
        }
    }
}

