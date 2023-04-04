package num1;

import java.util.Random;

public class test1 {
    private String name;
    private int blood;
    private char gender;
    private String face;
    String[] boyfaces = {"1", "2", "3", "4"};
    String[] girlfaces = {"5", "6", "7", "8"};
    public test1() {
    }
    public test1(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public test1(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBlood() {
        return blood;
    }
    public void setBlood(int blood) {
        this.blood = blood;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getFace() {
        return face;
    }
    public void setFace(char gender) {
        Random r = new Random();

        if (gender == '男'){
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        } else if (gender == '女') {
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        }else {
            this.face = "面目狰狞";
        }
        this.face = face;
    }

    public void attack(test1 r2){
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        int remainBoold = r2.getBlood() - hurt;
        remainBoold = remainBoold < 0? 0 : remainBoold;
        r2.setBlood(remainBoold);
        System.out.println(this.getName() + "举起拳头打了" + r2.getName() + "一下" +
                "造成了" + hurt + "点伤害，" +r2.getName() + remainBoold + "点血");
    }

    public void showInfo(){
        System.out.println("姓名为：" + getName());
        System.out.println("血量为：" + getBlood());
        System.out.println("性别为：" + getGender());
        System.out.println("面色为：" + getFace());
    }

}
