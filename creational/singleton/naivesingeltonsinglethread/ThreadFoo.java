package creational.singleton.naivesingeltonsinglethread;

import creational.singleton.naivesingeltonmultithread.Singleton;

public class ThreadFoo implements Runnable{
    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance("Bar");
        System.out.println(singleton.value);
    }
}
