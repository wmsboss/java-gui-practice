package com.max.test;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestLoginWindow02 extends JFrame{
    private JPanel contentPanel = new JPanel();
    // Label标签存放背景图片
    private JLabel label;
    // 设置按钮组件
    private JButton login = new JButton("登录"), register = new JButton("注册");

    private JLabel jlb1 = new JLabel("用户名:"), jlb2 = new JLabel("密码:"), jlbtitle = new JLabel("登录界面");
    // 设置文本框组件
    private JTextField admin = new JTextField(), password = new JTextField();

    public TestLoginWindow02() {
        this.init();
        this.addListener();
    }

    private void init() {
        this.setTitle("管理员登陆界面");
        this.setSize(500, 350);
//        GUITools.center(this);
        ImageIcon image1 = new ImageIcon("837878.jpg"); // 界面背景图片
        JLabel backLabel = new JLabel();
        backLabel.setIcon(image1);
        label = new JLabel(image1);
        label.setBounds(0, 0, 1000, 400);
        // 在LayeredPane最底层上添加两个带图片的标签，并且label2在label上方
        this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
        // 将内容面板设置为透明，就能够看见添加在LayeredPane上的背景。
        ((JPanel) this.getContentPane()).setOpaque(false);

		/*
		 * 添加组件到contentPanel容器中 布局方式为自由布局。
		 */
        contentPanel.setLayout(null);
        add(admin);
        add(password);
        add(login);
        add(register);
        add(jlb1);
        add(jlb2);
        add(jlbtitle);

		/*
		 * 组件绝对位置
		 */
        jlb1.setBounds(50, 130, 90, 25);
        jlb1.setForeground(Color.WHITE);
        admin.setBounds(95, 130, 300, 25);
        password.setBounds(95, 154, 300, 25);
        jlb2.setBounds(50, 154, 90, 25);
        jlb2.setForeground(Color.WHITE);
        register.setBounds(95, 225, 90, 20);
        login.setBounds(315, 225, 90, 20);
        jlbtitle.setBounds(180, 45, 200, 50);
        Font f = new Font("微软雅黑", Font.BOLD, 30);
        jlbtitle.setFont(f);
        jlbtitle.setForeground(Color.BLUE);

		/*
		 * 组件透明化
		 */
        admin.setOpaque(true);
        password.setOpaque(true);
        contentPanel.setOpaque(false);
        getContentPane().add(contentPanel);

		/*
		 * 组件边框颜色
		 */
        textSet(admin);
        textSet(password);
    }

    /*
     * JTextField文本框设置方法.
     */
    private void textSet(JTextField field) {
        field.setBackground(new Color(255, 255, 255));
        field.setPreferredSize(new Dimension(150, 28));
        MatteBorder border = new MatteBorder(0, 0, 2, 0, new Color(192, 192, 192));
        field.setBorder(border);
    }

    /*
     * 事件监听
     */
    private void addListener() {
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                forLogin(admin.getText(), password.getText());
            }

        });
        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                forRegister();
            }

        });
    }

    // 登录方法
    public void forLogin(String admin, String pwd) {
    }

    // 注册方法
    public void forRegister() {
    }


    public static void main(String[] args) {
        new TestLoginWindow02().setVisible(true);
    }
}
