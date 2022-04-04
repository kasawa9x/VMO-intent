package Day4.Generics.OperationsGeneric.GenericArray;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Google.com");
        list.add("Azure");
        list.add("GCF");
        System.out.println(Store.getFirstElement(list));

    }
}
