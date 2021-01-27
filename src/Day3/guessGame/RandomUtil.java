package Day3.guessGame;


import java.util.Random;

/**
 * 工具类：通常工具类不需要创建实例，因为工具类只需要被使用
 * 使用静态的方法使得工具类更加容易使用
 */
public class RandomUtil {
    /**
     * 随机数生成器（随机数生成对象）
     * final：即常量
     */
    private static final Random random = new Random();

    /**
     * 当前生成的目标随机数
     */
    private static int target;

    /**
     * target是否已经准备好
     */
    private static boolean isReady = false;


    private RandomUtil() {
        // 私有构造方法，使得无法创建实例
    }

    /**
     * 生成随机数，如果重复使用将会重置随机数
     */
    public static void generate() {
        // 使用 random 对象的成员方法来生成随机数
        target = random.nextInt(100) + 1;
        isReady = true;
    }

    /**
     * 比较两数大小，并返回差值
     * @param input 输入
     * @return 如果返回值大于0，则表示被猜数要大于输入，如果小于0，则表示小于，返回 0 表示猜中
     */
    public static int compare(int input) {
        if (!isReady) {
            throw new IllegalStateException("请在generate()方法执行前不要进行其他操作！");
        }
        return target - input;
    }
}
