package com.max.test;

import javax.swing.*;
import java.awt.*;

public class TestJFrame extends JFrame {
    public TestJFrame(String title) {
        JFrame jf = new JFrame(title);
        // 得到窗口的容器
        Container conn = jf.getContentPane();
        // 创建一个标签，并设置初始内容
        JLabel l1 = new JLabel("Hello, World!");
        conn.add(l1);
        // 设置窗口的属性，窗口位置和大小
        jf.setBounds(200, 200, 300, 300);
        // 设置窗口可见
        jf.setVisible(true);
        // 设置关闭方式，如果不设置，关闭窗口后不会退出程序
        jf.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        // 创建窗口
        new TestJFrame("测试窗口");
    }

}
