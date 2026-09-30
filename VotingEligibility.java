import java.util.*;

class VotingEligibility {
    public static void main(String[] args){
        int age = new Scanner(System.in).nextInt();
        try{
            if(age < 18) throw new Exception();
            System.out.print("Eligible for vote.");
              } catch (Exception e){
                System.out.println("Not eligible for vote.");
              }
    }

    
}
