package search;

public class Search {
    
    // worst case O(n) (start of list)
    // best case O(1) (end of list)
    boolean linearSearch(int[] arr, int element) {
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == element) {
                return true;
            }
        }
        return false;
    }
}
