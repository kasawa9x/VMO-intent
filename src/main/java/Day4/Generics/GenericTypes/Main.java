package Day4.Generics.GenericTypes;

class Book extends Dictionary<String, String> {

    public Book(String key, String value) {
        super(key, value);
    }

}
class Book1<Key, Value> extends Dictionary<Key, Value> {

    public Book1(Key key, Value value) {
        super(key, value);
    }

}
class BookI<String> implements writer<String> {

    @Override
    public void update(String obj) {
        // do something
    }

    @Override
    public void delete(String obj) {
        // do something
    }

    @Override
    public void write(String obj) {
        // do something
    }

}

public class Main {
    public static void main(String[] args) {
        //Create Generic class with generic parameter type
        Dictionary<String, String> d = new Dictionary<String, String>("Study", "hoc");
        String english = d.getKey();
        String vietnamese = d.getValue();
        System.out.println(english + ": " + vietnamese); //Ouput: Study: hoc

        //Generics class inheritance
        //the type for the Generics parameter.
        Book book = new Book("Study", "hoc");
        String english1 = book.getKey();
        String vietnamese1 = book.getValue();
        System.out.println(english1 + ": " + vietnamese1); // Ouput: Study: hoc
        //generic parameters unchanged
        Book1<String, String> book2 = new Book1<String, String>("Study", "hoc");
        String english3 = book2.getKey();
        String vietnamese4 = book2.getValue();
        System.out.println(english3 + ": " + vietnamese4); // Ouput: Study: hoc
        //Generics Interface
        BookI<String> t = new BookI<String>();
        t.write("Add data to book");
    }
}
