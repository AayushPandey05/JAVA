import java.util.Scanner;

class Main {
    public static void main(String a[]){

        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();
        
        boolean half = (num1 + num3) / 2 == num2;
        System.out.println(half);
        if(half){
            System.out.println("The second integer is halfway between the first and third integers.");
        }
        else{
            System.out.println("The second integer is not halfway between the first and third integers.");
        }
    }
}