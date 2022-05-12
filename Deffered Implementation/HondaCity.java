public class HondaCity extends Car implements CE {

    public void run() {
        System.out.println("Run of Honda City");
    }

    public void stop() {
        System.out.println("Stop of HC");
    }

    public void start() {
        System.out.println("Start of HC");
    }

    public void process1() {
        System.out.println("HC-CE-P1");
    }

    public void process2() {
        System.out.println("HC-CE-P2");
    }

}
