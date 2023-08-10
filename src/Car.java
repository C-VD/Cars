import java.util.Objects;

public class Car implements Comparable {
    String name;
    int gruz;
    int speed;

    public Car(String name, int gruz, int speed) {
        this.name = name;
        this.gruz = gruz;
        this.speed = speed;
    }
    public int compareTo(Object o){
        if (o instanceof Car) {
            Car c = (Car) o;
            return Integer.compare(this.gruz, c.gruz);
        }
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return gruz == car.gruz && speed == car.speed && Objects.equals(name, car.name);
    }


    public String toString(){
        return "Имя: " + name + "; скорость: "  + speed + "; грузоподЪемность: " + gruz;
    }
}
