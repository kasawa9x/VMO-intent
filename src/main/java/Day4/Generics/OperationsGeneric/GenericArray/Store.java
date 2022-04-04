package Day4.Generics.OperationsGeneric.GenericArray;

import java.util.ArrayList;

// Arraylist sẽ chứa các phần tử E
// ta sẽ trả về phần tử đầu tiền trong arr khi được gọi
public class Store {
    public static <E> E getFirstElement(ArrayList<E> arr) {
        if (arr.isEmpty())
            return null;
        E first = arr.get(0);
        return first;
    }
}
