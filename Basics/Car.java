public class Car {

    String name;
    String color;
    int price;

    Car(String name, String color, int price) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void start() {
        System.out.println(this.name + "is starting");
    }

    public void stop() {
        System.out.println(this.name + "is stopping");
    }

}
