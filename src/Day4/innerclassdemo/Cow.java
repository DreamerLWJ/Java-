package Day4.innerclassdemo;

public class Cow {
    private double weight;

    public Cow(double weight) {
        this.weight = weight;
    }

    public void test() {
        CowLeg cowLeg = new CowLeg(2);
        // �ⲿ����Ҫ�����ڲ����Ա����Ҫ�����ڲ������
        cowLeg.info();

        // ������뽫��������⣬��Ϊ�ⲿ�಻��ֱ�ӷ��ʷǾ�̬�ڲ����Ա
        // �������Ϊ���ڲ�������Զ��ⲿ����˵�ǲ���Ԥ֪��
        // �ⲿ���ڴ����Ǿ�̬�ڲ������֮ǰ��֪�����ڲ���������Խ��������
//        System.out.println(length);
    }

    private class CowLeg {
        private double length;

        public CowLeg(double length) {
            this.length = length;
        }

        public void info() {
            System.out.println("����һ����Ϊ" + length + "��ţ�ȡ�");
            System.out.println("�����ڵ�ţ������Ϊ��" + weight);
        }
    }
}

class Demo {
    public static void main(String[] args) {
        Cow cow = new Cow(250.0);
        cow.test();
    }
}
