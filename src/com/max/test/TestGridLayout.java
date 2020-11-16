package com.max.test;

import javax.swing.*;
import java.awt.*;

/**
 * GridLayout 类是一个布局处理器，它以矩形网格形式对容器的组件进行布置。
 * 容器被分成大小相等的矩形，一个矩形中放置一个组件。
 */
public class TestGridLayout extends JFrame {
    public TestGridLayout() {
        this.setTitle("Test title");
        Container con = this.getContentPane();
        this.setLayout(new GridLayout(7, 3, 5, 6));
        for (int i = 0; i < 20; i++) {
            con.add(new JButton("Button" + i));
        }

        this.setVisible(true);
        this.setBounds(50, 50, 500, 500);
    }

    public static void main(String[] args) {
        new TestGridLayout();
    }
}
