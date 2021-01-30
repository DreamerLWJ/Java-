package Day6.componentdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonDemo2 {
    public static void main(String[] args) {

        JFrame jf = new JFrame("JButton使用示例");
        jf.setSize(400, 500);
        jf.setLocationRelativeTo(null);
        // 设置关闭行为
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel jl = new JLabel("0");

        JButton jb = new JButton("按钮");
        // 添加点击事件监听器
        jb.addActionListener(new ActionListener() {
            // 定义匿名内部类成员变量
            int i = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                i++;
                jl.setText(Integer.toString(i));
            }
        });
        jf.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 30));
        jf.add(jl);
        jf.add(jb);
        jf.setVisible(true);
    }
}
