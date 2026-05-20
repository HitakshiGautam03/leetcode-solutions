class Solution {
    public boolean possible(int[] bloomDay,int m,int k,int day,int n){
        int count=0;
        int nob=0;
        for(int i=0;i<n;i++){
            if(bloomDay[i]<=day){
                count++;
            }
            else{
                nob+=count/k;
                count=0;
            }
        }
        nob+=count/k;
        if(nob>=m) return true;
        else return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(n<(long)m*k) return -1;
        int low=Arrays.stream(bloomDay).min().getAsInt();
        int high=Arrays.stream(bloomDay).max().getAsInt();
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(bloomDay,m,k,mid,n)==true){
                int ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}