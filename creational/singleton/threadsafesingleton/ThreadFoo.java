package creational.singleton.threadsafesingleton;

public class ThreadFoo implements Runnable {
    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance("Foo");
        System.out.println(singleton.value);
    }
}
