package creational.abstractfactory.app;

import creational.abstractfactory.buttons.Button;
import creational.abstractfactory.checkboxes.CheckBox;
import creational.abstractfactory.factories.GUIFactory;


public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory guiFactory){
        button = guiFactory.createButton();
        checkBox = guiFactory.createCheckBox();
    }

    public void paint(){
        button.paint();
        checkBox.paint();
    }
}
