public class MinMaxCalculation {

    /**
     * 
     * @param arr input from the user
     * @return minumum value
     * @description function to calculate minimum of an array
     */
    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    /**
     * 
     * @param arr input from the user
     * @return minumum value
     * @description function to calculate maximum of an array
     */
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
