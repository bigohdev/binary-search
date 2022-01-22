package dev.bigoh;

public class FindPosition {
    public int binarySearch(int[] input,int key){
        int start = 0;
        int end = input.length-1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (input[mid] == key) {
                    return mid;
                }
                if (input[mid] < key) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return start;
        }
}
