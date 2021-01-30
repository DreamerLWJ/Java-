package Day6.layoutdemo;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        // 创建窗口对象
        JFrame jFrame = new JFrame("Java第四个GUI程序");
        jFrame.setSize(500, 300);
        // 窗口面板对象
        JPanel jPanel = new JPanel();
        // 为面板设置布局管理器，
        // 构造方法设置对齐方式，横向和纵向的间隙都设置为20
        jPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 40, 20));

        // 为面板添加按钮
        for (int i = 0; i < 20; i++) {
            jPanel.add(new Button("按钮" + i));
        }

        // 将面板添加到窗口中
        jFrame.add(jPanel);
        // 设置窗口居中
        jFrame.setLocationRelativeTo(null);
        // 设置关闭规则
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 设置窗口可见
        jFrame.setVisible(true);
    }
}
