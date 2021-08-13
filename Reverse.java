import java.util.Scanner;

public class Reverse {

    public String getInput(){
        Scanner object = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = object.nextLine();
        System.out.println("Your String is :  "+ str );
        object.close();
        return str;
    }
    

    public String reverseTheString(String string){
        StringBuilder rev = new StringBuilder();

        for (int i = string.length()-1; i>=0; i--) {
            rev.append(string.charAt(i));
            }
        return rev.toString();
    }

    public void getOutput(String rev){
        System.out.println("The reversed String is "+ rev);
    }

  

    public static void main(String[] args) {
        Reverse ob = new Reverse();
        String str = ob.getInput();
        String rev = ob.reverseTheString(str);
        ob.getOutput(rev);
    }
    
}
