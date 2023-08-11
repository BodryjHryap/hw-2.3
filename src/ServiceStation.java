public interface ServiceStation {
    default void print(Car car, Bicycle bicycle, Truck truck) {
        System.out.println("Ничего не ремонтируется");
    }
    void check(Car car, Bicycle bicycle, Truck truck);

}
