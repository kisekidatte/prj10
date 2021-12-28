public class Cat extends Animal {
    @Override
    public void run(double distance) {
        if ((distance<=200)&(distance>0)) {
            System.out.println("true");

        }
        else {
            System.out.println("false");
        }
    }

    @Override
    public void swim(double distancesw) {
            System.out.println("false");
        }

    @Override
    public void jump(double height) {
        if ((height<=2)&(height>0)) {
            System.out.println("true");

        }
        else {
            System.out.println("false");
        }
    }
}