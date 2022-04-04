package Day4.ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String args[]){
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(001,"Đông",23));
        al.add(new Student(002,"Tây",27));
        al.add(new Student(003,"Nam",21));
        al.add(new Student(004,"Bắc",28));

        Collections.sort(al);
        for(Student st:al){
            System.out.println(st.id +" "+st.name+" "+st.age);
        }
    }
}
