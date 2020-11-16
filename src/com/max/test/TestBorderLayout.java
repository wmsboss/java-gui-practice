package com.max.test;

import javax.swing.*;
import java.awt.*;

/**
 * 边框布局
 * 边框布局将整个面板划分为东西南北中五个部分，允许为每个组件选择一个放置位置，
 * 可以选择将组件放在面板的上北（NORTH）、下南（SOUTH）、左西（WEST）、右东（EAST），中（CENTER）五个地方，
 * 边框布局可以扩展组件的大小以填充可用空间。
 */
public class TestBorderLayout extends JFrame{

    JPanel p=new JPanel();

    public TestBorderLayout() {
        setLayout(new BorderLayout(5,5));//定义边界布局
        setFont(new Font("Helvetica", Font.PLAIN, 14));//定义字体
        //在面板中加入按钮，且定义按钮的位置
        getContentPane().add(BorderLayout.NORTH, new JButton("North"));
        getContentPane().add("South", new JButton("South"));
        getContentPane().add("East",  new JButton("East"));
        getContentPane().add("West",  new JButton("West"));
        //设置面板为流式布局居中显示，组件横、纵间距为5个像素
        p.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
        //使用循环加入button，注意每次加入的button对象名称都是b
        //但button每次均是用new新生成的，全部代表不同的button对象。
        for(int i=1;i<10;i++){
            //String.valueOf(i)，将数字转换为字符串
            JButton b=new JButton(String.valueOf(i));
            p.add(b);           //将button加入到面板中
        }
        getContentPane().add("Center",p);  //将面板加入到中间位置


    }
    public static void main(String[] args) {
        TestBorderLayout f = new TestBorderLayout();
        //定义边框
        f.setTitle("边界布局");
        f.setSize(300, 300);  // 定义组件大小
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);             //让窗口居中显示
    }
}
