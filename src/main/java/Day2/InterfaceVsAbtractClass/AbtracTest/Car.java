package Day2.InterfaceVsAbtractClass.AbtracTest;

public class Car extends Vehicle {
    private int vhcId;

    public Car(String manufacturer, String fuel, int id) {
        super(manufacturer, fuel);
        this.vhcId = id;
    }


    @Override
    public void run() {
        if (vhcId == 0){
            System.out.println("khong chay");
        }
        else {
            System.out.println("dang chay ");
        }


    }

    public void setVhcId(int vhcId) {
        this.vhcId = vhcId;
    }


    public static void main(String[] args) {
       Vehicle mazda = new Car("Mazda","gastroline",0);
        Vehicle honda = new Car("Honda","oil",1);
        mazda.run();
        honda.run();
        honda.changeFuel("gastroline");
        System.out.println(honda.toString());
    }

}
