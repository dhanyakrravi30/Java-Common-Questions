public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {2, 3,4};
        int n = 4;

        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int num : nums) {
            arraySum += num;
        }

        int missingnumber = totalSum - arraySum;
        System.out.println("Missing Number: " + missingnumber);
    }
}


//Missing Number: 1