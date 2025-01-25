package structure.flyweight.trees;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreetype(String name, Color color, String otherData){
        TreeType result = treeTypes.get(name);
        if(result == null){
            result = new TreeType(name, color, otherData);
            treeTypes.put(name, result);
        }
        return result;
    }
}
