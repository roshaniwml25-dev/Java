import java.util.*;

class ValidMarks {
    public static void main(String[] args){
        int marks = new Scanner(System.in).nextInt();
        try{
            if(marks < 0 || marks > 100) throw new Exception();
            System.out.println("Valid Marks.");
        } catch (Exception e){
            System.out.println("Invalid Marks.");
        }
    }
}
