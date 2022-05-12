public class I3Runner {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.m1();
        p.m2();
        System.out.println("--------------------------------------");
        Child c = new Child();
        c.m1();
        c.m2();
        c.m3();
        c.m4();
    }
}
