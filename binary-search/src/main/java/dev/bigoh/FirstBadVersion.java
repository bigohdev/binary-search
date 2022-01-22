package dev.bigoh;

public class FirstBadVersion {
    private int firstBadVer;

    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while (start <= end){
            int mid = start + (end-start)/2;
            boolean isMidPossible = isBadVersion(mid);
            if(isMidPossible && (mid == 1 || !isBadVersion(mid-1))){
                return mid;
            }
            if(!isMidPossible){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
    private boolean isBadVersion(int num){
        return num >= firstBadVer;
    }

    public void setFirstBadVer(int firstBadVer) {
        this.firstBadVer = firstBadVer;
    }
}
