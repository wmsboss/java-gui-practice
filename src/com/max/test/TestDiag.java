package com.max.test;

import javax.swing.*;

public class TestDiag {
    public static void main(String[] args) {
        test01_3();
    }

    /**
     * 这是一个简单的消息框
     *
     *   JOptionPane有三种参数设置类型
         JOptionPane.showMessageDialog有三种参数设置
         JOptionPane.showMessageDialog(parentComponent, message);
         JOptionPane.showMessageDialog(parentComponent, message, title, messageType);
         JOptionPane.showMessageDialog(parentComponent, message, title, messageType, icon);
         参数说明
         parentComponent: 是对话框所在容器
         message：是提示消息
         title：是消息提示框的标题
         messageType:是消息类型
         icon：自定义图标
     */
    public static void test01_1() {
        JOptionPane.showMessageDialog(null,
                "这是一个简单的消息框");
    }

    /**
     * 显示一个错误对话框
     * 标题，内容，确定
     */
    public static void test01_2() {
        JOptionPane.showMessageDialog(null,
                "这是内容",
                "这是标题",
                JOptionPane.ERROR_MESSAGE);
    }

    public static void test01_3() {
        JOptionPane.showMessageDialog(null,
                "这是内容",
                "这是标题",
                JOptionPane.WARNING_MESSAGE);
    }

    /**
     * 显示一个信息面板
     * 标题，内容，Yes，No
     */
    public static void test02() {
        JOptionPane.showConfirmDialog(null,
                "这是内容",
                "这是标题",
                JOptionPane.YES_NO_OPTION);
    }

    /**
     * 显示一个警告对话框
     * 其options为OK, Cancel
     */
    public static void test03() {
        Object[] options = {"OK", "Cancel"};
        JOptionPane.showOptionDialog(null,
                "这是内容",
                "这是标题",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                options,
                options[0]);
    }

    /**
     * 显示一个要求用户键入String的对话框
     */
    public static void test04_1() {
        //String inputValue = JOptionPane.showInputDialog("请输入你的内容：");
        JOptionPane.showInputDialog("请输入你的内容：");
    }

    public static void test04_2() {
        JOptionPane.showInputDialog(null,
                "这是一个可供用户输入信息的对话框");
    }

    public static void test05() {
        Object[] possibleValues = {"First", "Second", "Third"};
        Object selectedValue = JOptionPane.showInputDialog(null,
                "这是内容",
                "这是标题",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                possibleValues,
                possibleValues[0]);
    }
}
