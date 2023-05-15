package design_pattern.factory_151.abstract_factory;

public class WindowsButton implements Window {
    @Override
    public void render() {
        System.out.println("Rendering Button!");
    }
}
