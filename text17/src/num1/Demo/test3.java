package num1.Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test3 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.soba8.com/shenfenzheng/");
        URLConnection conn = url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;

        String regex = "[1-9]\\d{17}";
        Pattern pattern = Pattern.compile(regex);

        while((line = br.readLine()) != null){
            //System.out.println(line);
            Matcher matcher = pattern.matcher(line);
            while(matcher.find()){
                System.out.println(matcher.group());
            }
        }
        br.close();
    }
}
