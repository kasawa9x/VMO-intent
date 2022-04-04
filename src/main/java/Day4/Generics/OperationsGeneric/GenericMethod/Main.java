package Day4.Generics.OperationsGeneric.GenericMethod;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        // khởi tạo đối tượng Funtion trên myObj
        MyGeneric<Funtion> myObj = new MyGeneric<Funtion>(Funtion.class);
        // bây giờ myObj đã có đối tượng Codelearn
        // t chỉ cần gọi đối tượng đó ra bằng method getObj()
        myObj.getObj().sayHi();

    }
}
