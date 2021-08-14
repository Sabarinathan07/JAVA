import java.util.Arrays;

class BinarySearchExample{  
    public static void binarySearch(int arr[], int first, int last, int key){  
      int mid = (first + last)/2;  
      while( first <= last ){  
         if ( arr[mid] < key ){  
           first = mid + 1;     
         }else if ( arr[mid] == key ){  
           System.out.println("Element is found at index: " + (mid+1));  
           break;  
         }else{  
            last = mid - 1;  
         }  
         mid = (first + last)/2;  
      }  
      if ( first > last ){  
         System.out.println("Element is not found!");  
      }  
    }  
    public static void main(String args[]){  
           int arr[] = {20,60,80,40,10,50,30,90,1,3,5,7,5,34,2,45,1};  
           int key = 30;  
           Arrays.sort(arr);
           for(int i =0;i<=arr.length-1;i++){
               System.out.println(arr[i]+" ");
           }
           int last=arr.length-1;  
           binarySearch(arr,0,last,key);     
    }  
   }  