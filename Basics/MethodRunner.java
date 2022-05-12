public class MethodRunner {
    public static void main(String[] args) {

        Methods m = new Methods();

        m.display();

        m.add(3, 4);

        int gstRate=m.getGST();
        System.out.println("GST Rate is "+gstRate);

        int sq=m.square(10);
        System.out.println("Square of 10 is "+sq);


    }
}
