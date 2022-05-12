public class OCRunner {
    public static void main(String[] args) {
        ObjectCounter o1, o2, o3;

        o1 = new ObjectCounter();
        o1.increment();

        o2 = new ObjectCounter();
        o2.increment();

        o3 = new ObjectCounter();
        o3.increment();
    }
}
