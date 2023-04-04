package com.test;

public class sample {
    public static boolean pu(String s) {
        while(true){
            int l=s.length();
            s=s.replace("()","");
            s=s.replace("{}","");
            s=s.replace("[]","");
            if(s.length()==l){
                return l==0;
            }
        }
    }
}
