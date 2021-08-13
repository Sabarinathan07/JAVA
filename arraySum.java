import java.util.Arrays;
import java.util.Scanner;

class arraySum {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {

                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter how many numbers you are going to enter");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i+1) + " number : ");
            int num = in.nextInt();
            arr[i] = num;
        }
        System.out.println("Enter the target");
        int target = in.nextInt();
        in.close();
        arraySum sol = new arraySum();

        int[] array = sol.twoSum(arr, target);
        System.out.println(Arrays.toString(array));
    }
}