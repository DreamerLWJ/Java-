package Day6.componentdemo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonDemo1 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("JButton示例");
        // 窗口大小
        jf.setSize(200, 200);
        // 窗口居中
        jf.setLocationRelativeTo(null);
        // 设置关闭行为
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 创建按钮
        JButton jb = new JButton("点我向控制台输出");
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                test();
            }

            private void test() {
                System.out.println("您刚刚点击了按钮！");
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        });

        // 添加到窗口
        jf.add(jb);
        // 使窗口可见
        jf.setVisible(true);
    }
}
