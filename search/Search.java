package search;

public class Search {
    
    // ★ linear search
    // worst case: O(n) (start of list)
    // best case: O(1) (end of list/not found)
    boolean linearSearch(int[] arr, int element) {
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == element) {
                return true;
            }
        }
        return false;
    }

    // ★ binary search (recursive)
    // running time: O(log n) 
    boolean binarySearch(int[] arr, int element, int start, int end) {
        if (arr.length <= 0 || start > end) {
            return false;
        }

        int middle = (start+end)/2;

        if (arr[element] == arr[middle]) {
            return true;
        } else if (arr[middle] < element) {
            return binarySearch(arr, element, middle+1, end);
        } else if (arr[middle] > element) {
            return binarySearch(arr, element, start, middle-1);
        }

        return false;

    }

}
