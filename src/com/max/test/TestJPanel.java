package com.max.test;

import javax.swing.*;
import java.awt.*;

public class TestJPanel extends JFrame {
    //定义组件
    JPanel jp1,jp2;//定义两个面板
    JButton jb1,jb2,jb3,jb4,jb5,jb6;//定义按钮

    //构造函数
    public TestJPanel()
    {
        //创建组件
        //面板组件JPanel布局模式默认的是流式布局FlowLayout
        //实例化面板
        jp1=new JPanel();

        //实例化按钮
        jb1=new JButton("西瓜");
        jb2=new JButton("苹果");
        //设置布局，JPanel默认布局FlowLayout,
        //把组件添加JPanel
        jp1.add(jb1);
        jp1.add(jb2);


        jp2=new JPanel();
        jb3=new JButton("荔枝");
        jb4=new JButton("葡萄");
        jb5=new JButton("橘子");
        jp2.add(jb3);
        jp2.add(jb4);
        jp2.add(jb5);

        //把JPanel加入到JFrame，采用流式布局，将按钮放在不同的位置
        jb6=new JButton("香蕉");
        this.add(jp1, BorderLayout.NORTH);
        this.add(jb6, BorderLayout.CENTER);
        this.add(jp2, BorderLayout.SOUTH);

        //设置窗口属性
        this.setSize(300,200);
        this.setLocation(700,500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new TestJPanel();
    }
}
