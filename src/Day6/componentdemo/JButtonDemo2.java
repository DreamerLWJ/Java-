package Day6.componentdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonDemo2 {
    public static void main(String[] args) {

        JFrame jf = new JFrame("JButtonʹ��ʾ��");
        jf.setSize(400, 500);
        jf.setLocationRelativeTo(null);
        // ���ùر���Ϊ
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel jl = new JLabel("0");

        JButton jb = new JButton("��ť");
        // ��ӵ���¼�������
        jb.addActionListener(new ActionListener() {
            // ���������ڲ����Ա����
            int i = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                i++;
                jl.setText(Integer.toString(i));
            }
        });
        jf.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 30));
        jf.add(jl);
        jf.add(jb);
        jf.setVisible(true);
    }
}
