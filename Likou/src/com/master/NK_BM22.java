package com.master;

import java.util.Arrays;

class SolutionBM22 {
    public int compare(String version1, String version2) {
        version1 = Replace(version1);
        version2 = Replace(version2);
        if (version1.equals(version2)) {
            return 0;
        }
        String[] splitVersion1 = version1.split("\\.");
        String[] splitVersion2 = version2.split("\\.");
        int len1 = splitVersion1.length;
        int len2 = splitVersion2.length;
        int i = 0;
        while (i < len1 && i < len2) {
            int result = 0;
            int l1 = splitVersion1[i].length();
            int l2 = splitVersion2[i].length();
            if (l1 == l2) {
                result = splitVersion1[i].compareTo(splitVersion2[i]);
            } else {
                return l1 > l2 ? 1 : -1;
            }
            if (result != 0) {
                return result > 0 ? 1 : -1;
            }
            i++;
        }
        while (i < len1) {
            if (!splitVersion1[i].equals("")) {
                int result = splitVersion1[i].compareTo("0");
                if (result != 0) {
                    return result > 0 ? 1 : -1;
                }
            }
            i++;
        }
        while (i < len2) {
            if (!splitVersion2[i].equals("")) {
                int result = splitVersion2[i].compareTo("0");
                if (result != 0) {
                    return result > 0 ? -1 : 1;
                }
            }
            i++;
        }
        return 0;
    }

    public String Replace(String version) {
        String replace;
        while (true) {
            replace = version.replace(".0", ".");
            if (replace.equals(version)) {
                replace = replace.replaceAll("\\.+$","");
                return replace;
            }
            version = replace;
        }
    }
}

public class NK_BM22 {
    public static void main(String[] args) {
        System.out.println(new SolutionBM22().compare("24.78.1.80.1", "94.26.39.167.186.105.132"));
    }
}
