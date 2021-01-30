package Day6.componentdemo;

import javax.swing.*;

public class JLabelDemo {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("JLabel演示");
        // 设置大小
        jFrame.setSize(400, 300);
        // 居中显示
        jFrame.setLocationRelativeTo(null);

        JLabel jLabel = new JLabel("这是标签");
        jFrame.add(jLabel);

        // 最后记得添加，窗口可见
        jFrame.setVisible(true);
    }
}
