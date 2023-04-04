package StreamDemo;

public class pingpangCoach extends Coach implements English{
    public pingpangCoach(String name, int age) {
        super(name, age);
    }

    public pingpangCoach() {
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练在教如何打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练在学习说英语");
    }
}
