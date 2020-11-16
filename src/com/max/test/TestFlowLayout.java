package com.max.test;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * 使用FlowLayout布局方式的容器中组件按照加入的先后顺序按照设置的对齐方式（居中、左对齐、右对齐）从左向右排列，
 * 一行排满（即组件超过容器宽度后）到下一行开始继续排列。
 * TestFlowLayout(int align, int hgap, int vgap)
 *  align=0:表示每一行组件将按照左对齐排列
    align=1:表示每一行组件将按照居中对齐排列
    align=2:表示每一行组件将按照右对齐排列
 */
public class TestFlowLayout extends JFrame {

    private JPanel contentPane;//定义容器

    public TestFlowLayout() {
        this.contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        for (int i = 0; i < 10; i++) {
            contentPane.add(new JButton("按钮" + i));
        }

        setTitle("流式布局");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 150);
        setVisible(true);

    }

    public static void main(String[] args) {
        new TestFlowLayout();
    }
}
