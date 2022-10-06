public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Жигуль", "ВАЗ 2010", 1.4);
        Car car2 = new Car("Волга", "ГАЗ 21", 2.4);
        Car car3 = new Car("Ауди", "А5", 3.2);
        Car car4 = new Car("УАЗ", "Буханка", 1.6);
        carInfo(car1);
        carInfo(car2);
        carInfo(car3);
        carInfo(car4);


        Bus bus1 = new Bus("Лиаз", "123", 1.8);
        Bus bus2 = new Bus("ПАЗ", "1283", 2.0);
        Bus bus3 = new Bus("Лиаз", "12993", 3.2);
        Bus bus4 = new Bus("ИКАРУС", "1243", 4.0);
        busInfo(bus1);
        busInfo(bus2);
        busInfo(bus3);
        busInfo(bus4);

        Truck truck1 = new Truck("Вольво", "ВМ255", 5.0);
        Truck truck2 = new Truck("МАН", null, 4.0);
        Truck truck3 = new Truck("Камаз", "узз366", 5.0);
        Truck truck4 = new Truck("Маз", "8788", 7.0);
        truckInfo(truck1);
        truckInfo(truck2);
        truckInfo(truck3);
        truckInfo(truck4);

        Driver<Car> andrei = new Driver<Car>("Andrei", "B", 10);
        Driver<Bus> valera = new Driver<>("Valera", "D", 7);
        Driver<Truck> igor = new Driver<>("Igor", "C", 2);

    }

    private static void carInfo(Car car) {
        System.out.println("Автомобиль " + car.getBrand() + " модель " + car.getModel() + " с двигателем " +
                car.getEngine() + ". " + car.pitStop() + " ," + car.bestTime() + " ," + car.maxSpeed());
    }

    private static void busInfo(Bus bus) {
        System.out.println("Автомобиль " + bus.getBrand() + " модель " + bus.getModel() + " с двигателем " +
                bus.getEngine() + ". " + bus.pitStop() + " ," + bus.bestTime() + " ," + bus.maxSpeed());
    }

    private static void truckInfo(Truck truck) {
        System.out.println("Автомобиль " + truck.getBrand() + " модель " + truck.getModel() + " с двигателем " +
                truck.getEngine() + ". " + truck.pitStop() + " ," + truck.bestTime() + " ," + truck.maxSpeed());
    }
}