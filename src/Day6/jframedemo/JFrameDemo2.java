package Day6.jframedemo;

import javax.swing.*;
import java.awt.*;

// �̳�ʹ���Ϊ JFrame ����
public class JFrameDemo2 extends JFrame {

    // �ڹ��췽������ɳ�ʼ����Ϊ
    public JFrameDemo2(){
        setTitle("First GUI");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel jLabel = new JLabel("���Ǳ�ǩ");
        Container container = getContentPane();
        container.add(jLabel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrameDemo2();
    }
}
