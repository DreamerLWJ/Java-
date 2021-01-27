package Day3.guessGame;


import java.util.Scanner;

public class GuessGame {
    /**
     * 保存猜对的次数
     */
    private int wins = 0;

    /**
     * 总共游玩的次数
     */
    private int playTimes = 0;

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choose;
        System.out.println("欢迎来到猜数游戏，");

        while (true) {
            System.out.println("请选择菜单：\n" +
                    "1. 开始游玩\n" +
                    "2. 个人历史信息\n" +
                    "3. 退出"
            );

            // 接受输入
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    if (play()) {
                        // 如果胜利的话就记录一次胜利
                        wins++;
                    }
                    playTimes++;
                    break;
                case 2:
                    getInfo();
                    break;
                case 3:
                    quit();
                    break;
            }
        }
    }

    /**
     * 对外暴露的开始游戏方法
     * @return 表示是否胜利完成
     */
    private boolean play() {
        Scanner scanner = new Scanner(System.in);
        int i;
        // 调用来使随机数就绪
        RandomUtil.generate();

        System.out.print("请输入猜数（-1退出）：");
        i = scanner.nextInt();
        if (i == -1) {
            return false;
        }

        if (guess(i)) {
            System.out.println("猜中啦！");
        }

        while (true) {
            System.out.print("请继续输入（-1退出）：");
            i = scanner.nextInt();
            if (i == -1) {
                return false;
            }

            if (guess(i)) {
                System.out.println("猜中啦！");
                return true;
            }
        }
    }

    /**
     * 猜数的逐层方法
     * @param input 猜数
     * @return 表示是否猜中
     */
    private boolean guess(int input) {
        int temp = RandomUtil.compare(input);

        if (temp == 0) {
            // 成功的条件
            return true;
        }

        if (temp > 0) {
            System.out.println("猜小了！");
        } else {
            System.out.println("猜大了！");
        }
        return false;
    }

    /**
     * 输出个人的历史胜利次数
     */
    public void getInfo() {
        System.out.println("您总共游玩的次数是：" + playTimes);
        System.out.println("您胜利的次数是：" + wins);
        System.out.println("您的胜率为：" + (double)wins/playTimes);
    }

    public void quit() {
        // 正常退出
        System.exit(0);
    }
}
