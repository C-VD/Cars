import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Получаем данные о машинках
        TreeSet<Car> cars = new TreeSet<>();
        cars.add(new Car("ВАЗик", 1000, 80));
        cars.add(new Car("ГАЗик", 1000, 70));
        cars.add(new Car("ПАЗик", 1000, 85));
        cars.add(new Car("УАЗик", 1000, 75));
        cars.add(new Car("ВАЗ", 1500, 80));
        cars.add(new Car("ГАЗ", 1700, 70));
        cars.add(new Car("ПАЗ", 2000, 85));
        cars.add(new Car("УАЗ", 1600, 75));
        cars.add(new Car("БАЗ", 1600, 75));
        cars.add(new Car("Ока", 2100, 200));

        // СКОРОСТЬ
        // Сортируем
        //cars.sort((a, b) -> Integer.compare(a.speed, b.speed));
        // Выводим
        System.out.println(cars.toString());

        // ИМЯ
        // Сортируем
        //cars.sort((a, b) -> CharSequence.compare(a.name, b.name));
        // Выводим
        System.out.println(cars.toString());
    }
}