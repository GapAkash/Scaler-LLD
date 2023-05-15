package design_pattern.factory_151.abstract_factory;

public class AbstractFactoryExample {

    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory();

        Window window = factory.createWindow();
        window.render();

        Checkbox checkbox = factory.createCheckbox();
        checkbox.render();
    }
}
