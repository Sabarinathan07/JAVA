import java.util.Scanner;

class ReverseNum {

    public int reverse(int x){
        boolean isNegative = x < 0 ? true : false;
        if(isNegative){
            x = x * -1;
        }
        int revNum = 0, prevRevNum = 0;
        while(x > 0){
            int currentNum = x % 10;
            revNum = revNum * 10 + currentNum;

            if ((revNum - currentNum)/10 != prevRevNum) {
                return 0;
            }
            prevRevNum = revNum;
            x = x / 10;
        }
        return isNegative == true ? revNum * -1 : revNum;
    }
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number to be reversed");
        int x = ob.nextInt();
        ob.close();
        ReverseNum reverseNum = new ReverseNum();
        System.out.println(reverseNum.reverse(x));

    }
}
