package CharStream;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

//将文件内容排序

public class CharStreamDemo5 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("text18\\aaa.txt");
        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch = fr.read()) != -1) {
            sb.append((char) ch);
        }
        fr.close();

        String str = sb.toString();
        String[] arrStr = str.split("-");
        ArrayList<Integer> list = new ArrayList<>();

        for (String s : arrStr) {
            int i = Integer.parseInt(s);
            list.add(i);
        }

        Collections.sort(list);

        FileWriter fw = new FileWriter("text18\\bbb.txt");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                fw.write(list.get(i) + "");
            } else {
                fw.write(list.get(i) + "-");
            }
        }
        fw.close();

    }

}
