
package bankAccount;
import java.util.*;


class Main {

    public static int ArrayChallenge(int[] arr) {
        boolean increasing = false;
        boolean decreasing = false;
        
        // Check for the point where the trend changes
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                if (decreasing) {
                    return i - 1; // return the last index of the increasing sequence
                }
                increasing = true;
            } else if (arr[i] < arr[i - 1]) {
                if (increasing) {
                    return i - 1; // return the last index of the decreasing sequence
                }
                decreasing = true;
            }
        }
        
        return -1; // No change in sequence
    }

    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
        // Example input for testing, you can modify it as needed
        int[] input = {5,4,3,2,10,11}; // Example 1
        // int[] input = {5, 4, 3, 2, 10, 11}; // Example 2
        System.out.print(ArrayChallenge(input));
    }
}
