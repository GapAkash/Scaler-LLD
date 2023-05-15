package design_pattern.factory_151.abstract_factory;

public class WindowsDialog implements Window {
    @Override
    public void render() {
        System.out.println("Rendering Window Dialog!");
    }
}
