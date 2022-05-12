public class ABstractRunner {

    public static void main(String[] args) {

        HondaCity hc = new HondaCity();
        hc.start();
        hc.run();
        hc.stop();

        hc.process1();
        hc.process2();
    }

}
