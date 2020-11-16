package com.max.test;

import javax.swing.*;
import java.awt.*;

public class TestWindowCenter {
    public static void main(String[] args) {
        test02();
    }

    public static void test01() {
        JFrame frame = new JFrame("Demo");
        frame.setSize(200, 200);
        //-------------  方法一 ----------------
        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
        frame.setLocation((screenWidth - 200)/2, (screenHeight-200)/2);
        //-------------  end  -----------------
        frame.setVisible(true);
    }

    public static void test02() {
        JFrame frame = new JFrame("Demo");
        frame.setSize(200, 200);
        //--------- 方法二  ----------------
        frame.setLocationRelativeTo(null);
        //----------  end  ----------------
        frame.setVisible(true);
    }
}
