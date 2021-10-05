package length.of.longest.consecutive.elements.sequence;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] numbers = {9, 8, 100, 4, 200, 1, 3, 2, 55, 88, 12, 5, 99, 6, 77};
        System.out.println(longestConsecutive(numbers));

    }

    //method for finding the longest consecutive sequence length
    public static int longestConsecutive(int[] nums) {

        //defining a hashset for our problem solution
        HashSet<Integer> numberSet = new HashSet<>();

        //adding the numbers in "nums" array to the hashset using a for each loop
        for (int num : nums) {
            numberSet.add(num);
        }

        //declaring an integer variable for maximum sequence length and setting its initial value to "0"
        int maxSequenceLength = 0;

        //using a for each loop to iterate through the numbers in "nums" array
        for (int num : nums) {
            int currentNum = num;
            int currentSequenceLength = 1;

            //passing an if condition to filter the smallest numbers present in the consecutive sequences
            if (!numberSet.contains(currentNum - 1)) {
                while (numberSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentSequenceLength += 1;
                }

                //using the Math class's ".max()" method to get maximum values of the sequences
                maxSequenceLength = Math.max(maxSequenceLength, currentSequenceLength);
            }

        }

        //returning the maximum sequence length
        return maxSequenceLength;
    }

}
