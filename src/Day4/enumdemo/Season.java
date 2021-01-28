package Day4.enumdemo;

public enum Season {
    // �������ĸ�ö��ʵ��
    SPRING, SUMMER, AUTUMN, WINTER
}

enum State {
    BIGGER, SMALLER, EQUAL
}

class Demo {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        Season summer = Season.SUMMER;
        Season autumn = Season.AUTUMN;
        Season winter = Season.WINTER;
        judge(spring);
    }

    static void judge(Season season) {
        switch (season) {
            case SPRING -> System.out.println("�Ǵ�����!");
            case SUMMER -> System.out.println("��������!");
            case AUTUMN -> System.out.println("��������!");
            case WINTER -> System.out.println("�Ƕ�����!");
        }
    }
}
