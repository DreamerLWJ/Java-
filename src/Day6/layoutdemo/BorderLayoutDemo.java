package Day6.layoutdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("�߽粼����ʾ");
        jf.setSize(400,200);
        // ΪFrame�������ò���ΪBorderLayout
        jf.setLayout(new BorderLayout());

        JButton button1=new JButton ("��");
        JButton button2=new JButton("��");
        JButton button3=new JButton("��");
        JButton button4=new JButton("��");
        JButton button5=new JButton("��");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("������");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("������");
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("������");
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("������");
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("������");
            }
        });

        jf.add(button1,BorderLayout.NORTH);
        jf.add(button2,BorderLayout.WEST);
        jf.add(button3,BorderLayout.CENTER);
        jf.add(button4,BorderLayout.EAST);
        jf.add(button5, BorderLayout.SOUTH);

        // ���ô��ھ��еķ���
        jf.setLocationRelativeTo(null);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
