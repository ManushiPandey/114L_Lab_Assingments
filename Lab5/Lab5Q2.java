public class Lab5Q2 {

    public static void main(String[] args) {

        int[] nums = {4, 1, 2, 1, 2};

        int result = 0;

        // using XOR to find single number
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }

        System.out.println("Single number is: " + result);
    }
}