package Day2.ClassInheritance;

//4
//Understanding Object Oriented
//- Basic OOP
//- Class and Object
//- Stack + Heap , reference variables
//- Class Inheritance
//- Interface
//- Abstract

public class Main {
    public static void main(String[] args) {
        SamSung mySam = new SamSung();//Object
        mySam.manufacture();
        System.out.println(mySam.modelName+" Run on "+ mySam.system + " operating system ") ;//reference variables
    }
}

