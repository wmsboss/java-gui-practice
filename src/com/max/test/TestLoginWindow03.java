package com.max.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestLoginWindow03 {
    public static void main(String[] args) {
        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200,200);

        JPanel pNorth = new JPanel();
        pNorth.setLayout(new FlowLayout());
        JPanel pCenter = new JPanel();


        JLabel l1 = new JLabel("账号");
        JTextField tf1= new JTextField();
        tf1.setPreferredSize(new Dimension(80,30));

        JLabel l2 = new JLabel("密码");
        JPasswordField tf2 = new JPasswordField();
        tf2.setPreferredSize(new Dimension(80,30));

        pNorth.add(l1);
        pNorth.add(tf1);
        pNorth.add(l2);
        pNorth.add(tf2);

        JButton b = new JButton("登录");

        pCenter.add(b);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String name = tf1.getText();
                String password = new String(tf2.getPassword());
                if(0==name.length()){
                    JOptionPane.showMessageDialog(f, "账号不能为空");
                    tf1.grabFocus();
                    return;
                }

                if(0==password.length()){
                    JOptionPane.showMessageDialog(f, "密码不能为空");
                    tf2.grabFocus();
                    return;
                }

                if(check(name, password))
                    JOptionPane.showMessageDialog(f, "登陆成功");
                else
                    JOptionPane.showMessageDialog(f, "密码错误");

            }
        });


        f.setLayout(new BorderLayout());
        f.add(pNorth,BorderLayout.NORTH);
        f.add(pCenter,BorderLayout.CENTER);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);

    }
    //数据库查询
    public static boolean check(String name, String password){
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        boolean result = false;
//
//        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
//                "root", "admin");
//             Statement s = c.createStatement();
//
//        ){
//            String sql =
//                    "select * from user where name = '" + name +"' and password = '" + password+"'";
//            ResultSet rs = s.executeQuery(sql);
//
//            if(rs.next())
//                result = true;
//        }catch(SQLException e){
//            e.printStackTrace();
//        }

        return true;
    }

}
