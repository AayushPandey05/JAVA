import java.util.Scanner;

public class whileloop{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int org = scn.nextInt();
        
        int n = org;
        int count = 0;
        
        while(n > 0){
            int digit = n % 10;
            if(digit % 2 == 0) {
                count++;
            }
            
            n = n / 10;
        }
        
        if(count == 0){
            System.out.println("There are no even digits in the number.");
        }
        
        else if(org % count == 0){
            System.out.println("It is a divisor of the original number.");
        }
        
        else{
            System.out.println("It is not a divisor of the original number.");
        }
    }
}