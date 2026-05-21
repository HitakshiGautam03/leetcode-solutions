class Solution {
    public boolean possible(int[] weights,int days,int capacity,int n){
        int sum=0;
        int count=1;
        for(int i=0;i<n;i++){
            if(sum+weights[i]>capacity){
                count++;
                sum=weights[i];
            }
            else{
                sum+=weights[i];
            }
        }
        if(count<=days) return true;
        else return false;
    }
    public int shipWithinDays(int[] weights, int days) {
      int n=weights.length;
      int low=Arrays.stream(weights).max().getAsInt();
      int high=Arrays.stream(weights).sum();
      while(low<=high){
        int mid=(low+high)/2;
        if(possible(weights,days,mid,n)){
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