import java.util.Scanner;

public class PrimeTest {
    
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number to check whether the number is prime or not : ");
        int num = ob.nextInt();
        int n = num/2;
        ob.close();
        int flag = 0;

        for(int i=2; i <= n; i++){
            if(num % i == 0){
                System.out.println("The number "+ num +" is a consonant");
                flag = 1;
                break;
            }
        }
        if(num == 0 || num == 1){
            System.out.println("The number "+num+" is neither prime nor consonant");
        }
        else if (flag == 0) {
            System.out.println("The number "+ num + " is a prime number"); 
        }
    }
}
