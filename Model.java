// You are using Java
import java.util.Scanner;

class Model {
    public static void main(String a[]){
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        int training = scn.nextInt();
        int batch = scn.nextInt();
        float rate = scn.nextFloat();
        boolean status = scn.nextBoolean();
        
        System.out.println("Model Name: " + name);
        System.out.println("Training Epochs: " + training);
        System.out.println("Batch Size: " + batch);
        System.out.println("Learning Rate: " + String.format("%.2f", rate)); //to roundoff to two decimal
        System.out.println("Training Successful: " + status);
    }
}