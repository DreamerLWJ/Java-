package Day6.layoutdemo;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        // �������ڶ���
        JFrame jFrame = new JFrame("Java���ĸ�GUI����");
        jFrame.setSize(500, 300);
        // ����������
        JPanel jPanel = new JPanel();
        // Ϊ������ò��ֹ�������
        // ���췽�����ö��뷽ʽ�����������ļ�϶������Ϊ20
        jPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 40, 20));

        // Ϊ�����Ӱ�ť
        for (int i = 0; i < 20; i++) {
            jPanel.add(new Button("��ť" + i));
        }

        // �������ӵ�������
        jFrame.add(jPanel);
        // ���ô��ھ���
        jFrame.setLocationRelativeTo(null);
        // ���ùرչ���
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // ���ô��ڿɼ�
        jFrame.setVisible(true);
    }
}
