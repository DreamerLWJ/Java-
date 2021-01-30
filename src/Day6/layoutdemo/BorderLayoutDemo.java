package Day6.layoutdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("边界布局演示");
        jf.setSize(400,200);
        // 为Frame窗口设置布局为BorderLayout
        jf.setLayout(new BorderLayout());

        JButton button1=new JButton ("上");
        JButton button2=new JButton("左");
        JButton button3=new JButton("中");
        JButton button4=new JButton("右");
        JButton button5=new JButton("下");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("这是上");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("这是左");
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("这是中");
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("这是右");
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("这是下");
            }
        });

        jf.add(button1,BorderLayout.NORTH);
        jf.add(button2,BorderLayout.WEST);
        jf.add(button3,BorderLayout.CENTER);
        jf.add(button4,BorderLayout.EAST);
        jf.add(button5, BorderLayout.SOUTH);

        // 设置窗口居中的方法
        jf.setLocationRelativeTo(null);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
