import java.util.*;

class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int[] a = {1, 2, 3, 4, 5};
        int p = sc.nextInt();
        try {
            System.out.println("Element = " + a[p]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array position.");
        }
    }
    
}
