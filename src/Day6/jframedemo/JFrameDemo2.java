package Day6.jframedemo;

import javax.swing.*;
import java.awt.*;

// 继承使其成为 JFrame 窗体
public class JFrameDemo2 extends JFrame {

    // 在构造方法内完成初始化行为
    public JFrameDemo2(){
        setTitle("First GUI");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel jLabel = new JLabel("这是标签");
        Container container = getContentPane();
        container.add(jLabel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrameDemo2();
    }
}
