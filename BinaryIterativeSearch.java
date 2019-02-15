public class BinaryIterativeSearch implements Practice03Search {

    public String searchName() {

        return "iterative"; // returns the type of function it is performing

    }

    public int search(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = (start + end) / 2; // mid is the middle point of the array

            if (target < arr[mid]) {

                end = mid - 1; // cut off the right half of the array

            }

            if (target > arr[mid]) {

                start = mid + 1; // cut off the left hand of the array

            }

            if (target == arr[mid]) {

                return mid; // we have found the target

            }

        }

    return -1; // return -1 when you do not find the target

    }

}