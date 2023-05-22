package StreamDemo;

import java.util.Arrays;

public class ReferencesTest
{
    public static void main(String [] args) {
        String projectA = "1122";
        String subProject1 = "11";
        String subProject2 = "22";
        String projectB = "11" + "22";
        String projectC = String.valueOf(1122);
        String projectD = subProject1 + subProject2;
        System.out.println(projectA == projectB);//true
        System.out.println(projectB == projectC);//false
        System.out.println(projectC == projectD);//false
        System.out.println(projectC.equals(projectA));//true
        System.out.println();


        System.out.println("----------------------");
        System.out.println("projectA="+ projectA);
        System.out.println("projectB="+ projectB);
        System.out.println("projectC="+ projectC);
        System.out.println("projectD="+ projectD);
    }
}
