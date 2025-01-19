package creational.abstractfactory;

import creational.abstractfactory.app.Application;
import creational.abstractfactory.factories.GUIFactory;
import creational.abstractfactory.factories.MacOSFactory;
import creational.abstractfactory.factories.WindowsFactory;

public class Demo {
    public static Application congigureApplication() {
        Application app;
        GUIFactory guiFactory;
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")){
            guiFactory = new MacOSFactory();
        }else {
            guiFactory = new WindowsFactory();
        }
        app = new Application(guiFactory);
        return app;
    }

    public static void main(String[] args) {
        Application application = congigureApplication();
        application.paint();
    }
}
