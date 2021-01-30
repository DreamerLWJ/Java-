package Day6.layoutdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("CardLayout演示");
        // 创建两个面板对象
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        // 将一个面板设置为 CardLayout
        CardLayout cl = new CardLayout();
        JPanel cards = new JPanel();
        cards.setLayout(cl);

        // 分别往两个面板添加组件
        JButton button = new JButton("登录按钮");
        p1.add(button);
        p1.add(new JButton("注册按钮"));
        p1.add(new JButton("找回密码按钮"));

        p2.add(new JTextField("用户名文本框", 20));
        p2.add(new JTextField("密码文本框", 20));
        p2.add(new JTextField("验证码文本框", 20));

        // 往设置为 CardLayout 的面板添加两个面板
        cards.add(p1, "card1");
        cards.add(p2, "card2");
        // 调用show()方法显示面板1
        cl.show(cards, "card1");

        // 为按钮添加监听器
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 更改为显示面板2
                cl.show(cards, "card2");
            }
        });

        jf.add(cards);
        jf.setBounds(300, 200, 400, 200);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
