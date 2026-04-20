//5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
//display the concerned color whenever the specific tab is selected in the Pan


package p5d;

import java.awt.Color;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorTabbedPaneExample {

    JFrame f;

    ColorTabbedPaneExample() {

        f = new JFrame("Color Tabbed Pane");

        // Create panels
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        // Set background colors
        p1.setBackground(Color.CYAN);
        p2.setBackground(Color.MAGENTA);
        p3.setBackground(Color.YELLOW);

        // Create tabbed pane
        JTabbedPane tp = new JTabbedPane();

        tp.add("Cyan", p1);
        tp.add("Magenta", p2);
        tp.add("Yellow", p3);

        // Add listener to detect tab change
        tp.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int index = tp.getSelectedIndex();
                String title = tp.getTitleAt(index);
                System.out.println("Selected Color: " + title);
            }
        });

        f.add(tp);

        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ColorTabbedPaneExample();
    }
}