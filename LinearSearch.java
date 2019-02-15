public class LinearSearch implements Practice03Search {

    public String searchName() {

        return "linear";

    }

    public int search(int[] arr, int target) {

     // for every value in arr
    for (int i = 0; i < arr.length; i++) {

        if (arr[i] == target) {

            return i; // target was found//

        }

    }

    return -1; // target was not found

    }
}