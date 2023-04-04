package num1;

public class gameTest {
    public static void main(String[] args){
        test1 r1 = new test1("乔峰", 100, '男');
        test1 r2 = new test1("鸠摩智", 100, '女');

        r1.showInfo();
        r2.showInfo();
        while (true){
            r1.attack(r2);
            if (r2.getBlood() == 0){
                System.out.println(r1.getName() + "KO" + r2.getName());
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() == 0){
                System.out.println(r2.getName() + "KO" + r1.getName());
                break;
            }
        }
    }
}
