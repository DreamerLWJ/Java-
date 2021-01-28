package Day3.toStringDemo;

public class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void info() {
        System.out.println("大家好！我叫" + name);
    }

    @Override
    public String toString() {
        return "这是被重写的 toString() 方法";
    }
}

// 细节：为什么不写 public？
class Demo {
    public static void main(String[] args) {
        Person person = new Person("罗文俊");
        // 它会输出什么？为什么？
        System.out.println(person);
    }
}