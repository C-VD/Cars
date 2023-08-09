public class Car {
    String name;
    int gruz;
    int speed;

    public Car(String name, int gruz, int speed) {
        this.name = name;
        this.gruz = gruz;
        this.speed = speed;
    }


    public String toString(){
        return "Имя: " + name + "; скорость: "  + speed + "; грузоподЪемность: " + gruz;
    }
}
