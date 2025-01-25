package structure.flyweight.forest;

import structure.flyweight.trees.Tree;
import structure.flyweight.trees.TreeFactory;
import structure.flyweight.trees.TreeType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {

    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherData){
        TreeType type = TreeFactory.getTreetype(name, color, otherData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics g) {
        for(Tree tree: trees){
            tree.draw(g);
        }
    }
}
