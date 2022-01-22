package dev.bigoh;

public class FindSmallestInRotatedArray {
    public int binarySearch(int[] input){
        int start = 0 ;
        int end = input.length-1;
        while (start <= end){
            int mid = start + (end - start+1)/2;
            int prevMid = ((mid-1) < 0) ? input.length-1 : mid-1;
            if(input[mid] < input[prevMid]){
                return mid;
            }
            if(input[mid] > input[0]){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return 0;
    }
}
