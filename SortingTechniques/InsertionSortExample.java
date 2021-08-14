public class InsertionSortExample {  
    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++ ){
            // System.out.println(i);
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
    }
       
    public static void main(String a[]){    
        int[] arr1 = {2,4,1,3,8,5};    
        System.out.println("Before Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr1);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
    }    
}    
