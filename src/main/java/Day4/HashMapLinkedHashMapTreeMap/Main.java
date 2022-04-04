package Day4.HashMapLinkedHashMapTreeMap;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

//HashMap chứa các giá trị dựa trên khóa.
//Nó chỉ chứa các phần tử duy nhất.
//Nó có thể có một khóa null và nhiều giá trị null.
//Nó duy trì không có trật tự .

//Một LinkedHashMap chứa các giá trị dựa trên khóa.
//Nó chỉ chứa các phần tử duy nhất.
//Nó có thể có một khóa null và nhiều giá trị null.
//Nó giống như HashMap thay vì duy trì thứ tự chèn .

//Hashtable là một mảng danh sách. Mỗi danh sách được gọi là một nhóm. Vị trí của thùng được xác định bằng cách gọi phương thức hashcode (). Hashtable chứa các giá trị dựa trên khóa.
//        Nó chỉ chứa các phần tử duy nhất.
//        Nó có thể không có bất kỳ khóa hoặc giá trị rỗng nào.
//        Nó được đồng bộ hóa.
//        Nó là một lớp kế thừa.
public class Main {

    static void insertAndPrint(AbstractMap<Integer, String> map)
    {
        int[] array= {1, -1, 0, 2,-2};
        for (int x: array)
        {
            map.put(x, Integer.toString(x));
        }
        for (int k: map.keySet())
        {
            System.out.print(k + ", ");
        }
        System.out.println();
    }

    // Driver method to test above method
    public static void main (String[] args)
    {
        //HashMap
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        insertAndPrint(map);
        //LinkedHashMap
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<Integer, String>();
        insertAndPrint(map1);
        //TreeMap
        TreeMap<Integer, String> map2 = new TreeMap<Integer, String>();
        insertAndPrint(map2);
    }
}
