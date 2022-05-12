public class Employee {
    private String name;
    private int age;
    private float salary;

    // public void setVariable(SomeType value){
    // this.variable=value
    // }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 100) {

            this.age = age;
        } else {
            this.age = 25;
        }
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

}
