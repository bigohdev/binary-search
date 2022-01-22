package dev.bigoh;

public class FirstAndLastOccurrence {
    public int[] driverCode(int[] input, int key){
        int start = 0 ;
        int end = input.length-1;
        int size = end;
        int firstOccurrence = binarySearch(input,start,end,size,key,true);
        if(firstOccurrence == -1){
            return new int[]{-1,-1};
        }
        int lastOccurrence = binarySearch(input,firstOccurrence,end,size,key,false);
        return new int[]{firstOccurrence,lastOccurrence};
    }
    private int binarySearchOld(int[] input, int start, int end, int size, int key, boolean isFirstOccurrence){
        if(isFirstOccurrence) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (input[mid] == key && (mid == 0 || input[mid - 1] != key)) {
                    return mid;
                }
                if (input[mid] < key) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        if(!isFirstOccurrence) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (input[mid] == key && (mid == size || input[mid + 1] != key)) {
                    return mid;
                }
                if (input[mid] <= key) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
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
