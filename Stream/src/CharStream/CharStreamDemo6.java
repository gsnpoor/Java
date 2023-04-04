package CharStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//将文件内容排序2

public class CharStreamDemo6 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("text18\\aaa.txt");
        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch = fr.read()) != -1) {
            sb.append((char) ch);
        }
        fr.close();

        Integer[] arr = Arrays.stream(sb.toString()
                        .split("-"))
                        .map(Integer::parseInt)
                        .sorted()
                        .toArray(Integer[]::new);

        FileWriter fw = new FileWriter("text18\\bbb.txt");
        String s = Arrays.toString(arr).replace(", ", "-");
        String result = s.substring(1, s.length() - 1);
        fw.write(result);
        fw.close();

    }

}
