class Solution {
    public int totalh(int[] piles,int h,int mid,int n){
        long reqt=0;
        for(int i=0;i<n;i++){
            reqt+=(int)Math.ceil((double)piles[i] / mid);
        }
        return reqt;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int low=1;
        int high = Arrays.stream(piles).max().getAsInt();
        int mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(totalh(piles,h,mid,n)<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}