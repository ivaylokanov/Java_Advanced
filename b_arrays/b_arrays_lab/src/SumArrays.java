import java.util.Scanner;

/**
 * Created by kanov on 1/8/2017.
 */
public class SumArrays {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] arr = console.nextLine().split(" ");
        Integer[] nums = new Integer[arr.length];
        Integer[] calcuator = new Integer[nums.length - 1];
        int sum = 0;
        int n = nums.length;

            for (int i = 0; i < nums.length; i++) {
                nums[i] = Integer.parseInt(arr[i]);

            }
            if (n > 1) {
            while (n != 1) {
                for (int j = 0; j < n - 1; j++) {
                    calcuator[j] = nums[j] + nums[j + 1];
                    nums[j] = calcuator[j];
                    sum = nums[j];
                }
                n--;
            }
            System.out.println(sum);
        }else{

            System.out.println(nums[0]);
        }

    }
}
