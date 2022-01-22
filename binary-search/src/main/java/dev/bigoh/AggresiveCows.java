package dev.bigoh;

public class AggresiveCows {


    public int findMaxMinimum(int[] containers, int noOfCows){
        if(noOfCows > containers.length){
            return -1;
        }
        int start = 1;
        int end = (containers[containers.length-1]-containers[0])/noOfCows;
        int size = end;
        while (start <= end){
            int mid = start + (end-start)/2;
            boolean isMidPossible = isPossible(containers,noOfCows,mid);
            if(isMidPossible && (mid == size || !isPossible(containers,noOfCows,mid+1))){
                return mid;
            }
            if(isMidPossible){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }

    private boolean isPossible(int[] containers, int noOfCows, int minDistance){
        int requiredDistance = containers[0];
        for(int currDistance :containers){
            if(requiredDistance <= currDistance){
                noOfCows--;
                if(noOfCows == 0){
                    return true;
                }
                requiredDistance += minDistance;
            }
        }
        return false;
    }
}