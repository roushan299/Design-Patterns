package structure.composite.shapes;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundShape extends BaseShape{

    public List<Shape> children = new ArrayList<>();

    public CompoundShape(Shape... components) {
        super(0, 0, Color.BLACK);
        this.add(components);
    }

    public void add(Shape component){
        children.add(component);
    }

    public void add(Shape... components){
        children.addAll(Arrays.asList(components));
    }

    public void remove(Shape child){
        children.remove(child);
    }

    public void remove(Shape... componets){
        children.removeAll(Arrays.asList(componets));
    }

    public void clear(){
        children.clear();
    }

    @Override
    public int getX() {
        if(children.isEmpty()) {
            return 0;
        }

        int x = children.get(0).getX();
        for (Shape child: children){
            x = Math.max(x, child.getY());
        }
        return x;
    }

    @Override
    public int getY() {
        if(children.isEmpty()) {
            return 0;
        }

        int y = children.get(0).getY();
        for (Shape child: children){
            y= Math.min(y, child.getY());
        }
        return y;
    }

    @Override
    public int getWidth() {
        int maxWidth = -1;
        int x = getX();
        for(Shape child: children){
            int childRelativeX = child.getX() - x;
            int childWidth = childRelativeX + child.getWidth();
            maxWidth = Math.max(childWidth, maxWidth);
        }
        return maxWidth;
    }

    @Override
    public int getHeight() {
        int maxHeight = -1;
        int y = getY();
        for(Shape child: children){
            int childRelativeY = child.getY() - y;
            int childHeight = childRelativeY + child.getHeight();
            maxHeight = Math.max(childHeight, maxHeight);
        }
        return maxHeight;
    }

    @Override
    public void move(int x, int y) {
        for (Shape child: children){
            child.move(x, y);
        }
    }

    @Override
    public boolean isInsideBounds(int x, int y) {
        for (Shape child: children){
            if (child.isInsideBounds(x, y)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void unselect() {
        super.unselect();
        for (Shape child: children){
            child.unselect();
        }
    }

    public boolean selectChildAt(int x, int y){
        for (Shape child: children){
            if (child.isInsideBounds(x, y)){
                child.select();
                return true;
            }
        }
        return false;
    }

    @Override
    public void paint(Graphics graphics) {
        if(isSelected()){
            enableSelectedStyle(graphics);
            graphics.drawRect(getX()-1, getY()-1, getWidth()+1, getHeight()+1 );
            disableSelectionStyle(graphics);
        }

        for (Shape child: children){
            child.paint(graphics);
        }
    }

}
