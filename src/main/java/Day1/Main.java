package Day1;

//2
//Java Basic
//- Variables
//- Data Types
//- Working with array
//- Control Flow with if-else, switch case
//3
//Understanding Method in Java
//- Method in Java
//- Method visibility
//- Understanding instance vs static
public class Main {
    static int[] array = {1,2, 3, 5,4, 1, 3, 4,5, 4, 5,9,7,0,11, 13,10,23};
    public static void main(String args[]){
        int[] array = {1,2, 3, 5,4, 1, 3, 4,5, 4, 5,9,7,0,11, 13,10,23};
        System.out.println("Sum of elements in array:" + sum(array));
        System.out.println(
                "Sum of elements that are primes in array:" + sumPrime(array));
        System.out.println("Set of 3 in a row:" );
        setRow();
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Looking forward to the Weekend");
        }

    }
    private static int sum(int [] array) {
        int sum = 0;
        for( int n : array) {
            sum = sum+n;
        }
        return sum;
    }
    private static int sumPrime (int [] array) {
        int sum = 0;
        for( int i : array) {
            if (isPrimeNumber(i)) {
                sum = sum + i ;
            }
        }
        return sum;
    }
    public static void setRow () {
        for( int i = 0 ; i < array.length-2;i++) {
            if (array[i]+array[i+1]==array[i+2]) {
                System.out.print( array[i]);
                System.out.print(" "+array[i+1]);
                System.out.println(" " + array[i+2]);
            }
        }
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}
