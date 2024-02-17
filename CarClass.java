public class CarClass {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Porsche");
        car.setModel("911");
        car.setColor("Red");
        car.setDoors(2);
       car.setConvertible(true);
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();
    }
}
