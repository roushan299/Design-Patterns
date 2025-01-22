package structure.composite.editor;

import structure.composite.shapes.CompoundShape;
import structure.composite.shapes.Shape;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class ImageEditor {

    private EditorCanvas canvas;
    private CompoundShape allShapes = new CompoundShape();

    public ImageEditor(){
        canvas = new EditorCanvas();
    }

    public void loadShapes(Shape... shapes){
        allShapes.clear();
        allShapes.add(shapes);
        canvas.refresh();
    }

    private class EditorCanvas extends Canvas {
        JFrame frame;
        private static final int PADDING = 100;

        EditorCanvas(){
            createFrame();
            refresh();
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    allShapes.unselect();
                    allShapes.selectChildAt(e.getX(), e.getY());
                    e.getComponent().repaint();
                }
            });
        }

        private void createFrame() {
            frame = new JFrame();
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            JPanel contentPanel = new JPanel();
            Border border = BorderFactory.createEmptyBorder(PADDING, PADDING, PADDING, PADDING);
            contentPanel.setBorder(border);
            frame.setContentPane(contentPanel);

            frame.add(this);
            frame.setVisible(true);
            frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        }

        @Override
        public int getWidth() {
           return allShapes.getX() +allShapes.getWidth() +PADDING;
        }

        @Override
        public int getHeight() {
            return allShapes.getY() +allShapes.getHeight() + PADDING;
        }

        public void refresh() {
            this.setSize(getWidth(), getHeight());
            frame.pack();
        }

        @Override
        public void paint(Graphics graphics) {
            allShapes.paint(graphics);
        }
    }

}
