package Day6.jframedemo;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class JFrameDemo {
    public static void main(String[] args) {
        // ����һ�� JFrame ����
        JFrame f = new JFrame("First GUI");
        // ���ñ���
//        f.setTitle("First GUI");
        // ���ô�С
        f.setSize(400, 200);
//        f.setLocation(200, 200);
        // ����ͨ�����·������ô���Ĵ�С��λ��
//        f.setBounds(200, 200, 400, 200);
        // ����Ĭ�ϵĹر���Ϊ
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // ������ǩ����
        JLabel jLabel = new JLabel("���Ǳ�ǩ");

        // ���ô��ھ���
        f.setLocationRelativeTo(null);
        // ��ȡ���ڵ�����
        Container container = f.getContentPane();
        // ������������
        container.add(jLabel);

        // ���ô���ɼ�
        f.setVisible(true);
    }
}
