package WaitAndNotify1;

public class Foodie extends Thread{
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0){
                    break;
                }else {
                    if (Desk.foodFlags == 0){
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else {
                        System.out.println("吃货在吃面条" + --Desk.count + "碗");
                        Desk.lock.notifyAll();
                        Desk.foodFlags = 0;
                    }
                }
            }
        }
    }
}
