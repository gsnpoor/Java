package IOTest;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.util.*;

//制造假数据2
public class IOTestDemo2 {
    public static void main(String[] args) {
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?from=kg1&highlight=&pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&srcid=51369";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        String familyNameStr = HttpUtil.get(familyNameNet);
        String boyNameStr = HttpUtil.get(boyNameNet);
        String girlNameStr = HttpUtil.get(girlNameNet);

        /*ArrayList<String> familyNameTempList = getData(str1, "(.{4})(，|。)", 1);
        ArrayList<String> boyNameTempList = getData(str2, "([\\u4E00-\\u9FA5]{2})(、|。)", 1);
        ArrayList<String> girlNameTempList = getData(str3, "(.. ){4}(..)", 0);*/

        List<String> familyNameTempList = ReUtil.findAll("(.{4})(，|。)", familyNameStr, 1);
        List<String> boyNameTempList = ReUtil.findAll("([\\u4E00-\\u9FA5]{2})(、|。)", boyNameStr, 1);
        List<String> girlNameTempList = ReUtil.findAll("(.. ){4}(..)", girlNameStr, 0);

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
            for (String value : s) {
                if (!girlNameList.contains(value)) {
                    girlNameList.add(value);
                }
            }
        }

        ArrayList<String> list = getInfos(familyNameList, boyNameList, girlNameList, 70, 70);
        Collections.shuffle(list);

        FileUtil.writeLines(list,"D:\\development\\program\\program1\\Stream\\aaa\\names1.txt","UTF-8");

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
}
