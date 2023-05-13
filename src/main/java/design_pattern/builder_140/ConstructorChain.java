package design_pattern.builder_140;

public class ConstructorChain {
    private String name;
    private int age;
    private String batch;

    public ConstructorChain(){

    }
    public ConstructorChain(String name) {
        System.out.println("Inside single constructor");
        this.name = name;
    }

    public ConstructorChain(String name, int age){
        this(name);
        System.out.println("Inside double constructor");
        this.age = age;
    }

    public ConstructorChain(String name, int age, String batch){
        this(name, age);
        System.out.println("Inside triple constructor");
        this.batch = batch;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batch='" + batch + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ConstructorChain t1 = new ConstructorChain("Akash", 24, "Mar 24");
        System.out.println(t1);
    }
}
