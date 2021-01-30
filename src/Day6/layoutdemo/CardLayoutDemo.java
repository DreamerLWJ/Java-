package Day6.layoutdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("CardLayout��ʾ");
        // ��������������
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        // ��һ���������Ϊ CardLayout
        CardLayout cl = new CardLayout();
        JPanel cards = new JPanel();
        cards.setLayout(cl);

        // �ֱ����������������
        JButton button = new JButton("��¼��ť");
        p1.add(button);
        p1.add(new JButton("ע�ᰴť"));
        p1.add(new JButton("�һ����밴ť"));

        p2.add(new JTextField("�û����ı���", 20));
        p2.add(new JTextField("�����ı���", 20));
        p2.add(new JTextField("��֤���ı���", 20));

        // ������Ϊ CardLayout ���������������
        cards.add(p1, "card1");
        cards.add(p2, "card2");
        // ����show()������ʾ���1
        cl.show(cards, "card1");

        // Ϊ��ť��Ӽ�����
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ����Ϊ��ʾ���2
                cl.show(cards, "card2");
            }
        });

        jf.add(cards);
        jf.setBounds(300, 200, 400, 200);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
