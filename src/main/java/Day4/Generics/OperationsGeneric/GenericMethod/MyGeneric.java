package Day4.Generics.OperationsGeneric.GenericMethod;

public class MyGeneric<String> {
    private String obj; // khởi tạo đối tượng lưu tham số generic
    public MyGeneric(Class<Funtion> classObject) throws InstantiationException, IllegalAccessException {
        // lấy tên Class và gán nó vào đối tượng obj
        this.obj = (String) classObject.newInstance();

    }
    public String getObj() {
        return obj; // trả về obj
    }
}
