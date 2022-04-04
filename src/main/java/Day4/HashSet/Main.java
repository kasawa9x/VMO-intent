package Day4.HashSet;

//HashSet là tập hợp dữ liệu không có thứ tự & không được sắp xếp,
// trong khi LinkedHashSet là tập hợp có thứ tự và sắp xếp của HashSet.
//HashSet không cung cấp bất kỳ phương pháp nào để duy trì thứ tự chèn. So sánh, LinkedHashSet duy trì thứ tự chèn của các phần tử.
//không thể dự đoán thứ tự chèn trong HashSet, nhưng có thể dự đoán nó trong LinkedHashSet.
//LinkedHashSet mở rộng HashSet, vì vậy nó sử dụng bảng băm để lưu trữ các phần tử.
// Hơn nữa, nó sử dụng một danh sách được liên kết kép để duy trì thứ tự chèn.
//Cả HashSet và LinkedHashSet đều triển khai giao diện Đặt.
//HashSet nhanh hơn một chút so với LinkedHashSet. Nhưng cả hai đều cung cấp hiệu suất gần như tương tự,
//Cả hai đều cung cấp o (1) sự phức tạp cho việc chèn, loại bỏ, lấy đối tượng.
//Cả HashSet và LinkedHashSet chỉ cho phép một đối tượng rỗng.
//LinkedHashSet yêu cầu nhiều bộ nhớ hơn HashSet.

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> LHS = new HashSet<String>();

        // using add() to initialize values

        LHS.add("Java");
        LHS.add("Python");
        LHS.add("C/C++");
        LHS.add("PHP");

        // print LinkedHashSet
        for (String LHSs :
                LHS) {
            System.out.println(LHSs);

        }
    }


}
