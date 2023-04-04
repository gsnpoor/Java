package num1;

public class phone {
    private String name;
    private int age;
    private String gender;
    public phone(String name, int age){
        this.name = name;
        this.age = age;
    }

    public phone() {
    }

    public phone(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 40){
            this.age = age;
        }
        else{
            System.out.println("错误");
        }
    }
    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
