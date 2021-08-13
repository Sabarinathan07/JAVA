import java.util.*; 
  
class Sorter { 
    static void sorting(int arr[], int n) 
    { 
       
    int[] evenArr= {}; 
    int[] oddArr = {};
        
        for (int i = 0; i < n; i++) { 
            if (i % 2 != 1) { 
                evenArr.add(arr[i]); 
            } 
            else { 
                oddArr.add(arr[i]); 
            } 
        } 
  
        Collections.sort(evenArr); 
        Collections.sort(oddArr, Collections.reverseOrder()); 
  
        int i = 0; 
        for (int j = 0; j < evenArr.size(); j++) { 
            arr[i++] = evenArr.get(j); 
        } 
        for (int j = 0; j < oddArr.size(); j++) { 
            arr[i++] = oddArr.get(j); 
        } 
    } 

    public static void main(String[] args) 
    { 
        int arr[] = { 1, 5, 8, 9, 6, 7, 3, 4, 2, 0 }; 
        int n = arr.length; 
        sorting(arr, n); 
        for (int i = 0; i < n; i++) { 
            System.out.print(arr[i] + " "); 
        } 
    } 
} 