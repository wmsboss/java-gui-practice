package com.max.test;

import javax.swing.*;
import java.awt.*;

public class TestMixLayout01 {

    public static void main(String[] args) {
        //定义窗体
        JFrame frame =new JFrame();
        frame.setSize(300,150);
        JPanel panelup=new JPanel();
        JPanel panelbottom=new JPanel();

        //定义布局，将两个面板放在边框布局的两侧
        frame.setLayout(new BorderLayout());
        frame.add(panelup,BorderLayout.CENTER);
        frame.add(panelbottom,BorderLayout.SOUTH);
       /*直接用GridLayout会以所有控件中最宽的空间宽为宽
        *  最高的控件高为高，输入框会被撑开
        */
        //给上面的面板定义布局网格布局
        panelup.setLayout(new GridLayout(2,2));
        JLabel lusername =new JLabel("用户名:");
        JLabel lpasssword=new JLabel("密码:");
		/*小面板1 2 别分用来存放 用户名的输入框以及密码的输入框
		小面板1 2 内部的布局使用FlowLayout布局*/
        JPanel panelsmall1 =new JPanel();
        JPanel panelsmall2 =new JPanel();
        //加入登录信息
        panelup.add(lusername);
        panelup.add(panelsmall1);
        panelup.add(lpasssword);
        panelup.add(panelsmall2);
        //定义文本框和密码框
        JTextField txtusername=new JTextField(10);
        JPasswordField pswfd_password=new JPasswordField(10);
        panelsmall1.setLayout(new FlowLayout());
        panelsmall1.add(txtusername, BorderLayout.CENTER);

        panelsmall2.setLayout(new FlowLayout());
        panelsmall2.add(pswfd_password, BorderLayout.CENTER);
        //按钮面板定义为流式布局
        panelbottom.setLayout(new FlowLayout());
        //定义按钮
        JButton btnlogin=new JButton("登录");
        JButton btnregister=new JButton("注册");
        JButton btncancle=new JButton("退出");
        //Does cancle mean "clear the textfile" or "close the frame"?
        panelbottom.add(btnlogin);
        panelbottom.add(btnregister);
        panelbottom.add(btncancle);
        frame.setVisible(true);
    }
}
