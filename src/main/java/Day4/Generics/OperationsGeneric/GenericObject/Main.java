package Day4.Generics.OperationsGeneric.GenericObject;

public class Main {
    public static void main(String[] args) {
        String[] names = new String[] { "Nguyen", "Hong", "Son" };

        // truyền array names vào trong MyArrayGeneric để gắn mảng vào trong nó
        MyArrayGeneric<String> myArrayGeneric = new MyArrayGeneric<String>(names);
        // ta có thể dổi thành các kiểu khác như Double, Integer, ...

        System.out.println("First name: " + myArrayGeneric.getFirstElement());
        System.out.println("Last name: " + myArrayGeneric.getLastElement());
    }
}
