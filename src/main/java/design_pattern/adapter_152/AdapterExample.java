package design_pattern.adapter_152;

// Legacy Rectangle class with incompatible interface
class LegacyRectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public LegacyRectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void display() {
        System.out.println("LegacyRectangle: x=" + x + ", y=" + y + ", width=" + width + ", height=" + height);
    }
}

// Modern ShapeRenderer class with compatible interface
interface ShapeRenderer {
    void draw();
    void resize(int width, int height);
}

// Adapter class to make LegacyRectangle compatible with ShapeRenderer
class RectangleAdapter implements ShapeRenderer {
    private LegacyRectangle legacyRectangle;

    public RectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }

    public void draw() {
        legacyRectangle.display();
    }

    public void resize(int width, int height) {
        legacyRectangle.setWidth(width);
        legacyRectangle.setHeight(height);
        System.out.println("RectangleAdapter: Resized LegacyRectangle.");
    }
}

// Client code using the ShapeRenderer
public class AdapterExample {
    public static void main(String[] args) {
        LegacyRectangle legacyRect = new LegacyRectangle(10, 20, 100, 200);
        ShapeRenderer renderer = new RectangleAdapter(legacyRect);

        // Using the ShapeRenderer to draw and resize the LegacyRectangle
        renderer.draw();
        renderer.resize(150, 250);
    }
}

