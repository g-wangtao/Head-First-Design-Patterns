package indi.karl.designpatterns.observer.swing;

import javax.swing.*;
import java.awt.*;

public class SwingObserverExample {

    JFrame frame;

    public static void main(String[] args) {
        new SwingObserverExample().go();
    }

    public void go () {
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");

        button.addActionListener((event) -> System.out.println("Don't do it, you might regret it!"));

        button.addActionListener((event) -> System.out.println("Come on, do it!"));
        frame.getContentPane().add(BorderLayout.CENTER, button);
        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

}
