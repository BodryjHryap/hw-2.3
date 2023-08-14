public class Main {
    public static void main(String[] args) {
        Car car = new Car("Автомобиль 1", 4);
        Car car2 = new Car("Автомобиль 2", 4);

        Truck truck = new Truck("Грузовик 1", 6);
        Truck truck2 = new Truck("Грузовик 2", 8);

        Bicycle bicycle = new Bicycle("Велосипед 1", 2);
        Bicycle bicycle2 = new Bicycle("Велосипед 2", 2);

        ServiceStationForVehicle station = new ServiceStationForVehicle();
        station.check(car);
        station.check(car2);
        station.check(truck);
        station.check(truck2);
        station.check(bicycle);
        station.check(bicycle2);
    }
}