import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Получаем данные о машинках
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("ВАЗик", 1000, 80));
        cars.add(new Car("ГАЗик", 1000, 70));
        cars.add(new Car("ПАЗик", 1000, 85));
        cars.add(new Car("УАЗик", 1000, 750));

        // СКОРОСТЬ
        // Сортируем
        cars.sort((a, b) -> Integer.compare(a.speed, b.speed));
        // Выводим
        System.out.println(cars.toString());

        // ИМЯ
        // Сортируем
        cars.sort((a, b) -> CharSequence.compare(a.name, b.name));
        // Выводим
        System.out.println(cars.toString());
    }
}