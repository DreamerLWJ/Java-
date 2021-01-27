package Day3.finalDemo;

public class FinalDemo2 {
    public String name;

    public static void main(String[] args) {
        final FinalDemo2 finalDemo2 = new FinalDemo2();
        // 以下都是合法的
        finalDemo2.name = "lwj";
        finalDemo2.name = "jiang";
        // 以下代码将产生问题
//        finalDemo2 = new FinalDemo2();
    }
}
