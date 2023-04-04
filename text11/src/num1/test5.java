package num1;

import java.util.ArrayList;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Phone str = new Phone(sc.next(), sc.nextInt());
            list.add(str);
        }

    }
    public static ArrayList<Phone> index(ArrayList<Phone> list, int price){
        ArrayList<Phone> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone ss = list.get(i);
            if (ss.getPrice() < price){
                resultList.add(ss);;
            }
        }
        return resultList;
    }
}
