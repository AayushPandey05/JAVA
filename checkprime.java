import java.util.*;
public class checkprime{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int startrange = scn.nextInt();
        int endrange = scn.nextInt();

        for(int i = startrange; i <= endrange; i++) {
            boolean isPrime = true;
            
            if(i <= 1){
                isPrime = false;
            }

            else{
                for(int j = 2; j * j <= i; j++){
                    if(i % j == 0){
                        isPrime = false;
                    }
                }
            }

            if(isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}