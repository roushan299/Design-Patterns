package creational.singleton.threadsafesingleton;



public class ThreadBar implements Runnable {
    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance("Bar");
        System.out.println(singleton.value);
    }
}
