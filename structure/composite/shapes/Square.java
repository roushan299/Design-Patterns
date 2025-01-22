package structure.composite.shapes;

import java.awt.*;

public class Square extends BaseShape{

    public int width;
    public int height;

    public Square(int x, int y,int width, int height, Color color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawRect(x, y, getWidth()-1, getHeight());
    }
}
