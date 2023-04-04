package IOTest;

import cn.hutool.core.io.FileUtil;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//制造假数据1
public class IOTestDemo1 {
    public static void main(String[] args) throws IOException {
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?from=kg1&highlight=&pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&srcid=51369";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        String str1 = webCrawler(familyNameNet);
        String str2 = webCrawler(boyNameNet);
        String str3 = webCrawler(girlNameNet);

        ArrayList<String> familyNameTempList = getData(str1, "(.{4})(，|。)", 1);
        ArrayList<String> boyNameTempList = getData(str2, "([\\u4E00-\\u9FA5]{2})(、|。)", 1);
        ArrayList<String> girlNameTempList = getData(str3, "(.. ){4}(..)", 0);

        ArrayList<String> familyNameList = new ArrayList<>();
        ArrayList<String> boyNameList = new ArrayList<>();
        ArrayList<String> girlNameList = new ArrayList<>();
        for (String str : familyNameTempList) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                familyNameList.add(c + "");
            }
        }

        for (String str : boyNameTempList) {
            if (!boyNameList.contains(str)) {
                boyNameList.add(str);
            }
        }

        for (String str : girlNameTempList) {
            String[] s = str.split(" ");
            for (int i = 0; i < s.length; i++) {
                if (!girlNameList.contains(s[i])) {
                    girlNameList.add(s[i]);
                }
            }
        }

        ArrayList<String> list = getInfos(familyNameList, boyNameList, girlNameList, 70, 70);
        Collections.shuffle(list);

        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\development\\program\\program1\\Stream\\aaa\\names.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }

    private static ArrayList<String> getInfos(ArrayList<String> familyNameList, ArrayList<String> boyNameList, ArrayList<String> girlNameList, int boyCount, int girlCount) {
        HashSet<String> boyhsb = new HashSet<>();
        while (true) {
            if (boyhsb.size() == boyCount) {
                break;
            }

            //打乱集合中的数据
            Collections.shuffle(familyNameList);
            Collections.shuffle(boyNameList);
            boyhsb.add(familyNameList.get(0) + boyNameList.get(0));
        }

        HashSet<String> girlhsb = new HashSet<>();
        while (true) {
            if (girlhsb.size() == girlCount) {
                break;
            }

            //打乱集合中的数据
            Collections.shuffle(familyNameList);
            Collections.shuffle(girlNameList);
            girlhsb.add(familyNameList.get(0) + girlNameList.get(0));
        }

        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (String boyName : boyhsb) {
            int age = r.nextInt(10) + 18;
            list.add(boyName + "-男-" + age);
        }

        for (String girlName : girlhsb) {
            int age = r.nextInt(10) + 18;
            list.add(girlName + "-女-" + age);
        }
        return list;
    }

    private static ArrayList<String> getData(String str, String regex, int index) {
        ArrayList<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            /*matcher.group(0)相当于matcher.group()，即获取全部"(.{4})(，|。)"
             * matcher.group(1)相当于只获取第一个小括号内的内容"(.{4})"    */
            list.add(matcher.group(index));
        }
        return list;
    }

    //从网络中爬取数据
    public static String webCrawler(String net) throws IOException {
        StringBuilder sb = new StringBuilder();
        //创建URL对象
        URL url = new URL(net);
        //连接上这个网络，并且保证网络畅通
        URLConnection conn = url.openConnection();
        //读取数据
        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char) ch);
        }

        isr.close();
        return sb.toString();

    }
}
