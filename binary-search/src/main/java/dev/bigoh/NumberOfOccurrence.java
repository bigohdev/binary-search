package dev.bigoh;

public class NumberOfOccurrence {
    public int driverCode(int[] input, int key){
        int start = 0 ;
        int end = input.length-1;
        int size = end;
        int firstOccurrence = binarySearch(input,start,end,size,key,true);
        if(firstOccurrence == -1){
            return 0;
        }
        int lastOccurrence = binarySearch(input,firstOccurrence,end,size,key,false);
        return lastOccurrence-firstOccurrence+1;
    }
    private int binarySearch(int[] input, int start, int end, int size, int key, boolean isFirstOccurrence){
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(input[mid] == key){
                if(isFirstOccurrence){
                    if (mid == 0 || input[mid - 1] != key) {
                        return mid;
                    }
                    end = mid - 1;
                }else {
                    if (mid == size || input[mid + 1] != key) {
                        return mid;
                    }
                    start = mid + 1;
                }
            }else if(input[mid] < key){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
