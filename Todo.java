
import java.util.*;

public class Todo {


    

    private static List<String> currentList = new ArrayList<String>();

    public static void main(String[] args) {
        String menuString = " ";
        menuString = menu();

       if(menuString == "./todo ls"){
                    showList();
       }elseif(menuString == "./")

       

        // int menuItem = -1;
        // while (menuItem != 0) {
        //     menuItem = menu();
        //     switch (menuItem) {
        //     case 1:
        //         showList();
        //         break;
        //     case 2:
        //         addItem();
        //         break;
        //     case 3:
        //         removeItem();
        //         break;
        //     case 0:
        //         break;
        //     default:
        //         System.out.println("Enter a valid option");
        //     }
        // }
    }

    public static String menu() {
       
        System.out.println("./todo add \"add item\"");
        System.out.println("./todo ls");
        System.out.println("./todo del NUMBER");
        System.out.println("./todo done NUMBER");
        System.out.println("./todo help");
        System.out.println("./todo report");

        //System.out.print("Enter choice: ");
        String choice;
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextLine();
        return choice;
    }

    public static void showList() {
       
        System.out.println("To-Do List");
        int number = 0;
        for (String item : currentList) {
            System.out.println(++number + " " + item);
        }
        
        // for (int i = currentList.size() ;i>=1;i--) 
	    //   { 		      
              
	    //       System.out.println(currentList.get(i-1)); 		
	    //   }   
    


    }

    public static void addItem() {
        System.out.println("Add Item");
        
        System.out.print("Enter an item: ");
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        //currentList.add(item);
        currentList.add(0, item);
        showList();
    }

    public static void removeItem() {
        System.out.println("Remove Item");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("What do you want to remove?");
        int index = scanner.nextInt();
        if((index-1)<0 || index>currentList.size()) {
            System.out.println("Wrong index number! Please enter in range of 1 to "+currentList.size());            
        }else {
            currentList.remove(index-1);
        }
        
        showList();


    }
}