import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter a number to check whether the number is odd or even");
        int num = object.nextInt();
        object.close();

        if (num % 2 == 0) {
            System.out.println("The number "+num+" is an even number" );
            
        } else {
            System.out.println("The number "+num+" is a odd number" );
        }
    }
}