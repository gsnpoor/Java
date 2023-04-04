package StreamDemo;

public class pingpangSporter extends Sporter implements English{

    public pingpangSporter(String name, int age) {
        super(name, age);
    }

    public pingpangSporter() {
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员再说英语");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员再练习如何打乒乓球");
    }
}
