package Day6.jframedemo;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class JFrameDemo {
    public static void main(String[] args) {
        // 创建一个 JFrame 窗体
        JFrame f = new JFrame("First GUI");
        // 设置标题
//        f.setTitle("First GUI");
        // 设置大小
        f.setSize(400, 200);
//        f.setLocation(200, 200);
        // 可以通过如下方法设置窗体的大小和位置
//        f.setBounds(200, 200, 400, 200);
        // 设置默认的关闭行为
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // 创建标签对象
        JLabel jLabel = new JLabel("这是标签");

        // 设置窗口居中
        f.setLocationRelativeTo(null);
        // 获取窗口的容器
        Container container = f.getContentPane();
        // 向容器添加组件
        container.add(jLabel);

        // 设置窗体可见
        f.setVisible(true);
    }
}
