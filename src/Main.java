public class Main {
    public static void main(String[] args) {
        Car car = new Car("Автомобиль 1", 4);
        Car car2 = new Car("Автомобиль 2", 4);

        Truck truck = new Truck("Грузовик 1", 6);
        Truck truck2 = new Truck("Грузовик 2", 8);

        Bicycle bicycle = new Bicycle("Велосипед 1", 2);
        Bicycle bicycle2 = new Bicycle("Велосипед 2", 2);

        ServiceStation station = new ServiceStationForVehicle();
        station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);
    }
}