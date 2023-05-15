package design_pattern.factory_151.abstract_factory;

public class WindowsForm implements Checkbox {

    @Override
    public void render() {
        System.out.println("Rendering a Windows form.");
    }
}
