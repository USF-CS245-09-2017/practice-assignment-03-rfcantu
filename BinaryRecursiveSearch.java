public class BinaryRecursiveSearch implements Practice03Search {

    public String searchName() {

        return "recursive"; // returns the type of function it is performing

    }

    public int search(int[] arr, int target) {

        return search(arr, target, 0, arr.length - 1); // method overloads to second search function

    }

    public int search(int[] arr, int target, int start, int end) {

        int mid = (start + end) / 2; // gets middle point of array

        if (end < start) {

            return -1; // target could not be found

        }
        if (arr[mid] == target) {

            return mid; // target was found

        }

        else if (target < arr[mid]) {

            return search(arr, target, start, mid - 1); // recall search with the right half of the array gone

        }

        else {

            return search(arr, target, mid + 1, end); // recall search with left half of the array gone

        }
    }

}