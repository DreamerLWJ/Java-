package Day6.jpaneldemo;


import javax.swing.*;
import java.awt.*;

public class JPanelDemo {
    public static void main(String[] args) {
        // 创建一个JFrame对象
        JFrame jf = new JFrame("JPanel 示例");
        // 设置窗口大小和位置
        jf.setBounds(300, 100, 400, 200);
        // 创建一个 JPanel 对象
        JPanel jp = new JPanel();
        // 设置背景色
        jp.setBackground(Color.blue);
        // 创建一个标签
        JLabel jl = new JLabel("这是放在JPanel上的标签");
        // 将标签添加到面板
        jp.add(jl);
        // 将面板添加到窗口
        jf.add(jp);
        // 设置窗口可见
        jf.setVisible(true);
    }
}
