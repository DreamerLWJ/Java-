package Day6.componentdemo;

import javax.swing.*;

public class JLabelDemo {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("JLabel��ʾ");
        // ���ô�С
        jFrame.setSize(400, 300);
        // ������ʾ
        jFrame.setLocationRelativeTo(null);

        JLabel jLabel = new JLabel("���Ǳ�ǩ");
        jFrame.add(jLabel);

        // ���ǵ���ӣ����ڿɼ�
        jFrame.setVisible(true);
    }
}
