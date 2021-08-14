public class SelectionSort {

    public static void SelectionSort(int[] arr, int len) {
        for (int i = 0; i < len-1; i++) {
            int index = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }

            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            // for (int k = 0; k < len; k++) {
            //     System.out.print(arr[k] + " ");
            // }
            // System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 2, 4, 1, 3, 5 };
        System.out.println("Array before sorting");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println("\n Array after sorting ");

        SelectionSort(arr1, arr1.length);

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
