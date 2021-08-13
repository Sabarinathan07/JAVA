import java.util.Scanner;

class Palindrome {
    
    public boolean isPalindrome(int x){
        int rem = 0, sum = 0, temp = x;
        while (x > 0) {
            rem = x % 10;
            sum = sum * 10 + rem;
            x = x / 10;
        }

        if (temp == sum) {
            return true;
            
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check whether the number is palindrome or not");
        int x = in.nextInt();
        Palindrome ob = new Palindrome();
        System.out.println(ob.isPalindrome(x));
    }
}
