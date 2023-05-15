package design_pattern.factory_151.abstract_factory;

public class WindowsFactory implements GUIFactory {
    @Override
    public Window createWindow() {
        return new WindowsDialog();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
