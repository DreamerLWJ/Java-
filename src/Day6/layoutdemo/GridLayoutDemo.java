package Day6.layoutdemo;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("GridLayou布局计算器");
        JPanel panel = new JPanel();    //创建面板
        // 指定面板的布局为GridLayout，4行4列，间隙为5
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("/"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("*"));
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("-"));
        panel.add(new JButton("0"));
        panel.add(new JButton("."));
        panel.add(new JButton("="));
        panel.add(new JButton("+"));
        jf.add(panel);    //添加面板到容器
        jf.setSize(500, 500);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}