package Day4.enumdemo;

public enum Season {
    // 下面是四个枚举实例
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
            case SPRING -> System.out.println("是春天呢!");
            case SUMMER -> System.out.println("是夏天呢!");
            case AUTUMN -> System.out.println("是秋天呢!");
            case WINTER -> System.out.println("是冬天呢!");
        }
    }
}
