public class EmployeeRunner {
    public static void main(String[] args) {

        Employee e = new Employee();

        e.setName("Tom ");
        e.setAge(30);
        e.setSalary(10000);

        // e.age=-9;

        System.out.println(e.getName());
        System.out.println(e.getAge());
        System.out.println(e.getSalary());

    }
}
