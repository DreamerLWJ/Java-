package Day6.jpaneldemo;


import javax.swing.*;
import java.awt.*;

public class JPanelDemo {
    public static void main(String[] args) {
        // ����һ��JFrame����
        JFrame jf = new JFrame("JPanel ʾ��");
        // ���ô��ڴ�С��λ��
        jf.setBounds(300, 100, 400, 200);
        // ����һ�� JPanel ����
        JPanel jp = new JPanel();
        // ���ñ���ɫ
        jp.setBackground(Color.blue);
        // ����һ����ǩ
        JLabel jl = new JLabel("���Ƿ���JPanel�ϵı�ǩ");
        // ����ǩ��ӵ����
        jp.add(jl);
        // �������ӵ�����
        jf.add(jp);
        // ���ô��ڿɼ�
        jf.setVisible(true);
    }
}
