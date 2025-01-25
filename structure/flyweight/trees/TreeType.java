package structure.flyweight.trees;

import java.awt.*;

public class TreeType {
    private String name;
    private Color color;
    private String otherData;

    public TreeType(String name, Color color, String otherData) {
        this.name = name;
        this.color = color;
        this.otherData = otherData;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x-1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x-5, y-10, 10, 10);
    }
}
