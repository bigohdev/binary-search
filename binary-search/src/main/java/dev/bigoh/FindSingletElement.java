package dev.bigoh;

public class FindSingletElement {
    public int binarySearch(int[] input){
        int start = 0 ;
        int end = input.length-1;
        int size = end;
        while (start <= end){
            int mid = start + (end - start + 1)/2;
            if(mid > 0 && input[mid-1] == input[mid]){
                mid--;
            }
            if((mid == size) || (input[mid] != input[mid+1])){
                return mid;
            }
            if(mid == size-1){
                return  -1;
            }
            if( mid % 2 == 0){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
