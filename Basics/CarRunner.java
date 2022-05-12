public class CarRunner {

    public static void main(String[] args) {

        Car c = new Car("Honda City", "Black", 1000000);

        // c.setName("Honda City");
        // c.setColor("Black");
        // c.setPrice(1000000);

        c.start();
        c.stop();

    }

}
