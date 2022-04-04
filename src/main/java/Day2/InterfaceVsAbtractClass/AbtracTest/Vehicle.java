package Day2.InterfaceVsAbtractClass.AbtracTest;

public abstract class Vehicle {
    private String manufacturer;
    private String fuel;

    public Vehicle(String manufacturer, String fuel) {
        this.manufacturer = manufacturer;
        this.fuel = fuel;
    }
    public abstract void run();

    @Override
    public String toString() {
        return "vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", fuel='" + fuel + '\'' +
                '}';
    }
    public void changeFuel(String newFuel){
        this.fuel = newFuel;
    }
}
