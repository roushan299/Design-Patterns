package creational.prototype.cache;

import creational.prototype.shapes.Circle;
import creational.prototype.shapes.Rectangle;
import creational.prototype.shapes.Shape;

import java.util.HashMap;
import java.util.Map;

public class BundledShapeCache {

    private Map<String, Shape> cache = new HashMap<>();

    public BundledShapeCache(){

        Circle circle = new Circle();
        circle.x = 5;
        circle.y = 7;
        circle.radius = 45;
        circle.color = "Green";

        Rectangle rectangle = new Rectangle();
        rectangle.x = 6;
        rectangle.y = 9;
        rectangle.width = 8;
        rectangle.height = 10;
        rectangle.color = "Blue";

        this.put("Big green circle", circle);
        this.put("Medium blue rectangle", rectangle);
    }

    public Shape put(String key, Shape shape){
        this.cache.put(key, shape);
        return shape;
    }

    public Shape get(String key){
        Shape shape1 = this.cache.get(key);
        if(shape1 == null){
            return null;
        }
        return shape1.clone();
    }


}
