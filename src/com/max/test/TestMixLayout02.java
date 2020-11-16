package com.max.test;

import javax.swing.*;
import java.awt.*;

public class TestMixLayout02 extends JFrame {
    private static JButton[] jb = new JButton[9];//用数组定义按钮
    private static JPanel jp1, jp2;//定义面板

    public TestMixLayout02() {
        //定义面板1，且使其布局为流式布局
        jp1 = new JPanel();
        jp1.setLayout(new FlowLayout());

        //定义面板2，且使其布局为边界布局
        jp2 = new JPanel();
        jp2.setLayout(new BorderLayout());
        //实例化按钮
        jb[0] = new JButton("囚牛");
        jb[1] = new JButton("睚眦");
        jb[2] = new JButton("嘲风");
        jb[3] = new JButton("蒲牢");
        jb[4] = new JButton("狻猊");
        jb[5] = new JButton("赑屃");
        jb[6] = new JButton("狴犴");
        jb[7] = new JButton("椒图");
        jb[8] = new JButton("貔貅");
        //面板1加入五个按钮
        jp1.add(jb[0]);
        jp1.add(jb[1]);
        jp1.add(jb[2]);
        jp1.add(jb[3]);
        jp1.add(jb[4]);
        jp1.add(new JButton("貔貅"));jp1.add(new JButton("貔貅"));jp1.add(new JButton("貔貅"));
        //面板2加入后四个按钮
        jp2.add(jb[5], BorderLayout.CENTER);
        jp2.add(jb[6], BorderLayout.NORTH);
        jp2.add(jb[7], BorderLayout.WEST);
        jp2.add(jb[8], BorderLayout.EAST);
        //定义窗体为边界布局，并将面板1和面板2加入边界的上下部分。
        setLayout(new BorderLayout());
        add(jp1, BorderLayout.NORTH);
        add(jp2, BorderLayout.SOUTH);
        //定义容器
        setTitle("你好啊！");
        setSize(300, 200);
        setLocation(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TestMixLayout02();
    }
}
