package Day6.componentdemo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonDemo1 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("JButtonʾ��");
        // ���ڴ�С
        jf.setSize(200, 200);
        // ���ھ���
        jf.setLocationRelativeTo(null);
        // ���ùر���Ϊ
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // ������ť
        JButton jb = new JButton("���������̨���");
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                test();
            }

            private void test() {
                System.out.println("���ոյ���˰�ť��");
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        });

        // ��ӵ�����
        jf.add(jb);
        // ʹ���ڿɼ�
        jf.setVisible(true);
    }
}
