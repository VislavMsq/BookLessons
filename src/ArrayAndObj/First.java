package ArrayAndObj;

public class First {
    // First class with field - integer array:
    int [] nums;
    // Class field - array variable and constructor

    public First(int n) {
        // Create an array and bind it with field - array variable:
        nums = new int [n];
        nums[0] = 1;
        nums[1] = 1;
        // Filling the array with Fibonacci numbers:
        for (int i = 2; i < n; i++) {
            nums[i] = nums[i - 1] + nums[i -2];
        }
    }
    // Method for displaying the contents of the array:
    public void show(){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
