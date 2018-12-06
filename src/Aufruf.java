public class Aufruf {
    public static void main(String[] args) {
        Vehicle power = new Vehicle(666);
        Vehicle name = new Vehicle("BMW");


        System.out.print(Vehicle.printName("BMW")+" " +Vehicle.calculatePower(666)+""+ Vehicle.weight);
    }
}
