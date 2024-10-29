public class Main {
    public static void main(String[] args) {
        // Car car = new Car();

        // car.acc();
        // car.start();
        // car.stop();

        // this is causing problem as only one start mehtod can be overridden in a single class so when we are accessing start of MEDIA we are getting the one which is overridden there now it is of engine type

        // Media carMedia = new Car();
        // carMedia.start();

        // solution is make different class implementing each interface and make different class like NiceCar as here to get rid of above problem
        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
