package Day4.Generics.GenericTypes;

//tạo 1 interface sau đó để 1 class implements lên là chúng ta đã có thể sử dụng.
public interface writer<T> {
    void update(T obj);
    void delete(T obj);
    void write(T obj);

}
