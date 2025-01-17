package creational.singleton.naivesingeltonsinglethread;

import creational.singleton.naivesingeltonmultithread.Singleton;

public class ThreadBar implements Runnable{
    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance("Foo");
        System.out.println(singleton.value);
    }
}
