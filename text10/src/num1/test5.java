package num1;

public class test5 {
    public static void main(String[] args){
        String phoneNumber = "12345678910";

        String str = phoneNumber.substring(7);
        System.out.println(str);

        String str2 = phoneNumber.replace("456", "*****");
        System.out.println(str2);
    }
}
