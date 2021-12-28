public class Dog extends Animal {
    @Override
    public void run(double distance) {
        if ((distance<=500)&(distance>0)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    @Override
    public void swim(double distancesw) {
        if ((distancesw<=10)&(distancesw>0)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    @Override
    public void jump(double height) {
        if ((height<=0.5)&(height>0)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}