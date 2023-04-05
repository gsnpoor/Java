public class Foobar {
    private int n;
    volatile boolean bool = false;

    public void FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; ) {
            if (!bool) {
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                bool = true;
                i++;
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; ) {

            if (bool) {
                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();
                bool = false;
                i++;
            }
        }
    }
}
