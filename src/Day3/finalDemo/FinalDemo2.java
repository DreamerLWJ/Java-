package Day3.finalDemo;

public class FinalDemo2 {
    public String name;

    public static void main(String[] args) {
        final FinalDemo2 finalDemo2 = new FinalDemo2();
        // ���¶��ǺϷ���
        finalDemo2.name = "lwj";
        finalDemo2.name = "jiang";
        // ���´��뽫��������
//        finalDemo2 = new FinalDemo2();
    }
}
