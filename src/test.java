public class test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog doge = new Dog();
        doge.run(350);
        cat.run(100);
        doge.swim(5);
        cat.swim(5);
        doge.jump(1);
        cat.jump(2);
    }
}